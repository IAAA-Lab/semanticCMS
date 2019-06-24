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

import com.liferay.docs.datosGob.model.Dataset;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the dataset service. This utility wraps {@link com.liferay.docs.datosGob.service.persistence.impl.DatasetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DatasetPersistence
 * @see com.liferay.docs.datosGob.service.persistence.impl.DatasetPersistenceImpl
 * @generated
 */
@ProviderType
public class DatasetUtil {
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
	public static void clearCache(Dataset dataset) {
		getPersistence().clearCache(dataset);
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
	public static List<Dataset> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dataset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dataset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Dataset update(Dataset dataset) {
		return getPersistence().update(dataset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Dataset update(Dataset dataset, ServiceContext serviceContext) {
		return getPersistence().update(dataset, serviceContext);
	}

	/**
	* Returns all the datasets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching datasets
	*/
	public static List<Dataset> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the datasets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @return the range of matching datasets
	*/
	public static List<Dataset> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the datasets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching datasets
	*/
	public static List<Dataset> findByUuid(String uuid, int start, int end,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the datasets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching datasets
	*/
	public static List<Dataset> findByUuid(String uuid, int start, int end,
		OrderByComparator<Dataset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public static Dataset findByUuid_First(String uuid,
		OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByUuid_First(String uuid,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public static Dataset findByUuid_Last(String uuid,
		OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByUuid_Last(String uuid,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the datasets before and after the current dataset in the ordered set where uuid = &#63;.
	*
	* @param datasetId the primary key of the current dataset
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dataset
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public static Dataset[] findByUuid_PrevAndNext(String datasetId,
		String uuid, OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence()
				   .findByUuid_PrevAndNext(datasetId, uuid, orderByComparator);
	}

	/**
	* Removes all the datasets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of datasets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching datasets
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDatasetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public static Dataset findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the dataset where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dataset that was removed
	*/
	public static Dataset removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of datasets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching datasets
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the datasets where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @return the matching datasets
	*/
	public static List<Dataset> findByD_D(long groupId, String homepage) {
		return getPersistence().findByD_D(groupId, homepage);
	}

	/**
	* Returns a range of all the datasets where groupId = &#63; and homepage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @return the range of matching datasets
	*/
	public static List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end) {
		return getPersistence().findByD_D(groupId, homepage, start, end);
	}

	/**
	* Returns an ordered range of all the datasets where groupId = &#63; and homepage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching datasets
	*/
	public static List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end, OrderByComparator<Dataset> orderByComparator) {
		return getPersistence()
				   .findByD_D(groupId, homepage, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the datasets where groupId = &#63; and homepage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching datasets
	*/
	public static List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end, OrderByComparator<Dataset> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByD_D(groupId, homepage, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public static Dataset findByD_D_First(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence()
				   .findByD_D_First(groupId, homepage, orderByComparator);
	}

	/**
	* Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByD_D_First(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence()
				   .fetchByD_D_First(groupId, homepage, orderByComparator);
	}

	/**
	* Returns the last dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public static Dataset findByD_D_Last(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence()
				   .findByD_D_Last(groupId, homepage, orderByComparator);
	}

	/**
	* Returns the last dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public static Dataset fetchByD_D_Last(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence()
				   .fetchByD_D_Last(groupId, homepage, orderByComparator);
	}

	/**
	* Returns the datasets before and after the current dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param datasetId the primary key of the current dataset
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dataset
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public static Dataset[] findByD_D_PrevAndNext(String datasetId,
		long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence()
				   .findByD_D_PrevAndNext(datasetId, groupId, homepage,
			orderByComparator);
	}

	/**
	* Removes all the datasets where groupId = &#63; and homepage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	*/
	public static void removeByD_D(long groupId, String homepage) {
		getPersistence().removeByD_D(groupId, homepage);
	}

	/**
	* Returns the number of datasets where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @return the number of matching datasets
	*/
	public static int countByD_D(long groupId, String homepage) {
		return getPersistence().countByD_D(groupId, homepage);
	}

	/**
	* Caches the dataset in the entity cache if it is enabled.
	*
	* @param dataset the dataset
	*/
	public static void cacheResult(Dataset dataset) {
		getPersistence().cacheResult(dataset);
	}

	/**
	* Caches the datasets in the entity cache if it is enabled.
	*
	* @param datasets the datasets
	*/
	public static void cacheResult(List<Dataset> datasets) {
		getPersistence().cacheResult(datasets);
	}

	/**
	* Creates a new dataset with the primary key. Does not add the dataset to the database.
	*
	* @param datasetId the primary key for the new dataset
	* @return the new dataset
	*/
	public static Dataset create(String datasetId) {
		return getPersistence().create(datasetId);
	}

	/**
	* Removes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset that was removed
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public static Dataset remove(String datasetId)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().remove(datasetId);
	}

	public static Dataset updateImpl(Dataset dataset) {
		return getPersistence().updateImpl(dataset);
	}

	/**
	* Returns the dataset with the primary key or throws a {@link NoSuchDatasetException} if it could not be found.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public static Dataset findByPrimaryKey(String datasetId)
		throws com.liferay.docs.datosGob.exception.NoSuchDatasetException {
		return getPersistence().findByPrimaryKey(datasetId);
	}

	/**
	* Returns the dataset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset, or <code>null</code> if a dataset with the primary key could not be found
	*/
	public static Dataset fetchByPrimaryKey(String datasetId) {
		return getPersistence().fetchByPrimaryKey(datasetId);
	}

	public static java.util.Map<java.io.Serializable, Dataset> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the datasets.
	*
	* @return the datasets
	*/
	public static List<Dataset> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the datasets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @return the range of datasets
	*/
	public static List<Dataset> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the datasets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of datasets
	*/
	public static List<Dataset> findAll(int start, int end,
		OrderByComparator<Dataset> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the datasets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DatasetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of datasets
	* @param end the upper bound of the range of datasets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of datasets
	*/
	public static List<Dataset> findAll(int start, int end,
		OrderByComparator<Dataset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the datasets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of datasets.
	*
	* @return the number of datasets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DatasetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DatasetPersistence, DatasetPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DatasetPersistence.class);

		ServiceTracker<DatasetPersistence, DatasetPersistence> serviceTracker = new ServiceTracker<DatasetPersistence, DatasetPersistence>(bundle.getBundleContext(),
				DatasetPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}