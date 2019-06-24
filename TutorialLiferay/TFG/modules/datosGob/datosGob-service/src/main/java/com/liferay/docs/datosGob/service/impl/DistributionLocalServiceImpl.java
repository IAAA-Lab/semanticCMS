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

import com.liferay.docs.datosGob.model.Distribution;
import com.liferay.docs.datosGob.model.Titulo;
import com.liferay.docs.datosGob.service.base.DistributionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * The implementation of the distribution local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.datosGob.service.DistributionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see DistributionLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.DistributionLocalServiceUtil
 */
public class DistributionLocalServiceImpl
	extends DistributionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.datosGob.service.DistributionLocalServiceUtil} to access the distribution local service.
	 */
	
	
	
	public List<Distribution> getDistributions(long groupId, String datasetId) {
	    return distributionPersistence.findByDi_D(groupId, datasetId);
	}

	public List<Distribution> getDistributions(long groupId, String datasetId, int start, int end)
	    throws SystemException {

	    return distributionPersistence.findByDi_D(groupId, datasetId, start, end);
	}

	public List<Distribution> getDistributions(
	    long groupId, String datasetId, int start, int end, OrderByComparator<Distribution> obc) {

	    return distributionPersistence.findByDi_D( groupId,datasetId, start, end, obc);
	}

	public int getDistributionsCount(long groupId, String coleccionId) {
	    return distributionPersistence.countByDi_D(groupId, coleccionId);
	}
	
	
}