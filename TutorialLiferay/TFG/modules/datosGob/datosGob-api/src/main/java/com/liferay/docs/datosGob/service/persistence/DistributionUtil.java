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

import com.liferay.docs.datosGob.model.Distribution;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the distribution service. This utility wraps {@link com.liferay.docs.datosGob.service.persistence.impl.DistributionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DistributionPersistence
 * @see com.liferay.docs.datosGob.service.persistence.impl.DistributionPersistenceImpl
 * @generated
 */
@ProviderType
public class DistributionUtil {
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
	public static void clearCache(Distribution distribution) {
		getPersistence().clearCache(distribution);
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
	public static List<Distribution> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Distribution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Distribution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Distribution> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Distribution update(Distribution distribution) {
		return getPersistence().update(distribution);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Distribution update(Distribution distribution,
		ServiceContext serviceContext) {
		return getPersistence().update(distribution, serviceContext);
	}

	/**
	* Returns all the distributions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching distributions
	*/
	public static List<Distribution> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the distributions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @return the range of matching distributions
	*/
	public static List<Distribution> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the distributions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching distributions
	*/
	public static List<Distribution> findByUuid(String uuid, int start,
		int end, OrderByComparator<Distribution> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the distributions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching distributions
	*/
	public static List<Distribution> findByUuid(String uuid, int start,
		int end, OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public static Distribution findByUuid_First(String uuid,
		OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByUuid_First(String uuid,
		OrderByComparator<Distribution> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public static Distribution findByUuid_Last(String uuid,
		OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByUuid_Last(String uuid,
		OrderByComparator<Distribution> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the distributions before and after the current distribution in the ordered set where uuid = &#63;.
	*
	* @param url the primary key of the current distribution
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public static Distribution[] findByUuid_PrevAndNext(String url,
		String uuid, OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(url, uuid, orderByComparator);
	}

	/**
	* Removes all the distributions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of distributions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching distributions
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDistributionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public static Distribution findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the distribution where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the distribution that was removed
	*/
	public static Distribution removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of distributions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching distributions
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the distributions where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @return the matching distributions
	*/
	public static List<Distribution> findByDi_D(long groupId, String datasetId) {
		return getPersistence().findByDi_D(groupId, datasetId);
	}

	/**
	* Returns a range of all the distributions where groupId = &#63; and datasetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @return the range of matching distributions
	*/
	public static List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end) {
		return getPersistence().findByDi_D(groupId, datasetId, start, end);
	}

	/**
	* Returns an ordered range of all the distributions where groupId = &#63; and datasetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching distributions
	*/
	public static List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end, OrderByComparator<Distribution> orderByComparator) {
		return getPersistence()
				   .findByDi_D(groupId, datasetId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the distributions where groupId = &#63; and datasetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching distributions
	*/
	public static List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end, OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDi_D(groupId, datasetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public static Distribution findByDi_D_First(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence()
				   .findByDi_D_First(groupId, datasetId, orderByComparator);
	}

	/**
	* Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByDi_D_First(long groupId,
		String datasetId, OrderByComparator<Distribution> orderByComparator) {
		return getPersistence()
				   .fetchByDi_D_First(groupId, datasetId, orderByComparator);
	}

	/**
	* Returns the last distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public static Distribution findByDi_D_Last(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence()
				   .findByDi_D_Last(groupId, datasetId, orderByComparator);
	}

	/**
	* Returns the last distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public static Distribution fetchByDi_D_Last(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator) {
		return getPersistence()
				   .fetchByDi_D_Last(groupId, datasetId, orderByComparator);
	}

	/**
	* Returns the distributions before and after the current distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param url the primary key of the current distribution
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public static Distribution[] findByDi_D_PrevAndNext(String url,
		long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence()
				   .findByDi_D_PrevAndNext(url, groupId, datasetId,
			orderByComparator);
	}

	/**
	* Removes all the distributions where groupId = &#63; and datasetId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	*/
	public static void removeByDi_D(long groupId, String datasetId) {
		getPersistence().removeByDi_D(groupId, datasetId);
	}

	/**
	* Returns the number of distributions where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @return the number of matching distributions
	*/
	public static int countByDi_D(long groupId, String datasetId) {
		return getPersistence().countByDi_D(groupId, datasetId);
	}

	/**
	* Caches the distribution in the entity cache if it is enabled.
	*
	* @param distribution the distribution
	*/
	public static void cacheResult(Distribution distribution) {
		getPersistence().cacheResult(distribution);
	}

	/**
	* Caches the distributions in the entity cache if it is enabled.
	*
	* @param distributions the distributions
	*/
	public static void cacheResult(List<Distribution> distributions) {
		getPersistence().cacheResult(distributions);
	}

	/**
	* Creates a new distribution with the primary key. Does not add the distribution to the database.
	*
	* @param url the primary key for the new distribution
	* @return the new distribution
	*/
	public static Distribution create(String url) {
		return getPersistence().create(url);
	}

	/**
	* Removes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param url the primary key of the distribution
	* @return the distribution that was removed
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public static Distribution remove(String url)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().remove(url);
	}

	public static Distribution updateImpl(Distribution distribution) {
		return getPersistence().updateImpl(distribution);
	}

	/**
	* Returns the distribution with the primary key or throws a {@link NoSuchDistributionException} if it could not be found.
	*
	* @param url the primary key of the distribution
	* @return the distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public static Distribution findByPrimaryKey(String url)
		throws com.liferay.docs.datosGob.exception.NoSuchDistributionException {
		return getPersistence().findByPrimaryKey(url);
	}

	/**
	* Returns the distribution with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param url the primary key of the distribution
	* @return the distribution, or <code>null</code> if a distribution with the primary key could not be found
	*/
	public static Distribution fetchByPrimaryKey(String url) {
		return getPersistence().fetchByPrimaryKey(url);
	}

	public static java.util.Map<java.io.Serializable, Distribution> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the distributions.
	*
	* @return the distributions
	*/
	public static List<Distribution> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the distributions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @return the range of distributions
	*/
	public static List<Distribution> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the distributions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of distributions
	*/
	public static List<Distribution> findAll(int start, int end,
		OrderByComparator<Distribution> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the distributions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DistributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of distributions
	* @param end the upper bound of the range of distributions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of distributions
	*/
	public static List<Distribution> findAll(int start, int end,
		OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the distributions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of distributions.
	*
	* @return the number of distributions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DistributionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DistributionPersistence, DistributionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DistributionPersistence.class);

		ServiceTracker<DistributionPersistence, DistributionPersistence> serviceTracker =
			new ServiceTracker<DistributionPersistence, DistributionPersistence>(bundle.getBundleContext(),
				DistributionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}