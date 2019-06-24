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
 * Provides a wrapper for {@link DescripcionLocalService}.
 *
 * @author liferay
 * @see DescripcionLocalService
 * @generated
 */
@ProviderType
public class DescripcionLocalServiceWrapper implements DescripcionLocalService,
	ServiceWrapper<DescripcionLocalService> {
	public DescripcionLocalServiceWrapper(
		DescripcionLocalService descripcionLocalService) {
		_descripcionLocalService = descripcionLocalService;
	}

	/**
	* Adds the descripcion to the database. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was added
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion addDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return _descripcionLocalService.addDescripcion(descripcion);
	}

	@Override
	public com.liferay.docs.datosGob.model.Descripcion addDescripcion(
		String datasetId, String desc,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.addDescripcion(datasetId, desc,
			serviceContext);
	}

	/**
	* Creates a new descripcion with the primary key. Does not add the descripcion to the database.
	*
	* @param descripcionId the primary key for the new descripcion
	* @return the new descripcion
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion createDescripcion(
		long descripcionId) {
		return _descripcionLocalService.createDescripcion(descripcionId);
	}

	/**
	* Deletes the descripcion from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was removed
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion deleteDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return _descripcionLocalService.deleteDescripcion(descripcion);
	}

	/**
	* Deletes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion that was removed
	* @throws PortalException if a descripcion with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion deleteDescripcion(
		long descripcionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.deleteDescripcion(descripcionId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _descripcionLocalService.dynamicQuery();
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
		return _descripcionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _descripcionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _descripcionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _descripcionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _descripcionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.datosGob.model.Descripcion fetchDescripcion(
		long descripcionId) {
		return _descripcionLocalService.fetchDescripcion(descripcionId);
	}

	/**
	* Returns the descripcion matching the UUID and group.
	*
	* @param uuid the descripcion's UUID
	* @param groupId the primary key of the group
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion fetchDescripcionByUuidAndGroupId(
		String uuid, long groupId) {
		return _descripcionLocalService.fetchDescripcionByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _descripcionLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the descripcion with the primary key.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion
	* @throws PortalException if a descripcion with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion getDescripcion(
		long descripcionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.getDescripcion(descripcionId);
	}

	/**
	* Returns the descripcion matching the UUID and group.
	*
	* @param uuid the descripcion's UUID
	* @param groupId the primary key of the group
	* @return the matching descripcion
	* @throws PortalException if a matching descripcion could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion getDescripcionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.getDescripcionByUuidAndGroupId(uuid,
			groupId);
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
	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		int start, int end) {
		return _descripcionLocalService.getDescripcions(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId) {
		return _descripcionLocalService.getDescripcions(groupId, datasetId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _descripcionLocalService.getDescripcions(groupId, datasetId,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Descripcion> getDescripcions(
		long groupId, String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Descripcion> obc) {
		return _descripcionLocalService.getDescripcions(groupId, datasetId,
			start, end, obc);
	}

	/**
	* Returns the number of descripcions.
	*
	* @return the number of descripcions
	*/
	@Override
	public int getDescripcionsCount() {
		return _descripcionLocalService.getDescripcionsCount();
	}

	@Override
	public int getDescripcionsCount(long groupId, String coleccionId) {
		return _descripcionLocalService.getDescripcionsCount(groupId,
			coleccionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _descripcionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _descripcionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _descripcionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the descripcion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param descripcion the descripcion
	* @return the descripcion that was updated
	*/
	@Override
	public com.liferay.docs.datosGob.model.Descripcion updateDescripcion(
		com.liferay.docs.datosGob.model.Descripcion descripcion) {
		return _descripcionLocalService.updateDescripcion(descripcion);
	}

	@Override
	public DescripcionLocalService getWrappedService() {
		return _descripcionLocalService;
	}

	@Override
	public void setWrappedService(
		DescripcionLocalService descripcionLocalService) {
		_descripcionLocalService = descripcionLocalService;
	}

	private DescripcionLocalService _descripcionLocalService;
}