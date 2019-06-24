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

import com.liferay.docs.datosGob.exception.NoSuchDatasetException;
import com.liferay.docs.datosGob.model.Dataset;
import com.liferay.docs.datosGob.service.base.DatasetLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the dataset local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.docs.datosGob.service.DatasetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see DatasetLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.DatasetLocalServiceUtil
 */
public class DatasetLocalServiceImpl extends DatasetLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.liferay.docs.datosGob.service.DatasetLocalServiceUtil} to access the
	 * dataset local service.
	 */

	public Dataset addDataset(String datasetId, String homepage, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		validate(datasetId);

		Dataset dataset = datasetPersistence.create(datasetId);

		dataset.setUuid(serviceContext.getUuid());
		dataset.setGroupId(groupId);
		dataset.setHomepage(homepage);

		datasetPersistence.update(dataset);

		return dataset;

	}

	public Dataset deleteDataset(String datasetId, ServiceContext serviceContext) throws PortalException {

		Dataset dataset = getDataset(datasetId);

		dataset = deleteDataset(datasetId);

		return dataset;
	}
	
	
	
	public List<Dataset> getDatasets(long groupId, String coleccionId) {
	    return datasetPersistence.findByD_D(groupId, coleccionId);
	}

	public List<Dataset> getDatasets(long groupId, String coleccionId, int start, int end)
	    throws SystemException {

	    return datasetPersistence.findByD_D(groupId, coleccionId, start, end);
	}

	public List<Dataset> getDatasets(
	    long groupId, String coleccionId, int start, int end, OrderByComparator<Dataset> obc) {

	    return datasetPersistence.findByD_D(groupId, coleccionId, start, end, obc);
	}

	public int getDatasetsCount(long groupId, String coleccionId) {
	    return datasetPersistence.countByD_D(groupId, coleccionId);
	}
	
	
	
	

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new NoSuchDatasetException();
		}
	}
}