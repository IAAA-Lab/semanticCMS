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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Dataset. This utility wraps
 * {@link com.liferay.docs.datosGob.service.impl.DatasetLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see DatasetLocalService
 * @see com.liferay.docs.datosGob.service.base.DatasetLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.DatasetLocalServiceImpl
 * @generated
 */
@ProviderType
public class DatasetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.DatasetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dataset to the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was added
	*/
	public static com.liferay.docs.datosGob.model.Dataset addDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return getService().addDataset(dataset);
	}

	public static com.liferay.docs.datosGob.model.Dataset addDataset(
		String datasetId, String homepage,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addDataset(datasetId, homepage, serviceContext);
	}

	/**
	* Creates a new dataset with the primary key. Does not add the dataset to the database.
	*
	* @param datasetId the primary key for the new dataset
	* @return the new dataset
	*/
	public static com.liferay.docs.datosGob.model.Dataset createDataset(
		String datasetId) {
		return getService().createDataset(datasetId);
	}

	/**
	* Deletes the dataset from the database. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was removed
	*/
	public static com.liferay.docs.datosGob.model.Dataset deleteDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return getService().deleteDataset(dataset);
	}

	/**
	* Deletes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset that was removed
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Dataset deleteDataset(
		String datasetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataset(datasetId);
	}

	public static com.liferay.docs.datosGob.model.Dataset deleteDataset(
		String datasetId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataset(datasetId, serviceContext);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.datosGob.model.Dataset fetchDataset(
		String datasetId) {
		return getService().fetchDataset(datasetId);
	}

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static com.liferay.docs.datosGob.model.Dataset fetchDatasetByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchDatasetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dataset with the primary key.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset
	* @throws PortalException if a dataset with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Dataset getDataset(
		String datasetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataset(datasetId);
	}

	/**
	* Returns the dataset matching the UUID and group.
	*
	* @param uuid the dataset's UUID
	* @param groupId the primary key of the group
	* @return the matching dataset
	* @throws PortalException if a matching dataset could not be found
	*/
	public static com.liferay.docs.datosGob.model.Dataset getDatasetByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDatasetByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		int start, int end) {
		return getService().getDatasets(start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId) {
		return getService().getDatasets(groupId, coleccionId);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDatasets(groupId, coleccionId, start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Dataset> getDatasets(
		long groupId, String coleccionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Dataset> obc) {
		return getService().getDatasets(groupId, coleccionId, start, end, obc);
	}

	/**
	* Returns the number of datasets.
	*
	* @return the number of datasets
	*/
	public static int getDatasetsCount() {
		return getService().getDatasetsCount();
	}

	public static int getDatasetsCount(long groupId, String coleccionId) {
		return getService().getDatasetsCount(groupId, coleccionId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the dataset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataset the dataset
	* @return the dataset that was updated
	*/
	public static com.liferay.docs.datosGob.model.Dataset updateDataset(
		com.liferay.docs.datosGob.model.Dataset dataset) {
		return getService().updateDataset(dataset);
	}

	public static DatasetLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DatasetLocalService, DatasetLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DatasetLocalService.class);

		ServiceTracker<DatasetLocalService, DatasetLocalService> serviceTracker = new ServiceTracker<DatasetLocalService, DatasetLocalService>(bundle.getBundleContext(),
				DatasetLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}