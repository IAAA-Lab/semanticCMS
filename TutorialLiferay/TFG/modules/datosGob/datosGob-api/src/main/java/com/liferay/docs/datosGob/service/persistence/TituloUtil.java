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

package com.liferay.docs.datosGob.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.model.Titulo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the titulo service. This utility wraps {@link com.liferay.docs.datosGob.service.persistence.impl.TituloPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see TituloPersistence
 * @see com.liferay.docs.datosGob.service.persistence.impl.TituloPersistenceImpl
 * @generated
 */
@ProviderType
public class TituloUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Titulo titulo) {
		getPersistence().clearCache(titulo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Titulo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Titulo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Titulo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Titulo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Titulo update(Titulo titulo) {
		return getPersistence().update(titulo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Titulo update(Titulo titulo, ServiceContext serviceContext) {
		return getPersistence().update(titulo, serviceContext);
	}

	/**
	* Returns all the titulos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching titulos
	*/
	public static List<Titulo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the titulos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @return the range of matching titulos
	*/
	public static List<Titulo> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the titulos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching titulos
	*/
	public static List<Titulo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the titulos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching titulos
	*/
	public static List<Titulo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Titulo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public static Titulo findByUuid_First(String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByUuid_First(String uuid,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public static Titulo findByUuid_Last(String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByUuid_Last(String uuid,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the titulos before and after the current titulo in the ordered set where uuid = &#63;.
	*
	* @param tituloId the primary key of the current titulo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next titulo
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public static Titulo[] findByUuid_PrevAndNext(long tituloId, String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence()
				   .findByUuid_PrevAndNext(tituloId, uuid, orderByComparator);
	}

	/**
	* Removes all the titulos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of titulos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching titulos
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTituloException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public static Titulo findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the titulo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the titulo that was removed
	*/
	public static Titulo removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of titulos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching titulos
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the titulos where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the matching titulos
	*/
	public static List<Titulo> findByT_D(String datasetId, long groupId) {
		return getPersistence().findByT_D(datasetId, groupId);
	}

	/**
	* Returns a range of all the titulos where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @return the range of matching titulos
	*/
	public static List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end) {
		return getPersistence().findByT_D(datasetId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the titulos where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching titulos
	*/
	public static List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Titulo> orderByComparator) {
		return getPersistence()
				   .findByT_D(datasetId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the titulos where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching titulos
	*/
	public static List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Titulo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByT_D(datasetId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public static Titulo findByT_D_First(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence()
				   .findByT_D_First(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the first titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByT_D_First(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence()
				   .fetchByT_D_First(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the last titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public static Titulo findByT_D_Last(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence()
				   .findByT_D_Last(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the last titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public static Titulo fetchByT_D_Last(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence()
				   .fetchByT_D_Last(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the titulos before and after the current titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param tituloId the primary key of the current titulo
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next titulo
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public static Titulo[] findByT_D_PrevAndNext(long tituloId,
		String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence()
				   .findByT_D_PrevAndNext(tituloId, datasetId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the titulos where datasetId = &#63; and groupId = &#63; from the database.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	*/
	public static void removeByT_D(String datasetId, long groupId) {
		getPersistence().removeByT_D(datasetId, groupId);
	}

	/**
	* Returns the number of titulos where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the number of matching titulos
	*/
	public static int countByT_D(String datasetId, long groupId) {
		return getPersistence().countByT_D(datasetId, groupId);
	}

	/**
	* Caches the titulo in the entity cache if it is enabled.
	*
	* @param titulo the titulo
	*/
	public static void cacheResult(Titulo titulo) {
		getPersistence().cacheResult(titulo);
	}

	/**
	* Caches the titulos in the entity cache if it is enabled.
	*
	* @param titulos the titulos
	*/
	public static void cacheResult(List<Titulo> titulos) {
		getPersistence().cacheResult(titulos);
	}

	/**
	* Creates a new titulo with the primary key. Does not add the titulo to the database.
	*
	* @param tituloId the primary key for the new titulo
	* @return the new titulo
	*/
	public static Titulo create(long tituloId) {
		return getPersistence().create(tituloId);
	}

	/**
	* Removes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo that was removed
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public static Titulo remove(long tituloId)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().remove(tituloId);
	}

	public static Titulo updateImpl(Titulo titulo) {
		return getPersistence().updateImpl(titulo);
	}

	/**
	* Returns the titulo with the primary key or throws a {@link NoSuchTituloException} if it could not be found.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public static Titulo findByPrimaryKey(long tituloId)
		throws com.liferay.docs.datosGob.exception.NoSuchTituloException {
		return getPersistence().findByPrimaryKey(tituloId);
	}

	/**
	* Returns the titulo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo, or <code>null</code> if a titulo with the primary key could not be found
	*/
	public static Titulo fetchByPrimaryKey(long tituloId) {
		return getPersistence().fetchByPrimaryKey(tituloId);
	}

	public static java.util.Map<java.io.Serializable, Titulo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the titulos.
	*
	* @return the titulos
	*/
	public static List<Titulo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the titulos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @return the range of titulos
	*/
	public static List<Titulo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the titulos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of titulos
	*/
	public static List<Titulo> findAll(int start, int end,
		OrderByComparator<Titulo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the titulos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TituloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of titulos
	* @param end the upper bound of the range of titulos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of titulos
	*/
	public static List<Titulo> findAll(int start, int end,
		OrderByComparator<Titulo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the titulos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of titulos.
	*
	* @return the number of titulos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TituloPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TituloPersistence, TituloPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TituloPersistence.class);

		ServiceTracker<TituloPersistence, TituloPersistence> serviceTracker = new ServiceTracker<TituloPersistence, TituloPersistence>(bundle.getBundleContext(),
				TituloPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}