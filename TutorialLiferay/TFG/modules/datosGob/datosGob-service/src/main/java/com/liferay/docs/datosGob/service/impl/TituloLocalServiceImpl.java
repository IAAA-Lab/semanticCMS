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

import com.liferay.docs.datosGob.exception.NoSuchTituloException;
import com.liferay.docs.datosGob.model.Titulo;
import com.liferay.docs.datosGob.service.base.TituloLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the titulo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.datosGob.service.TituloLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see TituloLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.TituloLocalServiceUtil
 */
public class TituloLocalServiceImpl extends TituloLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.datosGob.service.TituloLocalServiceUtil} to access the titulo local service.
	 */
	
public Titulo addDescripcion(String datasetId, String titu, ServiceContext serviceContext) throws PortalException {
		
		long entryId = counterLocalService.increment();
		
		long groupId = serviceContext.getScopeGroupId();

		validate(titu);

		Titulo titulo = tituloPersistence.create(entryId);

		titulo.setGroupId(groupId);
		titulo.setTitulo(titu);
		titulo.setDatasetId(datasetId);
		

		tituloPersistence.update(titulo);

		return titulo;

	}
	
	
	
	public List<Titulo> getTitulos(long groupId, String datasetId) {
	    return tituloPersistence.findByT_D(datasetId, groupId);
	}

	public List<Titulo> getTitulos(long groupId, String datasetId, int start, int end)
	    throws SystemException {

	    return tituloPersistence.findByT_D(datasetId, groupId, start, end);
	}

	public List<Titulo> getTitulos(
	    long groupId, String datasetId, int start, int end, OrderByComparator<Titulo> obc) {

	    return tituloPersistence.findByT_D( datasetId,groupId, start, end, obc);
	}

	public int getTitulosCount(long groupId, String coleccionId) {
	    return tituloPersistence.countByT_D(coleccionId, groupId);
	}
	
	
	
	
	
	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new NoSuchTituloException();
		}
	}
}