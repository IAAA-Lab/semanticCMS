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

import com.liferay.docs.datosGob.exception.NoSuchTituloException;
import com.liferay.docs.datosGob.model.Titulo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the titulo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.persistence.impl.TituloPersistenceImpl
 * @see TituloUtil
 * @generated
 */
@ProviderType
public interface TituloPersistence extends BasePersistence<Titulo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TituloUtil} to access the titulo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the titulos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching titulos
	*/
	public java.util.List<Titulo> findByUuid(String uuid);

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
	public java.util.List<Titulo> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Titulo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

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
	public java.util.List<Titulo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public Titulo findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Returns the first titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

	/**
	* Returns the last titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public Titulo findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Returns the last titulo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

	/**
	* Returns the titulos before and after the current titulo in the ordered set where uuid = &#63;.
	*
	* @param tituloId the primary key of the current titulo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next titulo
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public Titulo[] findByUuid_PrevAndNext(long tituloId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Removes all the titulos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of titulos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching titulos
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTituloException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public Titulo findByUUID_G(String uuid, long groupId)
		throws NoSuchTituloException;

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the titulo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the titulo that was removed
	*/
	public Titulo removeByUUID_G(String uuid, long groupId)
		throws NoSuchTituloException;

	/**
	* Returns the number of titulos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching titulos
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the titulos where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the matching titulos
	*/
	public java.util.List<Titulo> findByT_D(String datasetId, long groupId);

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
	public java.util.List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end);

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
	public java.util.List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

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
	public java.util.List<Titulo> findByT_D(String datasetId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public Titulo findByT_D_First(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Returns the first titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByT_D_First(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

	/**
	* Returns the last titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo
	* @throws NoSuchTituloException if a matching titulo could not be found
	*/
	public Titulo findByT_D_Last(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Returns the last titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	*/
	public Titulo fetchByT_D_Last(String datasetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

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
	public Titulo[] findByT_D_PrevAndNext(long tituloId, String datasetId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException;

	/**
	* Removes all the titulos where datasetId = &#63; and groupId = &#63; from the database.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	*/
	public void removeByT_D(String datasetId, long groupId);

	/**
	* Returns the number of titulos where datasetId = &#63; and groupId = &#63;.
	*
	* @param datasetId the dataset ID
	* @param groupId the group ID
	* @return the number of matching titulos
	*/
	public int countByT_D(String datasetId, long groupId);

	/**
	* Caches the titulo in the entity cache if it is enabled.
	*
	* @param titulo the titulo
	*/
	public void cacheResult(Titulo titulo);

	/**
	* Caches the titulos in the entity cache if it is enabled.
	*
	* @param titulos the titulos
	*/
	public void cacheResult(java.util.List<Titulo> titulos);

	/**
	* Creates a new titulo with the primary key. Does not add the titulo to the database.
	*
	* @param tituloId the primary key for the new titulo
	* @return the new titulo
	*/
	public Titulo create(long tituloId);

	/**
	* Removes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo that was removed
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public Titulo remove(long tituloId) throws NoSuchTituloException;

	public Titulo updateImpl(Titulo titulo);

	/**
	* Returns the titulo with the primary key or throws a {@link NoSuchTituloException} if it could not be found.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo
	* @throws NoSuchTituloException if a titulo with the primary key could not be found
	*/
	public Titulo findByPrimaryKey(long tituloId) throws NoSuchTituloException;

	/**
	* Returns the titulo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tituloId the primary key of the titulo
	* @return the titulo, or <code>null</code> if a titulo with the primary key could not be found
	*/
	public Titulo fetchByPrimaryKey(long tituloId);

	@Override
	public java.util.Map<java.io.Serializable, Titulo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the titulos.
	*
	* @return the titulos
	*/
	public java.util.List<Titulo> findAll();

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
	public java.util.List<Titulo> findAll(int start, int end);

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
	public java.util.List<Titulo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator);

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
	public java.util.List<Titulo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Titulo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the titulos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of titulos.
	*
	* @return the number of titulos
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}