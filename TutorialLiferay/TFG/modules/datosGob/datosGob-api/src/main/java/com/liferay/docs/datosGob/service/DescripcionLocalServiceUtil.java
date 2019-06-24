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
 * Provides the local service utility for Descripcion. This utility wraps
 * {@link com.liferay.docs.datosGob.service.impl.DescripcionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see DescripcionLocalService
 * @see com.liferay.docs.datosGob.service.base.DescripcionLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.DescripcionLocalServiceImpl
 * @generated
 */
@ProviderType
public class DescripcionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.DescripcionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the descripcion to the database. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was added
	*/
	public static com.liferay.docs.datosGob.model.Descripcion addDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return getService().addDescripcion(descripcion);
	}

	public static com.liferay.docs.datosGob.model.Descripcion addDescripcion(
		String datasetId, String desc,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addDescripcion(datasetId, desc, serviceContext);
	}

	/**
	* Creates a new descripcion with the primary key. Does not add the descripcion to the database.
	*
	* @param descripcionId the primary key for the new descripcion
	* @return the new descripcion
	*/
	public static com.liferay.docs.datosGob.model.Descripcion createDescripcion(
		long descripcionId) {
		return getService().createDescripcion(descripcionId);
	}

	/**
	* Deletes the descripcion from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was removed
	*/
	public static com.liferay.docs.datosGob.model.Descripcion deleteDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return getService().deleteDescripcion(descripcion);
	}

	/**
	* Deletes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion that was removed
	* @throws PortalException if a descripcion with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Descripcion deleteDescripcion(
		long descripcionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDescripcion(descripcionId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.docs.datosGob.model.Descripcion fetchDescripcion(
		long descripcionId) {
		return getService().fetchDescripcion(descripcionId);
	}

	/**
	* Returns the descripcion matching the UUID and group.
	*
	* @param uuid the descripcion's UUID
	* @param groupId the primary key of the group
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static com.liferay.docs.datosGob.model.Descripcion fetchDescripcionByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchDescripcionByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the descripcion with the primary key.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion
	* @throws PortalException if a descripcion with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Descripcion getDescripcion(
		long descripcionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDescripcion(descripcionId);
	}

	/**
	* Returns the descripcion matching the UUID and group.
	*
	* @param uuid the descripcion's UUID
	* @param groupId the primary key of the group
	* @return the matching descripcion
	* @throws PortalException if a matching descripcion could not be found
	*/
	public static com.liferay.docs.datosGob.model.Descripcion getDescripcionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDescripcionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the descripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @return the range of descripcions
	*/
	public static java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		int start, int end) {
		return getService().getDescripcions(start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId) {
		return getService().getDescripcions(groupId, datasetId);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDescripcions(groupId, datasetId, start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Descripcion> obc) {
		return getService().getDescripcions(groupId, datasetId, start, end, obc);
	}

	/**
	* Returns the number of descripcions.
	*
	* @return the number of descripcions
	*/
	public static int getDescripcionsCount() {
		return getService().getDescripcionsCount();
	}

	public static int getDescripcionsCount(long groupId, String coleccionId) {
		return getService().getDescripcionsCount(groupId, coleccionId);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
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
	* Updates the descripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was updated
	*/
	public static com.liferay.docs.datosGob.model.Descripcion updateDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return getService().updateDescripcion(descripcion);
	}

	public static DescripcionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DescripcionLocalService, DescripcionLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DescripcionLocalService.class);

		ServiceTracker<DescripcionLocalService, DescripcionLocalService> serviceTracker =
			new ServiceTracker<DescripcionLocalService, DescripcionLocalService>(bundle.getBundleContext(),
				DescripcionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}