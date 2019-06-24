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
 * Provides the local service utility for Titulo. This utility wraps
 * {@link com.liferay.docs.datosGob.service.impl.TituloLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see TituloLocalService
 * @see com.liferay.docs.datosGob.service.base.TituloLocalServiceBaseImpl
 * @see com.liferay.docs.datosGob.service.impl.TituloLocalServiceImpl
 * @generated
 */
@ProviderType
public class TituloLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.datosGob.service.impl.TituloLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.docs.datosGob.model.Titulo addDescripcion(
		String datasetId, String titu,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addDescripcion(datasetId, titu, serviceContext);
	}

	/**
	* Adds the titulo to the database. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was added
	*/
	public static com.liferay.docs.datosGob.model.Titulo addTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return getService().addTitulo(titulo);
	}

	/**
	* Creates a new titulo with the primary key. Does not add the titulo to the database.
	*
	* @param tituloId the primary key for the new titulo
	* @return the new titulo
	*/
	public static com.liferay.docs.datosGob.model.Titulo createTitulo(
		long tituloId) {
		return getService().createTitulo(tituloId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo that was removed
	* @throws PortalException if a titulo with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Titulo deleteTitulo(
		long tituloId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTitulo(tituloId);
	}

	/**
	* Deletes the titulo from the database. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was removed
	*/
	public static com.liferay.docs.datosGob.model.Titulo deleteTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return getService().deleteTitulo(titulo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.docs.datosGob.model.Titulo fetchTitulo(
		long tituloId) {
		return getService().fetchTitulo(tituloId);
	}

	/**
	* Returns the titulo matching the UUID and group.
	*
	* @param uuid the titulo's UUID
	* @param groupId the primary key of the group
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static com.liferay.docs.datosGob.model.Titulo fetchTituloByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchTituloByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
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
	* Returns the titulo with the primary key.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo
	* @throws PortalException if a titulo with the primary key could not be found
	*/
	public static com.liferay.docs.datosGob.model.Titulo getTitulo(
		long tituloId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTitulo(tituloId);
	}

	/**
	* Returns the titulo matching the UUID and group.
	*
	* @param uuid the titulo's UUID
	* @param groupId the primary key of the group
	* @return the matching titulo
	* @throws PortalException if a matching titulo could not be found
	*/
	public static com.liferay.docs.datosGob.model.Titulo getTituloByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTituloByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the titulos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.datosGob.model.impl.TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @return the range of titulos
	*/
	public static java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		int start, int end) {
		return getService().getTitulos(start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId) {
		return getService().getTitulos(groupId, datasetId);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTitulos(groupId, datasetId, start, end);
	}

	public static java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Titulo> obc) {
		return getService().getTitulos(groupId, datasetId, start, end, obc);
	}

	/**
	* Returns the number of titulos.
	*
	* @return the number of titulos
	*/
	public static int getTitulosCount() {
		return getService().getTitulosCount();
	}

	public static int getTitulosCount(long groupId, String coleccionId) {
		return getService().getTitulosCount(groupId, coleccionId);
	}

	/**
	* Updates the titulo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was updated
	*/
	public static com.liferay.docs.datosGob.model.Titulo updateTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return getService().updateTitulo(titulo);
	}

	public static TituloLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TituloLocalService, TituloLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TituloLocalService.class);

		ServiceTracker<TituloLocalService, TituloLocalService> serviceTracker = new ServiceTracker<TituloLocalService, TituloLocalService>(bundle.getBundleContext(),
				TituloLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}