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

package com.liferay.docs.datosGob.service.impl;

import java.util.List;

import com.liferay.docs.datosGob.exception.NoSuchColeccionException;
import com.liferay.docs.datosGob.model.Coleccion;
import com.liferay.docs.datosGob.service.base.ColeccionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the coleccion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.docs.datosGob.service.ColeccionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see ColeccionLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.ColeccionLocalServiceUtil
 */
public class ColeccionLocalServiceImpl extends ColeccionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.liferay.docs.datosGob.service.ColeccionLocalServiceUtil} to access the
	 * coleccion local service.
	 */
	public Coleccion addColeccion(String titulo, String homepage, ServiceContext serviceContext)
			throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		validate(titulo);
		validate(homepage);

		Coleccion coleccion = coleccionPersistence.create(homepage);

		coleccion.setUuid(serviceContext.getUuid());
		coleccion.setGroupId(groupId);
		coleccion.setTitulo(titulo);
		coleccion.setExpandoBridgeAttributes(serviceContext);

		coleccionPersistence.update(coleccion);

		return coleccion;

	}
	

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new NoSuchColeccionException();
		}
	}
	
	
	public List<Coleccion> getColecciones(long groupId) {

	    return coleccionPersistence.findByGroupId(groupId);
	}

	public List<Coleccion> getColecciones(long groupId, int start, int end, 
	    OrderByComparator<Coleccion> obc) {

	    return coleccionPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Coleccion> getColecciones(long groupId, int start, int end) {

	    return coleccionPersistence.findByGroupId(groupId, start, end);
	}

	public int getColeccionesCount(long groupId) {

	    return coleccionPersistence.countByGroupId(groupId);
	}

}