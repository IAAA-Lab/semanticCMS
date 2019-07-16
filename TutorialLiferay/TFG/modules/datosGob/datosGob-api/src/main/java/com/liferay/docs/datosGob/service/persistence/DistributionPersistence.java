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

import com.liferay.docs.datosGob.exception.NoSuchDistributionException;
import com.liferay.docs.datosGob.model.Distribution;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the distribution service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.persistence.impl.DistributionPersistenceImpl
 * @see DistributionUtil
 * @generated
 */
@ProviderType
public interface DistributionPersistence extends BasePersistence<Distribution> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DistributionUtil} to access the distribution persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the distributions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching distributions
	*/
	public java.util.List<Distribution> findByUuid(String uuid);

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
	public java.util.List<Distribution> findByUuid(String uuid, int start,
		int end);

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
	public java.util.List<Distribution> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

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
	public java.util.List<Distribution> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public Distribution findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Returns the first distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

	/**
	* Returns the last distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public Distribution findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Returns the last distribution in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

	/**
	* Returns the distributions before and after the current distribution in the ordered set where uuid = &#63;.
	*
	* @param distributionId the primary key of the current distribution
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public Distribution[] findByUuid_PrevAndNext(long distributionId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Removes all the distributions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of distributions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching distributions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDistributionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public Distribution findByUUID_G(String uuid, long groupId)
		throws NoSuchDistributionException;

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the distribution where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the distribution that was removed
	*/
	public Distribution removeByUUID_G(String uuid, long groupId)
		throws NoSuchDistributionException;

	/**
	* Returns the number of distributions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching distributions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the distributions where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @return the matching distributions
	*/
	public java.util.List<Distribution> findByDi_D(long groupId,
		String datasetId);

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
	public java.util.List<Distribution> findByDi_D(long groupId,
		String datasetId, int start, int end);

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
	public java.util.List<Distribution> findByDi_D(long groupId,
		String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

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
	public java.util.List<Distribution> findByDi_D(long groupId,
		String datasetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public Distribution findByDi_D_First(long groupId, String datasetId,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByDi_D_First(long groupId, String datasetId,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

	/**
	* Returns the last distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution
	* @throws NoSuchDistributionException if a matching distribution could not be found
	*/
	public Distribution findByDi_D_Last(long groupId, String datasetId,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Returns the last distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	*/
	public Distribution fetchByDi_D_Last(long groupId, String datasetId,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

	/**
	* Returns the distributions before and after the current distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	*
	* @param distributionId the primary key of the current distribution
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public Distribution[] findByDi_D_PrevAndNext(long distributionId,
		long groupId, String datasetId,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException;

	/**
	* Removes all the distributions where groupId = &#63; and datasetId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	*/
	public void removeByDi_D(long groupId, String datasetId);

	/**
	* Returns the number of distributions where groupId = &#63; and datasetId = &#63;.
	*
	* @param groupId the group ID
	* @param datasetId the dataset ID
	* @return the number of matching distributions
	*/
	public int countByDi_D(long groupId, String datasetId);

	/**
	* Caches the distribution in the entity cache if it is enabled.
	*
	* @param distribution the distribution
	*/
	public void cacheResult(Distribution distribution);

	/**
	* Caches the distributions in the entity cache if it is enabled.
	*
	* @param distributions the distributions
	*/
	public void cacheResult(java.util.List<Distribution> distributions);

	/**
	* Creates a new distribution with the primary key. Does not add the distribution to the database.
	*
	* @param distributionId the primary key for the new distribution
	* @return the new distribution
	*/
	public Distribution create(long distributionId);

	/**
	* Removes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param distributionId the primary key of the distribution
	* @return the distribution that was removed
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public Distribution remove(long distributionId)
		throws NoSuchDistributionException;

	public Distribution updateImpl(Distribution distribution);

	/**
	* Returns the distribution with the primary key or throws a {@link NoSuchDistributionException} if it could not be found.
	*
	* @param distributionId the primary key of the distribution
	* @return the distribution
	* @throws NoSuchDistributionException if a distribution with the primary key could not be found
	*/
	public Distribution findByPrimaryKey(long distributionId)
		throws NoSuchDistributionException;

	/**
	* Returns the distribution with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param distributionId the primary key of the distribution
	* @return the distribution, or <code>null</code> if a distribution with the primary key could not be found
	*/
	public Distribution fetchByPrimaryKey(long distributionId);

	@Override
	public java.util.Map<java.io.Serializable, Distribution> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the distributions.
	*
	* @return the distributions
	*/
	public java.util.List<Distribution> findAll();

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
	public java.util.List<Distribution> findAll(int start, int end);

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
	public java.util.List<Distribution> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator);

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
	public java.util.List<Distribution> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the distributions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of distributions.
	*
	* @return the number of distributions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}