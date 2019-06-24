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

import com.liferay.docs.datosGob.exception.NoSuchColeccionException;
import com.liferay.docs.datosGob.model.Coleccion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the coleccion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.persistence.impl.ColeccionPersistenceImpl
 * @see ColeccionUtil
 * @generated
 */
@ProviderType
public interface ColeccionPersistence extends BasePersistence<Coleccion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ColeccionUtil} to access the coleccion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the coleccions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching coleccions
	*/
	public java.util.List<Coleccion> findByUuid(String uuid);

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
	public java.util.List<Coleccion> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Coleccion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

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
	public java.util.List<Coleccion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public Coleccion findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Returns the first coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

	/**
	* Returns the last coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public Coleccion findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Returns the last coleccion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

	/**
	* Returns the coleccions before and after the current coleccion in the ordered set where uuid = &#63;.
	*
	* @param homepage the primary key of the current coleccion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public Coleccion[] findByUuid_PrevAndNext(String homepage, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Removes all the coleccions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of coleccions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching coleccions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchColeccionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public Coleccion findByUUID_G(String uuid, long groupId)
		throws NoSuchColeccionException;

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the coleccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the coleccion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the coleccion that was removed
	*/
	public Coleccion removeByUUID_G(String uuid, long groupId)
		throws NoSuchColeccionException;

	/**
	* Returns the number of coleccions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching coleccions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the coleccions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching coleccions
	*/
	public java.util.List<Coleccion> findByGroupId(long groupId);

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
	public java.util.List<Coleccion> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<Coleccion> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

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
	public java.util.List<Coleccion> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public Coleccion findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Returns the first coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

	/**
	* Returns the last coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion
	* @throws NoSuchColeccionException if a matching coleccion could not be found
	*/
	public Coleccion findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Returns the last coleccion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching coleccion, or <code>null</code> if a matching coleccion could not be found
	*/
	public Coleccion fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

	/**
	* Returns the coleccions before and after the current coleccion in the ordered set where groupId = &#63;.
	*
	* @param homepage the primary key of the current coleccion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public Coleccion[] findByGroupId_PrevAndNext(String homepage, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator)
		throws NoSuchColeccionException;

	/**
	* Removes all the coleccions where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of coleccions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching coleccions
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the coleccion in the entity cache if it is enabled.
	*
	* @param coleccion the coleccion
	*/
	public void cacheResult(Coleccion coleccion);

	/**
	* Caches the coleccions in the entity cache if it is enabled.
	*
	* @param coleccions the coleccions
	*/
	public void cacheResult(java.util.List<Coleccion> coleccions);

	/**
	* Creates a new coleccion with the primary key. Does not add the coleccion to the database.
	*
	* @param homepage the primary key for the new coleccion
	* @return the new coleccion
	*/
	public Coleccion create(String homepage);

	/**
	* Removes the coleccion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion that was removed
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public Coleccion remove(String homepage) throws NoSuchColeccionException;

	public Coleccion updateImpl(Coleccion coleccion);

	/**
	* Returns the coleccion with the primary key or throws a {@link NoSuchColeccionException} if it could not be found.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion
	* @throws NoSuchColeccionException if a coleccion with the primary key could not be found
	*/
	public Coleccion findByPrimaryKey(String homepage)
		throws NoSuchColeccionException;

	/**
	* Returns the coleccion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param homepage the primary key of the coleccion
	* @return the coleccion, or <code>null</code> if a coleccion with the primary key could not be found
	*/
	public Coleccion fetchByPrimaryKey(String homepage);

	@Override
	public java.util.Map<java.io.Serializable, Coleccion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the coleccions.
	*
	* @return the coleccions
	*/
	public java.util.List<Coleccion> findAll();

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
	public java.util.List<Coleccion> findAll(int start, int end);

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
	public java.util.List<Coleccion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator);

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
	public java.util.List<Coleccion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Coleccion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the coleccions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of coleccions.
	*
	* @return the number of coleccions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}