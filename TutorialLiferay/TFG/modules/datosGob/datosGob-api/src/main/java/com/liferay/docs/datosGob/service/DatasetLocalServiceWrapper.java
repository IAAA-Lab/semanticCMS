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
 * Provides a wrapper for {@link DatasetLocalService}.
 *
 * @author liferay
 * @see DatasetLocalService
 * @generated
 */
@ProviderType
public class DatasetLocalServiceWrapper implements DatasetLocalService,
	ServiceWrapper<DatasetLocalService> {
	public DatasetLocalServiceWrapper(DatasetLocalService datasetLocalService) {
		_datasetLocalService = datasetLocalService;
	}

	/**
	* Adds the dataset to the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was added
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset addDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return _datasetLocalService.addDataset(dataset);
	}

	@Override
	public com.liferay.docs.datosGob.model.Dataset addDataset(
		String datasetId, String homepage,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.addDataset(datasetId, homepage,
			serviceContext);
	}

	/**
	* Creates a new dataset with the primary key. Does not add the dataset to the database.
	*
	* @param datasetId the primary key for the new dataset
	* @return the new dataset
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset createDataset(
		String datasetId) {
		return _datasetLocalService.createDataset(datasetId);
	}

	/**
	* Deletes the dataset from the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was removed
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset deleteDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return _datasetLocalService.deleteDataset(dataset);
	}

	/**
	* Deletes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset that was removed
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset deleteDataset(
		String datasetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.deleteDataset(datasetId);
	}

	@Override
	public com.liferay.docs.datosGob.model.Dataset deleteDataset(
		String datasetId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.deleteDataset(datasetId, serviceContext);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _datasetLocalService.dynamicQuery();
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
		return _datasetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _datasetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _datasetLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _datasetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _datasetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.datosGob.model.Dataset fetchDataset(
		String datasetId) {
		return _datasetLocalService.fetchDataset(datasetId);
	}

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset fetchDatasetByUuidAndGroupId(
		String uuid, long groupId) {
		return _datasetLocalService.fetchDatasetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dataset with the primary key.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset getDataset(String datasetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.getDataset(datasetId);
	}

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset
	* @throws PortalException if a matching dataset could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset getDatasetByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.getDatasetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the datasets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @return the range of datasets
	*/
	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		int start, int end) {
		return _datasetLocalService.getDatasets(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId) {
		return _datasetLocalService.getDatasets(groupId, coleccionId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datasetLocalService.getDatasets(groupId, coleccionId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Dataset> obc) {
		return _datasetLocalService.getDatasets(groupId, coleccionId, start,
			end, obc);
	}

	/**
	* Returns the number of datasets.
	*
	* @return the number of datasets
	*/
	@Override
	public int getDatasetsCount() {
		return _datasetLocalService.getDatasetsCount();
	}

	@Override
	public int getDatasetsCount(long groupId, String coleccionId) {
		return _datasetLocalService.getDatasetsCount(groupId, coleccionId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _datasetLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _datasetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the dataset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was updated
	*/
	@Override
	public com.liferay.docs.datosGob.model.Dataset updateDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return _datasetLocalService.updateDataset(dataset);
	}

	@Override
	public DatasetLocalService getWrappedService() {
		return _datasetLocalService;
	}

	@Override
	public void setWrappedService(DatasetLocalService datasetLocalService) {
		_datasetLocalService = datasetLocalService;
	}

	private DatasetLocalService _datasetLocalService;
}