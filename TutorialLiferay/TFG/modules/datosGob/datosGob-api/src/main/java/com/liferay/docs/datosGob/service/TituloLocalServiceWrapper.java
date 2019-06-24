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
 * Provides a wrapper for {@link TituloLocalService}.
 *
 * @author liferay
 * @see TituloLocalService
 * @generated
 */
@ProviderType
public class TituloLocalServiceWrapper implements TituloLocalService,
	ServiceWrapper<TituloLocalService> {
	public TituloLocalServiceWrapper(TituloLocalService tituloLocalService) {
		_tituloLocalService = tituloLocalService;
	}

	@Override
	public com.liferay.docs.datosGob.model.Titulo addDescripcion(
		String datasetId, String titu,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.addDescripcion(datasetId, titu,
			serviceContext);
	}

	/**
	* Adds the titulo to the database. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was added
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo addTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return _tituloLocalService.addTitulo(titulo);
	}

	/**
	* Creates a new titulo with the primary key. Does not add the titulo to the database.
	*
	* @param tituloId the primary key for the new titulo
	* @return the new titulo
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo createTitulo(long tituloId) {
		return _tituloLocalService.createTitulo(tituloId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo that was removed
	* @throws PortalException if a titulo with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo deleteTitulo(long tituloId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.deleteTitulo(tituloId);
	}

	/**
	* Deletes the titulo from the database. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was removed
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo deleteTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return _tituloLocalService.deleteTitulo(titulo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tituloLocalService.dynamicQuery();
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
		return _tituloLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _tituloLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _tituloLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tituloLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tituloLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.datosGob.model.Titulo fetchTitulo(long tituloId) {
		return _tituloLocalService.fetchTitulo(tituloId);
	}

	/**
	* Returns the titulo matching the UUID and group.
	*
	* @param uuid the titulo's UUID
	* @param groupId the primary key of the group
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo fetchTituloByUuidAndGroupId(
		String uuid, long groupId) {
		return _tituloLocalService.fetchTituloByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tituloLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tituloLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _tituloLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the titulo with the primary key.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo
	* @throws PortalException if a titulo with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo getTitulo(long tituloId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.getTitulo(tituloId);
	}

	/**
	* Returns the titulo matching the UUID and group.
	*
	* @param uuid the titulo's UUID
	* @param groupId the primary key of the group
	* @return the matching titulo
	* @throws PortalException if a matching titulo could not be found
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo getTituloByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tituloLocalService.getTituloByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		int start, int end) {
		return _tituloLocalService.getTitulos(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId) {
		return _tituloLocalService.getTitulos(groupId, datasetId);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tituloLocalService.getTitulos(groupId, datasetId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.datosGob.model.Titulo> getTitulos(
		long groupId, String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.docs.datosGob.model.Titulo> obc) {
		return _tituloLocalService.getTitulos(groupId, datasetId, start, end,
			obc);
	}

	/**
	* Returns the number of titulos.
	*
	* @return the number of titulos
	*/
	@Override
	public int getTitulosCount() {
		return _tituloLocalService.getTitulosCount();
	}

	@Override
	public int getTitulosCount(long groupId, String coleccionId) {
		return _tituloLocalService.getTitulosCount(groupId, coleccionId);
	}

	/**
	* Updates the titulo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param titulo the titulo
	* @return the titulo that was updated
	*/
	@Override
	public com.liferay.docs.datosGob.model.Titulo updateTitulo(
		com.liferay.docs.datosGob.model.Titulo titulo) {
		return _tituloLocalService.updateTitulo(titulo);
	}

	@Override
	public TituloLocalService getWrappedService() {
		return _tituloLocalService;
	}

	@Override
	public void setWrappedService(TituloLocalService tituloLocalService) {
		_tituloLocalService = tituloLocalService;
	}

	private TituloLocalService _tituloLocalService;
}