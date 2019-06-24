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

import com.liferay.docs.datosGob.model.Coleccion;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the coleccion service. This utility wraps {@link com.liferay.docs.datosGob.service.persistence.impl.ColeccionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see ColeccionPersistence
 * @see com.liferay.docs.datosGob.service.persistence.impl.ColeccionPersistenceImpl
 * @generated
 */
@ProviderType
public class ColeccionUtil {
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
	public static void clearCache(Coleccion coleccion) {
		getPersistence().clearCache(coleccion);
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
	public static List<Coleccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Coleccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Coleccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Coleccion update(Coleccion coleccion) {
		return getPersistence().update(coleccion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Coleccion update(Coleccion coleccion,
		ServiceContext serviceContext) {
		return getPersistence().update(coleccion, serviceContext);
	}

	/**
	* Returns all the coleccions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching coleccions
	*/
	public static List<Coleccion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the coleccions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @return the range of matching coleccions
	*/
	public static List<Coleccion> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the coleccions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching coleccions
	*/
	public static List<Coleccion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the coleccions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching coleccions
	*/
	public static List<Coleccion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public static Coleccion findByUuid_First(String uuid,
		OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByUuid_First(String uuid,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public static Coleccion findByUuid_Last(String uuid,
		OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByUuid_Last(String uuid,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the coleccions before and after the current coleccion in the ordered set where uuid = &#63;.
	*
	* @param homepage the primary key of the current coleccion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public static Coleccion[] findByUuid_PrevAndNext(String homepage,
		String uuid, OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(homepage, uuid, orderByComparator);
	}

	/**
	* Removes all the coleccions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of coleccions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching coleccions
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchColeccionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public static Coleccion findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the coleccion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the coleccion that was removed
	*/
	public static Coleccion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of coleccions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching coleccions
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the coleccions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching coleccions
	*/
	public static List<Coleccion> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the coleccions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @return the range of matching coleccions
	*/
	public static List<Coleccion> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the coleccions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching coleccions
	*/
	public static List<Coleccion> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the coleccions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching coleccions
	*/
	public static List<Coleccion> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public static Coleccion findByGroupId_First(long groupId,
		OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByGroupId_First(long groupId,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public static Coleccion findByGroupId_Last(long groupId,
		OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public static Coleccion fetchByGroupId_Last(long groupId,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the coleccions before and after the current coleccion in the ordered set where groupId = &#63;.
	*
	* @param homepage the primary key of the current coleccion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public static Coleccion[] findByGroupId_PrevAndNext(String homepage,
		long groupId, OrderByComparator<Coleccion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(homepage, groupId,
			orderByComparator);
	}

	/**
	* Removes all the coleccions where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of coleccions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching coleccions
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the coleccion in the entity cache if it is enabled.
	*
	* @param coleccion the coleccion
	*/
	public static void cacheResult(Coleccion coleccion) {
		getPersistence().cacheResult(coleccion);
	}

	/**
	* Caches the coleccions in the entity cache if it is enabled.
	*
	* @param coleccions the coleccions
	*/
	public static void cacheResult(List<Coleccion> coleccions) {
		getPersistence().cacheResult(coleccions);
	}

	/**
	* Creates a new coleccion with the primary key. Does not add the coleccion to the database.
	*
	* @param homepage the primary key for the new coleccion
	* @return the new coleccion
	*/
	public static Coleccion create(String homepage) {
		return getPersistence().create(homepage);
	}

	/**
	* Removes the coleccion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion that was removed
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public static Coleccion remove(String homepage)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().remove(homepage);
	}

	public static Coleccion updateImpl(Coleccion coleccion) {
		return getPersistence().updateImpl(coleccion);
	}

	/**
	* Returns the coleccion with the primary key or throws a {@link NoSuchColeccionException} if it could not be found.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public static Coleccion findByPrimaryKey(String homepage)
		throws com.liferay.docs.datosGob.exception.NoSuchColeccionException {
		return getPersistence().findByPrimaryKey(homepage);
	}

	/**
	* Returns the coleccion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion, or <code>null</code> if a coleccion with the primary key could not be found
	*/
	public static Coleccion fetchByPrimaryKey(String homepage) {
		return getPersistence().fetchByPrimaryKey(homepage);
	}

	public static java.util.Map<java.io.Serializable, Coleccion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the coleccions.
	*
	* @return the coleccions
	*/
	public static List<Coleccion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the coleccions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @return the range of coleccions
	*/
	public static List<Coleccion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the coleccions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of coleccions
	*/
	public static List<Coleccion> findAll(int start, int end,
		OrderByComparator<Coleccion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the coleccions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColeccionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of coleccions
	* @param end the upper bound of the range of coleccions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of coleccions
	*/
	public static List<Coleccion> findAll(int start, int end,
		OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the coleccions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of coleccions.
	*
	* @return the number of coleccions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ColeccionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ColeccionPersistence, ColeccionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ColeccionPersistence.class);

		ServiceTracker<ColeccionPersistence, ColeccionPersistence> serviceTracker =
			new ServiceTracker<ColeccionPersistence, ColeccionPersistence>(bundle.getBundleContext(),
				ColeccionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}