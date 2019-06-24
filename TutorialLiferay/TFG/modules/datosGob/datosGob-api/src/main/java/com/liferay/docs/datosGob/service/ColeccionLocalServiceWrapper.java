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
 * Provides a wrapper for {@link ColeccionLocalService}.
 *
 * @author liferay
 * @see ColeccionLocalService
 * @generated
 */
@ProviderType
public class ColeccionLocalServiceWrapper implements ColeccionLocalService,
	ServiceWrapper<ColeccionLocalService> {
	public ColeccionLocalServiceWrapper(
		ColeccionLocalService coleccionLocalService) {
		_coleccionLocalService = coleccionLocalService;
	}

	/**
	* Adds the coleccion to the database. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was added
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion addColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return _coleccionLocalService.addColeccion(coleccion);
	}

	@Override
	public com.liferay.docs.datosGob.model.Coleccion addColeccion(
		String titulo, String homepage,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.addColeccion(titulo, homepage,
			serviceContext);
	}

	/**
	* Creates a new coleccion with the primary key. Does not add the coleccion to the database.
	*
	* @param homepage the primary key for the new coleccion
	* @return the new coleccion
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion createColeccion(
		String homepage) {
		return _coleccionLocalService.createColeccion(homepage);
	}

	/**
	* Deletes the coleccion from the database. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was removed
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion deleteColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return _coleccionLocalService.deleteColeccion(coleccion);
	}

	/**
	* Deletes the coleccion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion that was removed
	* @throws PortalException if a coleccion with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion deleteColeccion(
		String homepage)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.deleteColeccion(homepage);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _coleccionLocalService.dynamicQuery();
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
		return _coleccionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _coleccionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _coleccionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _coleccionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _coleccionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.datosGob.model.Coleccion fetchColeccion(
		String homepage) {
		return _coleccionLocalService.fetchColeccion(homepage);
	}

	/**
	* Returns the coleccion matching the UUID and group.
	*
	* @param uuid the coleccion's UUID
	* @param groupId the primary key of the group
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion fetchColeccionByUuidAndGroupId(
		String uuid, long groupId) {
		return _coleccionLocalService.fetchColeccionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the coleccion with the primary key.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion
	* @throws PortalException if a coleccion with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion getColeccion(
		String homepage)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.getColeccion(homepage);
	}

	/**
	* Returns the coleccion matching the UUID and group.
	*
	* @param uuid the coleccion's UUID
	* @param groupId the primary key of the group
	* @return the matching coleccion
	* @throws PortalException if a matching coleccion could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion getColeccionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.getColeccionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId) {
		return _coleccionLocalService.getColecciones(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId, int start, int end) {
		return _coleccionLocalService.getColecciones(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColecciones(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Coleccion> obc) {
		return _coleccionLocalService.getColecciones(groupId, start, end, obc);
	}

	@Override
	public int getColeccionesCount(long groupId) {
		return _coleccionLocalService.getColeccionesCount(groupId);
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
	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Coleccion> getColeccions(
		int start, int end) {
		return _coleccionLocalService.getColeccions(start, end);
	}

	/**
	* Returns the number of coleccions.
	*
	* @return the number of coleccions
	*/
	@Override
	public int getColeccionsCount() {
		return _coleccionLocalService.getColeccionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _coleccionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coleccionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the coleccion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coleccion the coleccion
	* @return the coleccion that was updated
	*/
	@Override
	public com.liferay.docs.datosGob.model.Coleccion updateColeccion(
		com.liferay.docs.datosGob.model.Coleccion coleccion) {
		return _coleccionLocalService.updateColeccion(coleccion);
	}

	@Override
	public ColeccionLocalService getWrappedService() {
		return _coleccionLocalService;
	}

	@Override
	public void setWrappedService(ColeccionLocalService coleccionLocalService) {
		_coleccionLocalService = coleccionLocalService;
	}

	private ColeccionLocalService _coleccionLocalService;
}