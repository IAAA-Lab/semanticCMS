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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DistributionLocalService}.
 *
 * @author liferay
 * @see DistributionLocalService
 * @generated
 */
@ProviderType
public class DistributionLocalServiceWrapper implements DistributionLocalService,
	ServiceWrapper<DistributionLocalService> {
	public DistributionLocalServiceWrapper(
		DistributionLocalService distributionLocalService) {
		_distributionLocalService = distributionLocalService;
	}

	/**
	* Adds the distribution to the database. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was added
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution addDistribution(
		com.liferay.docs.datosGob.model.Distribution distribution) {
		return _distributionLocalService.addDistribution(distribution);
	}

	/**
	* Creates a new distribution with the primary key. Does not add the distribution to the database.
	*
	* @param url the primary key for the new distribution
	* @return the new distribution
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution createDistribution(
		String url) {
		return _distributionLocalService.createDistribution(url);
	}

	/**
	* Deletes the distribution from the database. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was removed
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution deleteDistribution(
		com.liferay.docs.datosGob.model.Distribution distribution) {
		return _distributionLocalService.deleteDistribution(distribution);
	}

	/**
	* Deletes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param url the primary key of the distribution
	* @return the distribution that was removed
	* @throws PortalException if a distribution with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution deleteDistribution(
		String url) throws com.liferay.portal.kernel.exception.PortalException {
		return _distributionLocalService.deleteDistribution(url);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _distributionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _distributionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _distributionLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _distributionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _distributionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _distributionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _distributionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.datosGob.model.Distribution fetchDistribution(
		String url) {
		return _distributionLocalService.fetchDistribution(url);
	}

	/**
	* Returns the distribution matching the UUID and group.
	*
	* @param uuid the distribution's UUID
	* @param groupId the primary key of the group
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution fetchDistributionByUuidAndGroupId(
		String uuid, long groupId) {
		return _distributionLocalService.fetchDistributionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the distribution with the primary key.
	*
	* @param url the primary key of the distribution
	* @return the distribution
	* @throws PortalException if a distribution with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution getDistribution(
		String url) throws com.liferay.portal.kernel.exception.PortalException {
		return _distributionLocalService.getDistribution(url);
	}

	/**
	* Returns the distribution matching the UUID and group.
	*
	* @param uuid the distribution's UUID
	* @param groupId the primary key of the group
	* @return the matching distribution
	* @throws PortalException if a matching distribution could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution getDistributionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _distributionLocalService.getDistributionByUuidAndGroupId(uuid,
			groupId);
	}

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
	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Distribution> getDistributions(
		int start, int end) {
		return _distributionLocalService.getDistributions(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Distribution> getDistributions(
		long groupId, String datasetId) {
		return _distributionLocalService.getDistributions(groupId, datasetId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Distribution> getDistributions(
		long groupId, String datasetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distributionLocalService.getDistributions(groupId, datasetId,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Distribution> getDistributions(
		long groupId, String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Distribution> obc) {
		return _distributionLocalService.getDistributions(groupId, datasetId,
			start, end, obc);
	}

	/**
	* Returns the number of distributions.
	*
	* @return the number of distributions
	*/
	@Override
	public int getDistributionsCount() {
		return _distributionLocalService.getDistributionsCount();
	}

	@Override
	public int getDistributionsCount(long groupId, String coleccionId) {
		return _distributionLocalService.getDistributionsCount(groupId,
			coleccionId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _distributionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _distributionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the distribution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distribution the distribution
	* @return the distribution that was updated
	*/
	@Override
	public com.liferay.docs.datosGob.model.Distribution updateDistribution(
		com.liferay.docs.datosGob.model.Distribution distribution) {
		return _distributionLocalService.updateDistribution(distribution);
	}

	@Override
	public DistributionLocalService getWrappedService() {
		return _distributionLocalService;
	}

	@Override
	public void setWrappedService(
		DistributionLocalService distributionLocalService) {
		_distributionLocalService = distributionLocalService;
	}

	private DistributionLocalService _distributionLocalService;
}