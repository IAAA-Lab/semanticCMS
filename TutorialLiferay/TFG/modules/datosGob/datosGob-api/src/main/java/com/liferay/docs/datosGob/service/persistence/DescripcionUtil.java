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

import com.liferay.docs.datosGob.model.Descripcion;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the descripcion service. This utility wraps {@link com.liferay.docs.datosGob.service.persistence.impl.DescripcionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DescripcionPersistence
 * @see com.liferay.docs.datosGob.service.persistence.impl.DescripcionPersistenceImpl
 * @generated
 */
@ProviderType
public class DescripcionUtil {
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
	public static void clearCache(Descripcion descripcion) {
		getPersistence().clearCache(descripcion);
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
	public static List<Descripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Descripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Descripcion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Descripcion update(Descripcion descripcion) {
		return getPersistence().update(descripcion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Descripcion update(Descripcion descripcion,
		ServiceContext serviceContext) {
		return getPersistence().update(descripcion, serviceContext);
	}

	/**
	* Returns all the descripcions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching descripcions
	*/
	public static List<Descripcion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the descripcions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @return the range of matching descripcions
	*/
	public static List<Descripcion> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the descripcions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching descripcions
	*/
	public static List<Descripcion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the descripcions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching descripcions
	*/
	public static List<Descripcion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public static Descripcion findByUuid_First(String uuid,
		OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByUuid_First(String uuid,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public static Descripcion findByUuid_Last(String uuid,
		OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByUuid_Last(String uuid,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the descripcions before and after the current descripcion in the ordered set where uuid = &#63;.
	*
	* @param descripcionId the primary key of the current descripcion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next descripcion
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public static Descripcion[] findByUuid_PrevAndNext(long descripcionId,
		String uuid, OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(descripcionId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the descripcions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of descripcions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching descripcions
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDescripcionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public static Descripcion findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the descripcion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the descripcion that was removed
	*/
	public static Descripcion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of descripcions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching descripcions
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the matching descripcions
	*/
	public static List<Descripcion> findByDe_D(String datasetId, long groupId) {
		return getPersistence().findByDe_D(datasetId, groupId);
	}

	/**
	* Returns a range of all the descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @return the range of matching descripcions
	*/
	public static List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end) {
		return getPersistence().findByDe_D(datasetId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching descripcions
	*/
	public static List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence()
				   .findByDe_D(datasetId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching descripcions
	*/
	public static List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDe_D(datasetId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public static Descripcion findByDe_D_First(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence()
				   .findByDe_D_First(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByDe_D_First(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence()
				   .fetchByDe_D_First(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the last descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public static Descripcion findByDe_D_Last(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence()
				   .findByDe_D_Last(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the last descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public static Descripcion fetchByDe_D_Last(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence()
				   .fetchByDe_D_Last(datasetId, groupId, orderByComparator);
	}

	/**
	* Returns the descripcions before and after the current descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param descripcionId the primary key of the current descripcion
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next descripcion
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public static Descripcion[] findByDe_D_PrevAndNext(long descripcionId,
		String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence()
				   .findByDe_D_PrevAndNext(descripcionId, datasetId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the descripcions where datasetId = &#63; and groupId = &#63; from the database.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	*/
	public static void removeByDe_D(String datasetId, long groupId) {
		getPersistence().removeByDe_D(datasetId, groupId);
	}

	/**
	* Returns the number of descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the number of matching descripcions
	*/
	public static int countByDe_D(String datasetId, long groupId) {
		return getPersistence().countByDe_D(datasetId, groupId);
	}

	/**
	* Caches the descripcion in the entity cache if it is enabled.
	*
	* @param descripcion the descripcion
	*/
	public static void cacheResult(Descripcion descripcion) {
		getPersistence().cacheResult(descripcion);
	}

	/**
	* Caches the descripcions in the entity cache if it is enabled.
	*
	* @param descripcions the descripcions
	*/
	public static void cacheResult(List<Descripcion> descripcions) {
		getPersistence().cacheResult(descripcions);
	}

	/**
	* Creates a new descripcion with the primary key. Does not add the descripcion to the database.
	*
	* @param descripcionId the primary key for the new descripcion
	* @return the new descripcion
	*/
	public static Descripcion create(long descripcionId) {
		return getPersistence().create(descripcionId);
	}

	/**
	* Removes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion that was removed
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public static Descripcion remove(long descripcionId)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().remove(descripcionId);
	}

	public static Descripcion updateImpl(Descripcion descripcion) {
		return getPersistence().updateImpl(descripcion);
	}

	/**
	* Returns the descripcion with the primary key or throws a {@link NoSuchDescripcionException} if it could not be found.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public static Descripcion findByPrimaryKey(long descripcionId)
		throws com.liferay.docs.datosGob.exception.NoSuchDescripcionException {
		return getPersistence().findByPrimaryKey(descripcionId);
	}

	/**
	* Returns the descripcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion, or <code>null</code> if a descripcion with the primary key could not be found
	*/
	public static Descripcion fetchByPrimaryKey(long descripcionId) {
		return getPersistence().fetchByPrimaryKey(descripcionId);
	}

	public static java.util.Map<java.io.Serializable, Descripcion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the descripcions.
	*
	* @return the descripcions
	*/
	public static List<Descripcion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the descripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @return the range of descripcions
	*/
	public static List<Descripcion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the descripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of descripcions
	*/
	public static List<Descripcion> findAll(int start, int end,
		OrderByComparator<Descripcion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the descripcions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DescripcionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of descripcions
	* @param end the upper bound of the range of descripcions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of descripcions
	*/
	public static List<Descripcion> findAll(int start, int end,
		OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the descripcions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of descripcions.
	*
	* @return the number of descripcions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DescripcionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DescripcionPersistence, DescripcionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DescripcionPersistence.class);

		ServiceTracker<DescripcionPersistence, DescripcionPersistence> serviceTracker =
			new ServiceTracker<DescripcionPersistence, DescripcionPersistence>(bundle.getBundleContext(),
				DescripcionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}