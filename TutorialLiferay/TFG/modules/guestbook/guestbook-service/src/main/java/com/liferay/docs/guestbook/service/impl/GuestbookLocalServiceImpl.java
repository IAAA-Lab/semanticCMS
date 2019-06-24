/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.guestbook.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.Triple;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.iterator.ExtendedIterator;
import org.apache.jena.vocabulary.RDF;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.docs.guestbook.exception.GuestbookNameException;
import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.service.EntryLocalServiceUtil;
import com.liferay.docs.guestbook.service.base.GuestbookLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the guestbook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.docs.guestbook.service.GuestbookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see GuestbookLocalServiceBaseImpl
 * @see com.liferay.docs.guestbook.service.GuestbookLocalServiceUtil
 */

public class GuestbookLocalServiceImpl extends GuestbookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.liferay.docs.guestbook.service.GuestbookLocalServiceUtil} to access the
	 * guestbook local service.
	 */
	public String URI = "http://localhost:8080/web/guest/home/-";

	@Indexable(type = IndexableType.REINDEX)
	public Guestbook addGuestbook(long userId, String name, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name);

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook = guestbookPersistence.create(guestbookId);

		guestbook.setUuid(serviceContext.getUuid());
		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());
		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);

		resourceLocalService.addResources(user.getCompanyId(), groupId, userId, Guestbook.class.getName(), guestbookId,
				false, true, true);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, groupId, guestbook.getCreateDate(),
				guestbook.getModifiedDate(), Guestbook.class.getName(), guestbookId, guestbook.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, true, null, null, null,
				null, ContentTypes.TEXT_HTML, guestbook.getName(), null, null, null, null, 0, 0, null);

		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		return guestbook;

	}

	@Indexable(type = IndexableType.REINDEX)
	public Guestbook updateGuestbook(long userId, long guestbookId, String name, ServiceContext serviceContext)
			throws PortalException, SystemException {

		Date now = new Date();

		validate(name);

		Guestbook guestbook = getGuestbook(guestbookId);

		User user = userLocalService.getUser(userId);

		guestbook.setUserId(userId);
		guestbook.setUserName(user.getFullName());
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);

		resourceLocalService.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
				Guestbook.class.getName(), guestbookId, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions());

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(guestbook.getUserId(), guestbook.getGroupId(),
				guestbook.getCreateDate(), guestbook.getModifiedDate(), Guestbook.class.getName(), guestbookId,
				guestbook.getUuid(), 0, serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true,
				true, guestbook.getCreateDate(), null, null, null, ContentTypes.TEXT_HTML, guestbook.getName(), null,
				null, null, null, 0, 0, serviceContext.getAssetPriority());

		assetLinkLocalService.updateLinks(serviceContext.getUserId(), assetEntry.getEntryId(),
				serviceContext.getAssetLinkEntryIds(), AssetLinkConstants.TYPE_RELATED);

		return guestbook;
	}

	@Indexable(type = IndexableType.DELETE)
	public Guestbook deleteGuestbook(long guestbookId, ServiceContext serviceContext)
			throws PortalException, SystemException {

		Guestbook guestbook = getGuestbook(guestbookId);

		List<Entry> entries = entryLocalService.getEntries(serviceContext.getScopeGroupId(), guestbookId);

		for (Entry entry : entries) {
			entryLocalService.deleteEntry(entry.getEntryId());
		}

		guestbook = deleteGuestbook(guestbook);

		resourceLocalService.deleteResource(serviceContext.getCompanyId(), Guestbook.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, guestbookId);

		AssetEntry assetEntry = assetEntryLocalService.fetchEntry(Guestbook.class.getName(), guestbookId);

		assetLinkLocalService.deleteLinks(assetEntry.getEntryId());

		assetEntryLocalService.deleteEntry(assetEntry);

		return guestbook;
	}

	public String toJSONLD(long groupId) {

		Model modelo = ModelFactory.createDefaultModel();

		List<Guestbook> gbs = guestbookPersistence.findByGroupId(groupId);
		crearModeloGB(gbs, modelo);

		Iterator<Guestbook> iterator = gbs.iterator();
		while (iterator.hasNext()) {
			crearModeloEntry(entryPersistence.findByG_G(groupId, iterator.next().getGuestbookId()), modelo);
		}

		// mostrar(modelo);

		// return "FUTURO JSON-LD";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		modelo.write(out, "JSON-LD");

		return new String(out.toByteArray());

	}

	public String gbToJSONLD(long groupId, long gb) {

		Model modelo = ModelFactory.createDefaultModel();

		List<Guestbook> gbs = new LinkedList<Guestbook>(guestbookPersistence.findByGroupId(groupId));
		Iterator<Guestbook> guestbook = gbs.iterator();
		int i = 0;
		while (guestbook.hasNext()) {
			long id = guestbook.next().getGuestbookId();
			if (id != gb) {
				// gbs.remove(i);
				gbs.remove(i);
			}
			i++;
		}
		crearModeloGB(gbs, modelo);

		Iterator<Guestbook> iterator = gbs.iterator();
		while (iterator.hasNext()) {
			crearModeloEntry(entryPersistence.findByG_G(groupId, iterator.next().getGuestbookId()), modelo);
		}

		// mostrar(modelo);

		// return "FUTURO JSON-LD";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		modelo.write(out, "JSON-LD");

		return new String(out.toByteArray());

	}

	public String entryToJSONLD(long groupId, long entryId) {

		Model entrada = ModelFactory.createDefaultModel();
		
		Model modelo = ModelFactory.createDefaultModel();

		List<Guestbook> gbs = guestbookPersistence.findByGroupId(groupId);
		crearModeloGB(gbs, modelo);

		Iterator<Guestbook> iterator = gbs.iterator();
		while (iterator.hasNext()) {
			crearModeloEntry(entryPersistence.findByG_G(groupId, iterator.next().getGuestbookId()), modelo);
		}
		
		Entry entry;
		try {
			entry = EntryLocalServiceUtil.getEntry(entryId);
			crearModeloEntry(entry, entrada, modelo);
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			entrada.write(out, "JSON-LD");

			return new String(out.toByteArray());
		} catch (PortalException e) {
			e.printStackTrace();
			return e.getMessage();
		}
		

	}

	public void mostrar(Model p) {
		System.out.println("----------");
		ExtendedIterator<Triple> salida = p.getGraph().find();
		System.out.println("Tamaño: " + p.getGraph().size());

		while (salida.hasNext()) {
			Triple tripleta = salida.next();
			System.out.println(tripleta.toString());

		}

		System.out.println("----------");
	}

	public void crearModeloGB(List<Guestbook> lista, Model model) {

		

		Property nameGB = model.createProperty(URI + "/gb" + ":name");
		//Property tipoGB = model.createProperty(URI + "/gb" + ":type");
		Property idGB = model.createProperty(URI + "/guestbooks/" + ":id");
		Resource GB = model.createResource(URI + ":guestbook");

		Guestbook guestbook;
		Iterator<Guestbook> iterator = lista.iterator();
		while (iterator.hasNext()) {

			guestbook = iterator.next();

			//Resource GB1 = model.createResource(URI + '/' + guestbook.getUuid());
			Resource GB1 = model.createResource(URI + "/guestbooks/" + guestbook.getGuestbookId());
			// model.add(GB1, nameGB, guestbook.getName());
			// model.add(GB1, idGB, Long.toString(guestbook.getGuestbookId()));
			// model.add(GB1, tipoGB, GB.toString());

			GB1.addProperty(nameGB, guestbook.getName());
			GB1.addProperty(idGB, Long.toString(guestbook.getGuestbookId()));
			//GB1.addProperty(tipoGB, GB.toString());
			model.add(GB1, RDF.type, GB.toString()) ;

		}

	}

	public void crearModeloEntry(Entry entrada, Model p, Model complete) {
		
		Property nameEn = p.createProperty(URI + "/gb" + ":name");
		//Property tipoEn = p.createProperty(URI + "/gb" + ":type");
		Property idEn = p.createProperty(URI + "/guestbooks/entry/" + ":idE");
		Property belongToEn = p.createProperty(URI + "/en" + ":belongTo");
		Property emailEn = p.createProperty(URI + ":email");
		Property messageEn = p.createProperty(URI + ":message");
		Resource entry = p.createResource(URI + ":entry");
		Property idGB = p.createProperty(URI + "/guestbooks/" + ":id");

		
		
		//Resource entry1 = p.createResource(URI + '/' + entrada.getUuid());
		Resource entry1 = p.createResource(URI + "/guestbooks/entry/" + entrada.getEntryId());
		
		entry1.addProperty(nameEn, entrada.getName());
		entry1.addProperty(idEn, Long.toString(entrada.getEntryId()));
		entry1.addProperty(emailEn, entrada.getEmail());
		entry1.addProperty(messageEn, entrada.getMessage());
		//entry1.addProperty(tipoEn, entry);
		p.add(entry1, RDF.type, entry) ;

		String gb = Long.toString(entrada.getGuestbookId());
		Node ideGb = NodeFactory.createLiteral(gb);
		ExtendedIterator<Triple> iter = complete.getGraph().find(Node.ANY, idGB.asNode(), ideGb);

		if (iter.hasNext()) {
			Triple tripleta = iter.next();
			entry1.addProperty(belongToEn, tripleta.getMatchSubject().toString());
		}


	}

	public void crearModeloEntry(List<Entry> lista, Model p) {

		Property nameEn = p.createProperty(URI + "/gb" + ":name");
		//Property tipoEn = p.createProperty(URI + "/gb" + ":type");
		Property idEn = p.createProperty(URI + "/guestbooks/entry/" + ":idE");
		Property belongToEn = p.createProperty(URI + "/en" + ":belongTo");
		Property emailEn = p.createProperty(URI + ":email");
		Property messageEn = p.createProperty(URI + ":message");
		Resource entry = p.createResource(URI + ":entry");
		Property idGB = p.createProperty(URI + "/guestbooks/" + ":id");

		Entry entrada;
		Iterator<Entry> iterator = lista.iterator();
		while (iterator.hasNext()) {

			entrada = iterator.next();

			
			//Resource entry1 = p.createResource(URI + '/' + entrada.getUuid());
			Resource entry1 = p.createResource(URI + "/guestbooks/entry/" + entrada.getEntryId());
			
			entry1.addProperty(nameEn, entrada.getName());
			entry1.addProperty(idEn, Long.toString(entrada.getEntryId()));
			entry1.addProperty(emailEn, entrada.getEmail());
			entry1.addProperty(messageEn, entrada.getMessage());
			//entry1.addProperty(tipoEn, entry);
			p.add(entry1, RDF.type, entry) ;

			String gb = Long.toString(entrada.getGuestbookId());
			Node ideGb = NodeFactory.createLiteral(gb);
			ExtendedIterator<Triple> iter = p.getGraph().find(Node.ANY, idGB.asNode(), ideGb);

			if (iter.hasNext()) {
				Triple tripleta = iter.next();
				entry1.addProperty(belongToEn, tripleta.getMatchSubject().toString());
			}


		}

	}

	public List<Guestbook> getGuestbooks(long groupId) {

		return guestbookPersistence.findByGroupId(groupId);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end, OrderByComparator<Guestbook> obc) {

		return guestbookPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end) {

		return guestbookPersistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

		return guestbookPersistence.countByGroupId(groupId);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new GuestbookNameException();
		}
	}

}