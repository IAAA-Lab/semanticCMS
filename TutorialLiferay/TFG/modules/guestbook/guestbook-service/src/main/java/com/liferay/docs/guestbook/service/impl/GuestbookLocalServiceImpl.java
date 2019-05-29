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
// @jena-osgi-3.10.0.jar, @httpclient-osgi-4.5.5.jar, @httpcore-osgi-4.4.9.jar, @jsonlod-java-0.12.1.jar, @commons-csv-1.5.jar, @libthrift-0.10.0.jar, @jcl-over-slf4j-1.7.25.jar, @slf4j-api-1.7.25.jar, @commons-lang3-3.4.jar, @org.osgi.core-6.0.0.jar, @jackson-core-2.9.6.jar, @jackson-databind-2.9.6.jar, @commons-io-2.6.jar, @jackson-annotations-2.9.0.jar

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.Triple;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.iterator.ExtendedIterator;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.docs.guestbook.exception.GuestbookNameException;
import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.model.Guestbook;
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

		mostrar(modelo);

		// return "FUTURO JSON-LD";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		modelo.write(out, "JSON-LD");

		return new String(out.toByteArray());

	}

	public List<Guestbook> mockGuestbook() {

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook1 = guestbookPersistence.create(guestbookId);

		guestbook1.setGuestbookId(1);
		guestbook1.setUuid("aaa");
		guestbook1.setUserId(1);
		guestbook1.setGroupId(1);
		guestbook1.setCompanyId(1);
		guestbook1.setUserName("Jorge Bl");
		guestbook1.setCreateDate(new Date());
		guestbook1.setModifiedDate(new Date());
		guestbook1.setName("guestbook 1");

		long guestbookId2 = counterLocalService.increment();

		Guestbook guestbook2 = guestbookPersistence.create(guestbookId2);

		guestbook2.setGuestbookId(2);
		guestbook2.setUuid("aa");
		guestbook2.setUserId(2);
		guestbook2.setGroupId(2);
		guestbook2.setCompanyId(2);
		guestbook2.setUserName("Jorge Bl");
		guestbook2.setCreateDate(new Date());
		guestbook2.setModifiedDate(new Date());
		guestbook2.setName("guestbook 2");

		long guestbookId3 = counterLocalService.increment();

		Guestbook guestbook3 = guestbookPersistence.create(guestbookId3);

		guestbook3.setGuestbookId(3);
		guestbook3.setUuid("a");
		guestbook3.setUserId(3);
		guestbook3.setGroupId(3);
		guestbook3.setCompanyId(3);
		guestbook3.setUserName("Jorge Bl");
		guestbook3.setCreateDate(new Date());
		guestbook3.setModifiedDate(new Date());
		guestbook3.setName("guestbook 3");

		List<Guestbook> lista = new ArrayList<Guestbook>();
		lista.add(guestbook1);
		lista.add(guestbook2);
		lista.add(guestbook3);

		return lista;

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

		String URI = "www.example.org";

		Property nameGB = model.createProperty(URI + "/gb" + ":name");
		Property tipoGB = model.createProperty(URI + "/gb" + ":tipo");
		Property idGB = model.createProperty(URI + "/gb" + ":id");
		Resource GB = model.createResource(URI + ":guestbook");

		Guestbook guestbook;
		Iterator<Guestbook> iterator = lista.iterator();
		while (iterator.hasNext()) {

			guestbook = iterator.next();

			Resource GB1 = model.createResource(URI + '/' + guestbook.getUuid());

			// model.add(GB1, nameGB, guestbook.getName());
			// model.add(GB1, idGB, Long.toString(guestbook.getGuestbookId()));
			// model.add(GB1, tipoGB, GB.toString());

			GB1.addProperty(nameGB, guestbook.getName());
			GB1.addProperty(idGB, Long.toString(guestbook.getGuestbookId()));
			GB1.addProperty(tipoGB, GB.toString());

		}

	}

	public void crearModeloEntry(List<Entry> lista, Model p) {

		String URI = "www.example.org";

		Property nameEn = p.createProperty(URI + "/en" + ":name");
		Property tipoEn = p.createProperty(URI + "/en" + ":tipo");
		Property idEn = p.createProperty(URI + "/en" + ":id");
		Property belongToEn = p.createProperty(URI + "/en" + ":belongTo");
		Property emailEn = p.createProperty(URI + ":email");
		Property messageEn = p.createProperty(URI + ":message");
		Resource entry = p.createResource(URI + ":entry");
		Property idGB = p.createProperty(URI + "/gb" + ":id");

		Entry entrada;
		Iterator<Entry> iterator = lista.iterator();
		while (iterator.hasNext()) {

			entrada = iterator.next();

			Resource entry1 = p.createResource(URI + '/' + entrada.getUuid());
			entry1.addProperty(nameEn, entrada.getName());
			entry1.addProperty(idEn, Long.toString(entrada.getEntryId()));
			entry1.addProperty(emailEn, entrada.getEmail());
			entry1.addProperty(messageEn, entrada.getMessage());
			entry1.addProperty(tipoEn, entry);

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