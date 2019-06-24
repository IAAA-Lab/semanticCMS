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

package com.liferay.docs.datosGob.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.model.Distribution;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Distribution. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author liferay
 * @see DistributionLocalServiceUtil
 * @see com.liferay.docs.datosGob.service.base.DistributionLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.DistributionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DistributionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DistributionLocalServiceUtil} to access the distribution local service. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.DistributionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the distribution to the database. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Distribution addDistribution(Distribution distribution);

	/**
	* Creates a new distribution with the primary key. Does not add the distribution to the database.
	*
	* @param url the primary key for the new distribution
	* @return the new distribution
	*/
	@Transactional(enabled = false)
	public Distribution createDistribution(String url);

	/**
	* Deletes the distribution from the database. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Distribution deleteDistribution(Distribution distribution);

	/**
	* Deletes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param url the primary key of the distribution
	* @return the distribution that was removed
	* @throws PortalException if a distribution with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Distribution deleteDistribution(String url)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Distribution fetchDistribution(String url);

	/**
	* Returns the distribution matching the UUID and group.
	*
	* @param uuid the distribution's UUID
	* @param groupId the primary key of the group
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Distribution fetchDistributionByUuidAndGroupId(String uuid,
		long groupId);

	/**
	* Returns the distribution with the primary key.
	*
	* @param url the primary key of the distribution
	* @return the distribution
	* @throws PortalException if a distribution with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Distribution getDistribution(String url) throws PortalException;

	/**
	* Returns the distribution matching the UUID and group.
	*
	* @param uuid the distribution's UUID
	* @param groupId the primary key of the group
	* @return the matching distribution
	* @throws PortalException if a matching distribution could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Distribution getDistributionByUuidAndGroupId(String uuid,
		long groupId) throws PortalException;

	/**
	* Returns a range of all the distributions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @return the range of distributions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Distribution> getDistributions(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Distribution> getDistributions(long groupId, String datasetId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Distribution> getDistributions(long groupId, String datasetId,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Distribution> getDistributions(long groupId, String datasetId,
		int start, int end, OrderByComparator<Distribution> obc);

	/**
	* Returns the number of distributions.
	*
	* @return the number of distributions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDistributionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDistributionsCount(long groupId, String coleccionId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the distribution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Distribution updateDistribution(Distribution distribution);
}