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

package com.liferay.docs.datosGob.service.base;

import com.liferay.docs.datosGob.model.Descripcion;
import com.liferay.docs.datosGob.service.DescripcionService;
import com.liferay.docs.datosGob.service.persistence.ColeccionPersistence;
import com.liferay.docs.datosGob.service.persistence.DatasetPersistence;
import com.liferay.docs.datosGob.service.persistence.DescripcionPersistence;
import com.liferay.docs.datosGob.service.persistence.DistributionPersistence;
import com.liferay.docs.datosGob.service.persistence.TituloPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the descripcion remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.datosGob.service.impl.DescripcionServiceImpl}.
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.impl.DescripcionServiceImpl
 * @see com.liferay.docs.datosGob.service.DescripcionServiceUtil
 * @generated
 */
public abstract class DescripcionServiceBaseImpl extends BaseServiceImpl
	implements DescripcionService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.docs.datosGob.service.DescripcionServiceUtil} to access the descripcion remote service.
	 */

	/**
	 * Returns the coleccion local service.
	 *
	 * @return the coleccion local service
	 */
	public com.liferay.docs.datosGob.service.ColeccionLocalService getColeccionLocalService() {
		return coleccionLocalService;
	}

	/**
	 * Sets the coleccion local service.
	 *
	 * @param coleccionLocalService the coleccion local service
	 */
	public void setColeccionLocalService(
		com.liferay.docs.datosGob.service.ColeccionLocalService coleccionLocalService) {
		this.coleccionLocalService = coleccionLocalService;
	}

	/**
	 * Returns the coleccion remote service.
	 *
	 * @return the coleccion remote service
	 */
	public com.liferay.docs.datosGob.service.ColeccionService getColeccionService() {
		return coleccionService;
	}

	/**
	 * Sets the coleccion remote service.
	 *
	 * @param coleccionService the coleccion remote service
	 */
	public void setColeccionService(
		com.liferay.docs.datosGob.service.ColeccionService coleccionService) {
		this.coleccionService = coleccionService;
	}

	/**
	 * Returns the coleccion persistence.
	 *
	 * @return the coleccion persistence
	 */
	public ColeccionPersistence getColeccionPersistence() {
		return coleccionPersistence;
	}

	/**
	 * Sets the coleccion persistence.
	 *
	 * @param coleccionPersistence the coleccion persistence
	 */
	public void setColeccionPersistence(
		ColeccionPersistence coleccionPersistence) {
		this.coleccionPersistence = coleccionPersistence;
	}

	/**
	 * Returns the dataset local service.
	 *
	 * @return the dataset local service
	 */
	public com.liferay.docs.datosGob.service.DatasetLocalService getDatasetLocalService() {
		return datasetLocalService;
	}

	/**
	 * Sets the dataset local service.
	 *
	 * @param datasetLocalService the dataset local service
	 */
	public void setDatasetLocalService(
		com.liferay.docs.datosGob.service.DatasetLocalService datasetLocalService) {
		this.datasetLocalService = datasetLocalService;
	}

	/**
	 * Returns the dataset remote service.
	 *
	 * @return the dataset remote service
	 */
	public com.liferay.docs.datosGob.service.DatasetService getDatasetService() {
		return datasetService;
	}

	/**
	 * Sets the dataset remote service.
	 *
	 * @param datasetService the dataset remote service
	 */
	public void setDatasetService(
		com.liferay.docs.datosGob.service.DatasetService datasetService) {
		this.datasetService = datasetService;
	}

	/**
	 * Returns the dataset persistence.
	 *
	 * @return the dataset persistence
	 */
	public DatasetPersistence getDatasetPersistence() {
		return datasetPersistence;
	}

	/**
	 * Sets the dataset persistence.
	 *
	 * @param datasetPersistence the dataset persistence
	 */
	public void setDatasetPersistence(DatasetPersistence datasetPersistence) {
		this.datasetPersistence = datasetPersistence;
	}

	/**
	 * Returns the descripcion local service.
	 *
	 * @return the descripcion local service
	 */
	public com.liferay.docs.datosGob.service.DescripcionLocalService getDescripcionLocalService() {
		return descripcionLocalService;
	}

	/**
	 * Sets the descripcion local service.
	 *
	 * @param descripcionLocalService the descripcion local service
	 */
	public void setDescripcionLocalService(
		com.liferay.docs.datosGob.service.DescripcionLocalService descripcionLocalService) {
		this.descripcionLocalService = descripcionLocalService;
	}

	/**
	 * Returns the descripcion remote service.
	 *
	 * @return the descripcion remote service
	 */
	public DescripcionService getDescripcionService() {
		return descripcionService;
	}

	/**
	 * Sets the descripcion remote service.
	 *
	 * @param descripcionService the descripcion remote service
	 */
	public void setDescripcionService(DescripcionService descripcionService) {
		this.descripcionService = descripcionService;
	}

	/**
	 * Returns the descripcion persistence.
	 *
	 * @return the descripcion persistence
	 */
	public DescripcionPersistence getDescripcionPersistence() {
		return descripcionPersistence;
	}

	/**
	 * Sets the descripcion persistence.
	 *
	 * @param descripcionPersistence the descripcion persistence
	 */
	public void setDescripcionPersistence(
		DescripcionPersistence descripcionPersistence) {
		this.descripcionPersistence = descripcionPersistence;
	}

	/**
	 * Returns the distribution local service.
	 *
	 * @return the distribution local service
	 */
	public com.liferay.docs.datosGob.service.DistributionLocalService getDistributionLocalService() {
		return distributionLocalService;
	}

	/**
	 * Sets the distribution local service.
	 *
	 * @param distributionLocalService the distribution local service
	 */
	public void setDistributionLocalService(
		com.liferay.docs.datosGob.service.DistributionLocalService distributionLocalService) {
		this.distributionLocalService = distributionLocalService;
	}

	/**
	 * Returns the distribution remote service.
	 *
	 * @return the distribution remote service
	 */
	public com.liferay.docs.datosGob.service.DistributionService getDistributionService() {
		return distributionService;
	}

	/**
	 * Sets the distribution remote service.
	 *
	 * @param distributionService the distribution remote service
	 */
	public void setDistributionService(
		com.liferay.docs.datosGob.service.DistributionService distributionService) {
		this.distributionService = distributionService;
	}

	/**
	 * Returns the distribution persistence.
	 *
	 * @return the distribution persistence
	 */
	public DistributionPersistence getDistributionPersistence() {
		return distributionPersistence;
	}

	/**
	 * Sets the distribution persistence.
	 *
	 * @param distributionPersistence the distribution persistence
	 */
	public void setDistributionPersistence(
		DistributionPersistence distributionPersistence) {
		this.distributionPersistence = distributionPersistence;
	}

	/**
	 * Returns the titulo local service.
	 *
	 * @return the titulo local service
	 */
	public com.liferay.docs.datosGob.service.TituloLocalService getTituloLocalService() {
		return tituloLocalService;
	}

	/**
	 * Sets the titulo local service.
	 *
	 * @param tituloLocalService the titulo local service
	 */
	public void setTituloLocalService(
		com.liferay.docs.datosGob.service.TituloLocalService tituloLocalService) {
		this.tituloLocalService = tituloLocalService;
	}

	/**
	 * Returns the titulo remote service.
	 *
	 * @return the titulo remote service
	 */
	public com.liferay.docs.datosGob.service.TituloService getTituloService() {
		return tituloService;
	}

	/**
	 * Sets the titulo remote service.
	 *
	 * @param tituloService the titulo remote service
	 */
	public void setTituloService(
		com.liferay.docs.datosGob.service.TituloService tituloService) {
		this.tituloService = tituloService;
	}

	/**
	 * Returns the titulo persistence.
	 *
	 * @return the titulo persistence
	 */
	public TituloPersistence getTituloPersistence() {
		return tituloPersistence;
	}

	/**
	 * Sets the titulo persistence.
	 *
	 * @param tituloPersistence the titulo persistence
	 */
	public void setTituloPersistence(TituloPersistence tituloPersistence) {
		this.tituloPersistence = tituloPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DescripcionService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Descripcion.class;
	}

	protected String getModelClassName() {
		return Descripcion.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = descripcionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.docs.datosGob.service.ColeccionLocalService.class)
	protected com.liferay.docs.datosGob.service.ColeccionLocalService coleccionLocalService;
	@BeanReference(type = com.liferay.docs.datosGob.service.ColeccionService.class)
	protected com.liferay.docs.datosGob.service.ColeccionService coleccionService;
	@BeanReference(type = ColeccionPersistence.class)
	protected ColeccionPersistence coleccionPersistence;
	@BeanReference(type = com.liferay.docs.datosGob.service.DatasetLocalService.class)
	protected com.liferay.docs.datosGob.service.DatasetLocalService datasetLocalService;
	@BeanReference(type = com.liferay.docs.datosGob.service.DatasetService.class)
	protected com.liferay.docs.datosGob.service.DatasetService datasetService;
	@BeanReference(type = DatasetPersistence.class)
	protected DatasetPersistence datasetPersistence;
	@BeanReference(type = com.liferay.docs.datosGob.service.DescripcionLocalService.class)
	protected com.liferay.docs.datosGob.service.DescripcionLocalService descripcionLocalService;
	@BeanReference(type = DescripcionService.class)
	protected DescripcionService descripcionService;
	@BeanReference(type = DescripcionPersistence.class)
	protected DescripcionPersistence descripcionPersistence;
	@BeanReference(type = com.liferay.docs.datosGob.service.DistributionLocalService.class)
	protected com.liferay.docs.datosGob.service.DistributionLocalService distributionLocalService;
	@BeanReference(type = com.liferay.docs.datosGob.service.DistributionService.class)
	protected com.liferay.docs.datosGob.service.DistributionService distributionService;
	@BeanReference(type = DistributionPersistence.class)
	protected DistributionPersistence distributionPersistence;
	@BeanReference(type = com.liferay.docs.datosGob.service.TituloLocalService.class)
	protected com.liferay.docs.datosGob.service.TituloLocalService tituloLocalService;
	@BeanReference(type = com.liferay.docs.datosGob.service.TituloService.class)
	protected com.liferay.docs.datosGob.service.TituloService tituloService;
	@BeanReference(type = TituloPersistence.class)
	protected TituloPersistence tituloPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}