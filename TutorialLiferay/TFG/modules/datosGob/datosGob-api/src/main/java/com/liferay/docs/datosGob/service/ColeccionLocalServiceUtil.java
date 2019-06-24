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
 * Provides the local service utility for Coleccion. This utility wraps
 * {@link com.liferay.docs.datosGob.service.impl.ColeccionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see ColeccionLocalService
 * @see com.liferay.docs.datosGob.service.base.ColeccionLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.ColeccionLocalServiceImpl
 * @generated
 */
@ProviderType
public class ColeccionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.ColeccionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the coleccion to the database. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was added
	*/
	public static com.liferay.docs.datosGob.model.Coleccion addColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return getService().addColeccion(coleccion);
	}

	public static com.liferay.docs.datosGob.model.Coleccion addColeccion(
		String titulo, String homepage,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addColeccion(titulo, homepage, serviceContext);
	}

	/**
	* Creates a new coleccion with the primary key. Does not add the coleccion to the database.
	*
	* @param homepage the primary key for the new coleccion
	* @return the new coleccion
	*/
	public static com.liferay.docs.datosGob.model.Coleccion createColeccion(
		String homepage) {
		return getService().createColeccion(homepage);
	}

	/**
	* Deletes the coleccion from the database. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was removed
	*/
	public static com.liferay.docs.datosGob.model.Coleccion deleteColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return getService().deleteColeccion(coleccion);
	}

	/**
	* Deletes the coleccion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion that was removed
	* @throws PortalException if a coleccion with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Coleccion deleteColeccion(
		String homepage)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteColeccion(homepage);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.docs.datosGob.model.Coleccion fetchColeccion(
		String homepage) {
		return getService().fetchColeccion(homepage);
	}

	/**
	* Returns the coleccion matching the UUID and group.
	*
	* @param uuid the coleccion's UUID
	* @param groupId the primary key of the group
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static com.liferay.docs.datosGob.model.Coleccion fetchColeccionByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchColeccionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the coleccion with the primary key.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion
	* @throws PortalException if a coleccion with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Coleccion getColeccion(
		String homepage)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getColeccion(homepage);
	}

	/**
	* Returns the coleccion matching the UUID and group.
	*
	* @param uuid the coleccion's UUID
	* @param groupId the primary key of the group
	* @return the matching coleccion
	* @throws PortalException if a matching coleccion could not be found
	*/
	public static com.liferay.docs.datosGob.model.Coleccion getColeccionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getColeccionByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId) {
		return getService().getColecciones(groupId);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId, int start, int end) {
		return getService().getColecciones(groupId, start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Coleccion> obc) {
		return getService().getColecciones(groupId, start, end, obc);
	}

	public static int getColeccionesCount(long groupId) {
		return getService().getColeccionesCount(groupId);
	}

	/**
	* Returns a range of all the coleccions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @return the range of coleccions
	*/
	public static java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColeccions(
		int start, int end) {
		return getService().getColeccions(start, end);
	}

	/**
	* Returns the number of coleccions.
	*
	* @return the number of coleccions
	*/
	public static int getColeccionsCount() {
		return getService().getColeccionsCount();
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
	* Updates the coleccion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was updated
	*/
	public static com.liferay.docs.datosGob.model.Coleccion updateColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return getService().updateColeccion(coleccion);
	}

	public static ColeccionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ColeccionLocalService, ColeccionLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ColeccionLocalService.class);

		ServiceTracker<ColeccionLocalService, ColeccionLocalService> serviceTracker =
			new ServiceTracker<ColeccionLocalService, ColeccionLocalService>(bundle.getBundleContext(),
				ColeccionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}