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

import com.liferay.docs.datosGob.exception.NoSuchDatasetException;
import com.liferay.docs.datosGob.model.Dataset;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the dataset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.persistence.impl.DatasetPersistenceImpl
 * @see DatasetUtil
 * @generated
 */
@ProviderType
public interface DatasetPersistence extends BasePersistence<Dataset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DatasetUtil} to access the dataset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the datasets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching datasets
	*/
	public java.util.List<Dataset> findByUuid(String uuid);

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
	public java.util.List<Dataset> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Dataset> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

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
	public java.util.List<Dataset> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public Dataset findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Returns the first dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

	/**
	* Returns the last dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public Dataset findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Returns the last dataset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

	/**
	* Returns the datasets before and after the current dataset in the ordered set where uuid = &#63;.
	*
	* @param datasetId the primary key of the current dataset
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dataset
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public Dataset[] findByUuid_PrevAndNext(String datasetId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Removes all the datasets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of datasets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching datasets
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDatasetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public Dataset findByUUID_G(String uuid, long groupId)
		throws NoSuchDatasetException;

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dataset where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dataset that was removed
	*/
	public Dataset removeByUUID_G(String uuid, long groupId)
		throws NoSuchDatasetException;

	/**
	* Returns the number of datasets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching datasets
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the datasets where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @return the matching datasets
	*/
	public java.util.List<Dataset> findByD_D(long groupId, String homepage);

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
	public java.util.List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end);

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
	public java.util.List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

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
	public java.util.List<Dataset> findByD_D(long groupId, String homepage,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public Dataset findByD_D_First(long groupId, String homepage,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByD_D_First(long groupId, String homepage,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

	/**
	* Returns the last dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset
	* @throws NoSuchDatasetException if a matching dataset could not be found
	*/
	public Dataset findByD_D_Last(long groupId, String homepage,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Returns the last dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	*/
	public Dataset fetchByD_D_Last(long groupId, String homepage,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

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
	public Dataset[] findByD_D_PrevAndNext(String datasetId, long groupId,
		String homepage,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException;

	/**
	* Removes all the datasets where groupId = &#63; and homepage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	*/
	public void removeByD_D(long groupId, String homepage);

	/**
	* Returns the number of datasets where groupId = &#63; and homepage = &#63;.
	*
	* @param groupId the group ID
	* @param homepage the homepage
	* @return the number of matching datasets
	*/
	public int countByD_D(long groupId, String homepage);

	/**
	* Caches the dataset in the entity cache if it is enabled.
	*
	* @param dataset the dataset
	*/
	public void cacheResult(Dataset dataset);

	/**
	* Caches the datasets in the entity cache if it is enabled.
	*
	* @param datasets the datasets
	*/
	public void cacheResult(java.util.List<Dataset> datasets);

	/**
	* Creates a new dataset with the primary key. Does not add the dataset to the database.
	*
	* @param datasetId the primary key for the new dataset
	* @return the new dataset
	*/
	public Dataset create(String datasetId);

	/**
	* Removes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset that was removed
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public Dataset remove(String datasetId) throws NoSuchDatasetException;

	public Dataset updateImpl(Dataset dataset);

	/**
	* Returns the dataset with the primary key or throws a {@link NoSuchDatasetException} if it could not be found.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset
	* @throws NoSuchDatasetException if a dataset with the primary key could not be found
	*/
	public Dataset findByPrimaryKey(String datasetId)
		throws NoSuchDatasetException;

	/**
	* Returns the dataset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datasetId the primary key of the dataset
	* @return the dataset, or <code>null</code> if a dataset with the primary key could not be found
	*/
	public Dataset fetchByPrimaryKey(String datasetId);

	@Override
	public java.util.Map<java.io.Serializable, Dataset> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the datasets.
	*
	* @return the datasets
	*/
	public java.util.List<Dataset> findAll();

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
	public java.util.List<Dataset> findAll(int start, int end);

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
	public java.util.List<Dataset> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator);

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
	public java.util.List<Dataset> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dataset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the datasets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of datasets.
	*
	* @return the number of datasets
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}