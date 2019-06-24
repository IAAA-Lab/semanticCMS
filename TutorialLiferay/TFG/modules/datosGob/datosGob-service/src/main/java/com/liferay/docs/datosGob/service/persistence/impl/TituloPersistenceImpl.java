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

package com.liferay.docs.datosGob.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.exception.NoSuchTituloException;
import com.liferay.docs.datosGob.model.Titulo;
import com.liferay.docs.datosGob.model.impl.TituloImpl;
import com.liferay.docs.datosGob.model.impl.TituloModelImpl;
import com.liferay.docs.datosGob.service.persistence.TituloPersistence;

import com.liferay.portal.kernel.util.StringBundler;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the titulo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see TituloPersistence
 * @see com.liferay.docs.datosGob.service.persistence.TituloUtil
 * @generated
 */
@ProviderType
public class TituloPersistenceImpl extends BasePersistenceImpl<Titulo>
	implements TituloPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TituloUtil} to access the titulo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TituloImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TituloModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the titulos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching titulos
	 */
	@Override
	public List<Titulo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Titulo> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Titulo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Titulo> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Titulo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Titulo> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Titulo> list = null;

		if (retrieveFromCache) {
			list = (List<Titulo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Titulo titulo : list) {
					if (!Objects.equals(uuid, titulo.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TITULO_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TituloModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first titulo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching titulo
	 * @throws NoSuchTituloException if a matching titulo could not be found
	 */
	@Override
	public Titulo findByUuid_First(String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = fetchByUuid_First(uuid, orderByComparator);

		if (titulo != null) {
			return titulo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchTituloException(msg.toString());
	}

	/**
	 * Returns the first titulo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByUuid_First(String uuid,
		OrderByComparator<Titulo> orderByComparator) {
		List<Titulo> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last titulo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching titulo
	 * @throws NoSuchTituloException if a matching titulo could not be found
	 */
	@Override
	public Titulo findByUuid_Last(String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = fetchByUuid_Last(uuid, orderByComparator);

		if (titulo != null) {
			return titulo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchTituloException(msg.toString());
	}

	/**
	 * Returns the last titulo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByUuid_Last(String uuid,
		OrderByComparator<Titulo> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Titulo> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Titulo[] findByUuid_PrevAndNext(long tituloId, String uuid,
		OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = findByPrimaryKey(tituloId);

		Session session = null;

		try {
			session = openSession();

			Titulo[] array = new TituloImpl[3];

			array[0] = getByUuid_PrevAndNext(session, titulo, uuid,
					orderByComparator, true);

			array[1] = titulo;

			array[2] = getByUuid_PrevAndNext(session, titulo, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Titulo getByUuid_PrevAndNext(Session session, Titulo titulo,
		String uuid, OrderByComparator<Titulo> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TITULO_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TituloModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(titulo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Titulo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the titulos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Titulo titulo : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(titulo);
		}
	}

	/**
	 * Returns the number of titulos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching titulos
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TITULO_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "titulo.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "titulo.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(titulo.uuid IS NULL OR titulo.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TituloModelImpl.UUID_COLUMN_BITMASK |
			TituloModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the titulo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTituloException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching titulo
	 * @throws NoSuchTituloException if a matching titulo could not be found
	 */
	@Override
	public Titulo findByUUID_G(String uuid, long groupId)
		throws NoSuchTituloException {
		Titulo titulo = fetchByUUID_G(uuid, groupId);

		if (titulo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTituloException(msg.toString());
		}

		return titulo;
	}

	/**
	 * Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the titulo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Titulo) {
			Titulo titulo = (Titulo)result;

			if (!Objects.equals(uuid, titulo.getUuid()) ||
					(groupId != titulo.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TITULO_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Titulo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Titulo titulo = list.get(0);

					result = titulo;

					cacheResult(titulo);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Titulo)result;
		}
	}

	/**
	 * Removes the titulo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the titulo that was removed
	 */
	@Override
	public Titulo removeByUUID_G(String uuid, long groupId)
		throws NoSuchTituloException {
		Titulo titulo = findByUUID_G(uuid, groupId);

		return remove(titulo);
	}

	/**
	 * Returns the number of titulos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching titulos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TITULO_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "titulo.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "titulo.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(titulo.uuid IS NULL OR titulo.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "titulo.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T_D = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT_D",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, TituloImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT_D",
			new String[] { String.class.getName(), Long.class.getName() },
			TituloModelImpl.DATASETID_COLUMN_BITMASK |
			TituloModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_D = new FinderPath(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_D",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the titulos where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @return the matching titulos
	 */
	@Override
	public List<Titulo> findByT_D(String datasetId, long groupId) {
		return findByT_D(datasetId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Titulo> findByT_D(String datasetId, long groupId, int start,
		int end) {
		return findByT_D(datasetId, groupId, start, end, null);
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
	@Override
	public List<Titulo> findByT_D(String datasetId, long groupId, int start,
		int end, OrderByComparator<Titulo> orderByComparator) {
		return findByT_D(datasetId, groupId, start, end, orderByComparator, true);
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
	@Override
	public List<Titulo> findByT_D(String datasetId, long groupId, int start,
		int end, OrderByComparator<Titulo> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D;
			finderArgs = new Object[] { datasetId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T_D;
			finderArgs = new Object[] {
					datasetId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<Titulo> list = null;

		if (retrieveFromCache) {
			list = (List<Titulo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Titulo titulo : list) {
					if (!Objects.equals(datasetId, titulo.getDatasetId()) ||
							(groupId != titulo.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TITULO_WHERE);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_T_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_T_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_T_D_DATASETID_2);
			}

			query.append(_FINDER_COLUMN_T_D_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TituloModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDatasetId) {
					qPos.add(datasetId);
				}

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Titulo findByT_D_First(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = fetchByT_D_First(datasetId, groupId, orderByComparator);

		if (titulo != null) {
			return titulo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datasetId=");
		msg.append(datasetId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchTituloException(msg.toString());
	}

	/**
	 * Returns the first titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByT_D_First(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator) {
		List<Titulo> list = findByT_D(datasetId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Titulo findByT_D_Last(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = fetchByT_D_Last(datasetId, groupId, orderByComparator);

		if (titulo != null) {
			return titulo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datasetId=");
		msg.append(datasetId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchTituloException(msg.toString());
	}

	/**
	 * Returns the last titulo in the ordered set where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching titulo, or <code>null</code> if a matching titulo could not be found
	 */
	@Override
	public Titulo fetchByT_D_Last(String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator) {
		int count = countByT_D(datasetId, groupId);

		if (count == 0) {
			return null;
		}

		List<Titulo> list = findByT_D(datasetId, groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Titulo[] findByT_D_PrevAndNext(long tituloId, String datasetId,
		long groupId, OrderByComparator<Titulo> orderByComparator)
		throws NoSuchTituloException {
		Titulo titulo = findByPrimaryKey(tituloId);

		Session session = null;

		try {
			session = openSession();

			Titulo[] array = new TituloImpl[3];

			array[0] = getByT_D_PrevAndNext(session, titulo, datasetId,
					groupId, orderByComparator, true);

			array[1] = titulo;

			array[2] = getByT_D_PrevAndNext(session, titulo, datasetId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Titulo getByT_D_PrevAndNext(Session session, Titulo titulo,
		String datasetId, long groupId,
		OrderByComparator<Titulo> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TITULO_WHERE);

		boolean bindDatasetId = false;

		if (datasetId == null) {
			query.append(_FINDER_COLUMN_T_D_DATASETID_1);
		}
		else if (datasetId.equals("")) {
			query.append(_FINDER_COLUMN_T_D_DATASETID_3);
		}
		else {
			bindDatasetId = true;

			query.append(_FINDER_COLUMN_T_D_DATASETID_2);
		}

		query.append(_FINDER_COLUMN_T_D_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TituloModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDatasetId) {
			qPos.add(datasetId);
		}

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(titulo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Titulo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the titulos where datasetId = &#63; and groupId = &#63; from the database.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByT_D(String datasetId, long groupId) {
		for (Titulo titulo : findByT_D(datasetId, groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(titulo);
		}
	}

	/**
	 * Returns the number of titulos where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @return the number of matching titulos
	 */
	@Override
	public int countByT_D(String datasetId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_D;

		Object[] finderArgs = new Object[] { datasetId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TITULO_WHERE);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_T_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_T_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_T_D_DATASETID_2);
			}

			query.append(_FINDER_COLUMN_T_D_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDatasetId) {
					qPos.add(datasetId);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_T_D_DATASETID_1 = "titulo.datasetId IS NULL AND ";
	private static final String _FINDER_COLUMN_T_D_DATASETID_2 = "titulo.datasetId = ? AND ";
	private static final String _FINDER_COLUMN_T_D_DATASETID_3 = "(titulo.datasetId IS NULL OR titulo.datasetId = '') AND ";
	private static final String _FINDER_COLUMN_T_D_GROUPID_2 = "titulo.groupId = ?";

	public TituloPersistenceImpl() {
		setModelClass(Titulo.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the titulo in the entity cache if it is enabled.
	 *
	 * @param titulo the titulo
	 */
	@Override
	public void cacheResult(Titulo titulo) {
		entityCache.putResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloImpl.class, titulo.getPrimaryKey(), titulo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { titulo.getUuid(), titulo.getGroupId() }, titulo);

		titulo.resetOriginalValues();
	}

	/**
	 * Caches the titulos in the entity cache if it is enabled.
	 *
	 * @param titulos the titulos
	 */
	@Override
	public void cacheResult(List<Titulo> titulos) {
		for (Titulo titulo : titulos) {
			if (entityCache.getResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
						TituloImpl.class, titulo.getPrimaryKey()) == null) {
				cacheResult(titulo);
			}
			else {
				titulo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all titulos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TituloImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the titulo.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Titulo titulo) {
		entityCache.removeResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloImpl.class, titulo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TituloModelImpl)titulo, true);
	}

	@Override
	public void clearCache(List<Titulo> titulos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Titulo titulo : titulos) {
			entityCache.removeResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
				TituloImpl.class, titulo.getPrimaryKey());

			clearUniqueFindersCache((TituloModelImpl)titulo, true);
		}
	}

	protected void cacheUniqueFindersCache(TituloModelImpl tituloModelImpl) {
		Object[] args = new Object[] {
				tituloModelImpl.getUuid(), tituloModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			tituloModelImpl, false);
	}

	protected void clearUniqueFindersCache(TituloModelImpl tituloModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					tituloModelImpl.getUuid(), tituloModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((tituloModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					tituloModelImpl.getOriginalUuid(),
					tituloModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new titulo with the primary key. Does not add the titulo to the database.
	 *
	 * @param tituloId the primary key for the new titulo
	 * @return the new titulo
	 */
	@Override
	public Titulo create(long tituloId) {
		Titulo titulo = new TituloImpl();

		titulo.setNew(true);
		titulo.setPrimaryKey(tituloId);

		String uuid = PortalUUIDUtil.generate();

		titulo.setUuid(uuid);

		return titulo;
	}

	/**
	 * Removes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tituloId the primary key of the titulo
	 * @return the titulo that was removed
	 * @throws NoSuchTituloException if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo remove(long tituloId) throws NoSuchTituloException {
		return remove((Serializable)tituloId);
	}

	/**
	 * Removes the titulo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the titulo
	 * @return the titulo that was removed
	 * @throws NoSuchTituloException if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo remove(Serializable primaryKey) throws NoSuchTituloException {
		Session session = null;

		try {
			session = openSession();

			Titulo titulo = (Titulo)session.get(TituloImpl.class, primaryKey);

			if (titulo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTituloException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(titulo);
		}
		catch (NoSuchTituloException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Titulo removeImpl(Titulo titulo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(titulo)) {
				titulo = (Titulo)session.get(TituloImpl.class,
						titulo.getPrimaryKeyObj());
			}

			if (titulo != null) {
				session.delete(titulo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (titulo != null) {
			clearCache(titulo);
		}

		return titulo;
	}

	@Override
	public Titulo updateImpl(Titulo titulo) {
		boolean isNew = titulo.isNew();

		if (!(titulo instanceof TituloModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(titulo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(titulo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in titulo proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Titulo implementation " +
				titulo.getClass());
		}

		TituloModelImpl tituloModelImpl = (TituloModelImpl)titulo;

		if (Validator.isNull(titulo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			titulo.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (titulo.isNew()) {
				session.save(titulo);

				titulo.setNew(false);
			}
			else {
				titulo = (Titulo)session.merge(titulo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!TituloModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { tituloModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					tituloModelImpl.getDatasetId(), tituloModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_T_D, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((tituloModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tituloModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { tituloModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((tituloModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tituloModelImpl.getOriginalDatasetId(),
						tituloModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_T_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D,
					args);

				args = new Object[] {
						tituloModelImpl.getDatasetId(),
						tituloModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_T_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T_D,
					args);
			}
		}

		entityCache.putResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
			TituloImpl.class, titulo.getPrimaryKey(), titulo, false);

		clearUniqueFindersCache(tituloModelImpl, false);
		cacheUniqueFindersCache(tituloModelImpl);

		titulo.resetOriginalValues();

		return titulo;
	}

	/**
	 * Returns the titulo with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the titulo
	 * @return the titulo
	 * @throws NoSuchTituloException if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTituloException {
		Titulo titulo = fetchByPrimaryKey(primaryKey);

		if (titulo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTituloException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return titulo;
	}

	/**
	 * Returns the titulo with the primary key or throws a {@link NoSuchTituloException} if it could not be found.
	 *
	 * @param tituloId the primary key of the titulo
	 * @return the titulo
	 * @throws NoSuchTituloException if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo findByPrimaryKey(long tituloId) throws NoSuchTituloException {
		return findByPrimaryKey((Serializable)tituloId);
	}

	/**
	 * Returns the titulo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the titulo
	 * @return the titulo, or <code>null</code> if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
				TituloImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Titulo titulo = (Titulo)serializable;

		if (titulo == null) {
			Session session = null;

			try {
				session = openSession();

				titulo = (Titulo)session.get(TituloImpl.class, primaryKey);

				if (titulo != null) {
					cacheResult(titulo);
				}
				else {
					entityCache.putResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
						TituloImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
					TituloImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return titulo;
	}

	/**
	 * Returns the titulo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tituloId the primary key of the titulo
	 * @return the titulo, or <code>null</code> if a titulo with the primary key could not be found
	 */
	@Override
	public Titulo fetchByPrimaryKey(long tituloId) {
		return fetchByPrimaryKey((Serializable)tituloId);
	}

	@Override
	public Map<Serializable, Titulo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Titulo> map = new HashMap<Serializable, Titulo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Titulo titulo = fetchByPrimaryKey(primaryKey);

			if (titulo != null) {
				map.put(primaryKey, titulo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
					TituloImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Titulo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TITULO_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Titulo titulo : (List<Titulo>)q.list()) {
				map.put(titulo.getPrimaryKeyObj(), titulo);

				cacheResult(titulo);

				uncachedPrimaryKeys.remove(titulo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TituloModelImpl.ENTITY_CACHE_ENABLED,
					TituloImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the titulos.
	 *
	 * @return the titulos
	 */
	@Override
	public List<Titulo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Titulo> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Titulo> findAll(int start, int end,
		OrderByComparator<Titulo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Titulo> findAll(int start, int end,
		OrderByComparator<Titulo> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Titulo> list = null;

		if (retrieveFromCache) {
			list = (List<Titulo>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TITULO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TITULO;

				if (pagination) {
					sql = sql.concat(TituloModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Titulo>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the titulos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Titulo titulo : findAll()) {
			remove(titulo);
		}
	}

	/**
	 * Returns the number of titulos.
	 *
	 * @return the number of titulos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TITULO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TituloModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the titulo persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TituloImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TITULO = "SELECT titulo FROM Titulo titulo";
	private static final String _SQL_SELECT_TITULO_WHERE_PKS_IN = "SELECT titulo FROM Titulo titulo WHERE tituloId IN (";
	private static final String _SQL_SELECT_TITULO_WHERE = "SELECT titulo FROM Titulo titulo WHERE ";
	private static final String _SQL_COUNT_TITULO = "SELECT COUNT(titulo) FROM Titulo titulo";
	private static final String _SQL_COUNT_TITULO_WHERE = "SELECT COUNT(titulo) FROM Titulo titulo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "titulo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Titulo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Titulo exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TituloPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}