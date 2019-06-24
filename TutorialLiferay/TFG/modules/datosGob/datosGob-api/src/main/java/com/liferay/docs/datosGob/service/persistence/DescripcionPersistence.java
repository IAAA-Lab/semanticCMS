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

import com.liferay.docs.datosGob.exception.NoSuchDescripcionException;
import com.liferay.docs.datosGob.model.Descripcion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the descripcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.persistence.impl.DescripcionPersistenceImpl
 * @see DescripcionUtil
 * @generated
 */
@ProviderType
public interface DescripcionPersistence extends BasePersistence<Descripcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DescripcionUtil} to access the descripcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the descripcions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching descripcions
	*/
	public java.util.List<Descripcion> findByUuid(String uuid);

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
	public java.util.List<Descripcion> findByUuid(String uuid, int start,
		int end);

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
	public java.util.List<Descripcion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

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
	public java.util.List<Descripcion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public Descripcion findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Returns the first descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

	/**
	* Returns the last descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public Descripcion findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Returns the last descripcion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

	/**
	* Returns the descripcions before and after the current descripcion in the ordered set where uuid = &#63;.
	*
	* @param descripcionId the primary key of the current descripcion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next descripcion
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public Descripcion[] findByUuid_PrevAndNext(long descripcionId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Removes all the descripcions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of descripcions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching descripcions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDescripcionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public Descripcion findByUUID_G(String uuid, long groupId)
		throws NoSuchDescripcionException;

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the descripcion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the descripcion that was removed
	*/
	public Descripcion removeByUUID_G(String uuid, long groupId)
		throws NoSuchDescripcionException;

	/**
	* Returns the number of descripcions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching descripcions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the matching descripcions
	*/
	public java.util.List<Descripcion> findByDe_D(String datasetId, long groupId);

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
	public java.util.List<Descripcion> findByDe_D(String datasetId,
		long groupId, int start, int end);

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
	public java.util.List<Descripcion> findByDe_D(String datasetId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

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
	public java.util.List<Descripcion> findByDe_D(String datasetId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public Descripcion findByDe_D_First(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByDe_D_First(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

	/**
	* Returns the last descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion
	* @throws NoSuchDescripcionException if a matching descripcion could not be found
	*/
	public Descripcion findByDe_D_Last(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Returns the last descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	*/
	public Descripcion fetchByDe_D_Last(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

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
	public Descripcion[] findByDe_D_PrevAndNext(long descripcionId,
		String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException;

	/**
	* Removes all the descripcions where datasetId = &#63; and groupId = &#63; from the database.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	*/
	public void removeByDe_D(String datasetId, long groupId);

	/**
	* Returns the number of descripcions where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the number of matching descripcions
	*/
	public int countByDe_D(String datasetId, long groupId);

	/**
	* Caches the descripcion in the entity cache if it is enabled.
	*
	* @param descripcion the descripcion
	*/
	public void cacheResult(Descripcion descripcion);

	/**
	* Caches the descripcions in the entity cache if it is enabled.
	*
	* @param descripcions the descripcions
	*/
	public void cacheResult(java.util.List<Descripcion> descripcions);

	/**
	* Creates a new descripcion with the primary key. Does not add the descripcion to the database.
	*
	* @param descripcionId the primary key for the new descripcion
	* @return the new descripcion
	*/
	public Descripcion create(long descripcionId);

	/**
	* Removes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion that was removed
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public Descripcion remove(long descripcionId)
		throws NoSuchDescripcionException;

	public Descripcion updateImpl(Descripcion descripcion);

	/**
	* Returns the descripcion with the primary key or throws a {@link NoSuchDescripcionException} if it could not be found.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion
	* @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	*/
	public Descripcion findByPrimaryKey(long descripcionId)
		throws NoSuchDescripcionException;

	/**
	* Returns the descripcion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param descripcionId the primary key of the descripcion
	* @return the descripcion, or <code>null</code> if a descripcion with the primary key could not be found
	*/
	public Descripcion fetchByPrimaryKey(long descripcionId);

	@Override
	public java.util.Map<java.io.Serializable, Descripcion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the descripcions.
	*
	* @return the descripcions
	*/
	public java.util.List<Descripcion> findAll();

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
	public java.util.List<Descripcion> findAll(int start, int end);

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
	public java.util.List<Descripcion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator);

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
	public java.util.List<Descripcion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the descripcions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of descripcions.
	*
	* @return the number of descripcions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}