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

import com.liferay.docs.datosGob.exception.NoSuchDescripcionException;
import com.liferay.docs.datosGob.model.Descripcion;
import com.liferay.docs.datosGob.model.impl.DescripcionImpl;
import com.liferay.docs.datosGob.model.impl.DescripcionModelImpl;
import com.liferay.docs.datosGob.service.persistence.DescripcionPersistence;

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
 * The persistence implementation for the descripcion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DescripcionPersistence
 * @see com.liferay.docs.datosGob.service.persistence.DescripcionUtil
 * @generated
 */
@ProviderType
public class DescripcionPersistenceImpl extends BasePersistenceImpl<Descripcion>
	implements DescripcionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DescripcionUtil} to access the descripcion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DescripcionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DescripcionModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the descripcions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching descripcions
	 */
	@Override
	public List<Descripcion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Descripcion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Descripcion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Descripcion> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Descripcion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
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

		List<Descripcion> list = null;

		if (retrieveFromCache) {
			list = (List<Descripcion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Descripcion descripcion : list) {
					if (!Objects.equals(uuid, descripcion.getUuid())) {
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

			query.append(_SQL_SELECT_DESCRIPCION_WHERE);

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
				query.append(DescripcionModelImpl.ORDER_BY_JPQL);
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
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first descripcion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching descripcion
	 * @throws NoSuchDescripcionException if a matching descripcion could not be found
	 */
	@Override
	public Descripcion findByUuid_First(String uuid,
		OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByUuid_First(uuid, orderByComparator);

		if (descripcion != null) {
			return descripcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDescripcionException(msg.toString());
	}

	/**
	 * Returns the first descripcion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByUuid_First(String uuid,
		OrderByComparator<Descripcion> orderByComparator) {
		List<Descripcion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last descripcion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching descripcion
	 * @throws NoSuchDescripcionException if a matching descripcion could not be found
	 */
	@Override
	public Descripcion findByUuid_Last(String uuid,
		OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByUuid_Last(uuid, orderByComparator);

		if (descripcion != null) {
			return descripcion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDescripcionException(msg.toString());
	}

	/**
	 * Returns the last descripcion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByUuid_Last(String uuid,
		OrderByComparator<Descripcion> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Descripcion> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Descripcion[] findByUuid_PrevAndNext(long descripcionId,
		String uuid, OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = findByPrimaryKey(descripcionId);

		Session session = null;

		try {
			session = openSession();

			Descripcion[] array = new DescripcionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, descripcion, uuid,
					orderByComparator, true);

			array[1] = descripcion;

			array[2] = getByUuid_PrevAndNext(session, descripcion, uuid,
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

	protected Descripcion getByUuid_PrevAndNext(Session session,
		Descripcion descripcion, String uuid,
		OrderByComparator<Descripcion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DESCRIPCION_WHERE);

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
			query.append(DescripcionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(descripcion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Descripcion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the descripcions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Descripcion descripcion : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(descripcion);
		}
	}

	/**
	 * Returns the number of descripcions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching descripcions
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DESCRIPCION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "descripcion.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "descripcion.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(descripcion.uuid IS NULL OR descripcion.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DescripcionModelImpl.UUID_COLUMN_BITMASK |
			DescripcionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the descripcion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDescripcionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching descripcion
	 * @throws NoSuchDescripcionException if a matching descripcion could not be found
	 */
	@Override
	public Descripcion findByUUID_G(String uuid, long groupId)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByUUID_G(uuid, groupId);

		if (descripcion == null) {
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

			throw new NoSuchDescripcionException(msg.toString());
		}

		return descripcion;
	}

	/**
	 * Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the descripcion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Descripcion) {
			Descripcion descripcion = (Descripcion)result;

			if (!Objects.equals(uuid, descripcion.getUuid()) ||
					(groupId != descripcion.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DESCRIPCION_WHERE);

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

				List<Descripcion> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Descripcion descripcion = list.get(0);

					result = descripcion;

					cacheResult(descripcion);
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
			return (Descripcion)result;
		}
	}

	/**
	 * Removes the descripcion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the descripcion that was removed
	 */
	@Override
	public Descripcion removeByUUID_G(String uuid, long groupId)
		throws NoSuchDescripcionException {
		Descripcion descripcion = findByUUID_G(uuid, groupId);

		return remove(descripcion);
	}

	/**
	 * Returns the number of descripcions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching descripcions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DESCRIPCION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "descripcion.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "descripcion.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(descripcion.uuid IS NULL OR descripcion.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "descripcion.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DE_D = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDe_D",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, DescripcionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDe_D",
			new String[] { String.class.getName(), Long.class.getName() },
			DescripcionModelImpl.DATASETID_COLUMN_BITMASK |
			DescripcionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DE_D = new FinderPath(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDe_D",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the descripcions where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @return the matching descripcions
	 */
	@Override
	public List<Descripcion> findByDe_D(String datasetId, long groupId) {
		return findByDe_D(datasetId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end) {
		return findByDe_D(datasetId, groupId, start, end, null);
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
	@Override
	public List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Descripcion> orderByComparator) {
		return findByDe_D(datasetId, groupId, start, end, orderByComparator,
			true);
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
	@Override
	public List<Descripcion> findByDe_D(String datasetId, long groupId,
		int start, int end, OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D;
			finderArgs = new Object[] { datasetId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DE_D;
			finderArgs = new Object[] {
					datasetId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<Descripcion> list = null;

		if (retrieveFromCache) {
			list = (List<Descripcion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Descripcion descripcion : list) {
					if (!Objects.equals(datasetId, descripcion.getDatasetId()) ||
							(groupId != descripcion.getGroupId())) {
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

			query.append(_SQL_SELECT_DESCRIPCION_WHERE);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_DE_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_DE_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_DE_D_DATASETID_2);
			}

			query.append(_FINDER_COLUMN_DE_D_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DescripcionModelImpl.ORDER_BY_JPQL);
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
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching descripcion
	 * @throws NoSuchDescripcionException if a matching descripcion could not be found
	 */
	@Override
	public Descripcion findByDe_D_First(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByDe_D_First(datasetId, groupId,
				orderByComparator);

		if (descripcion != null) {
			return descripcion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datasetId=");
		msg.append(datasetId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchDescripcionException(msg.toString());
	}

	/**
	 * Returns the first descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByDe_D_First(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator) {
		List<Descripcion> list = findByDe_D(datasetId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Descripcion findByDe_D_Last(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByDe_D_Last(datasetId, groupId,
				orderByComparator);

		if (descripcion != null) {
			return descripcion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datasetId=");
		msg.append(datasetId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchDescripcionException(msg.toString());
	}

	/**
	 * Returns the last descripcion in the ordered set where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching descripcion, or <code>null</code> if a matching descripcion could not be found
	 */
	@Override
	public Descripcion fetchByDe_D_Last(String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator) {
		int count = countByDe_D(datasetId, groupId);

		if (count == 0) {
			return null;
		}

		List<Descripcion> list = findByDe_D(datasetId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Descripcion[] findByDe_D_PrevAndNext(long descripcionId,
		String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator)
		throws NoSuchDescripcionException {
		Descripcion descripcion = findByPrimaryKey(descripcionId);

		Session session = null;

		try {
			session = openSession();

			Descripcion[] array = new DescripcionImpl[3];

			array[0] = getByDe_D_PrevAndNext(session, descripcion, datasetId,
					groupId, orderByComparator, true);

			array[1] = descripcion;

			array[2] = getByDe_D_PrevAndNext(session, descripcion, datasetId,
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

	protected Descripcion getByDe_D_PrevAndNext(Session session,
		Descripcion descripcion, String datasetId, long groupId,
		OrderByComparator<Descripcion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DESCRIPCION_WHERE);

		boolean bindDatasetId = false;

		if (datasetId == null) {
			query.append(_FINDER_COLUMN_DE_D_DATASETID_1);
		}
		else if (datasetId.equals("")) {
			query.append(_FINDER_COLUMN_DE_D_DATASETID_3);
		}
		else {
			bindDatasetId = true;

			query.append(_FINDER_COLUMN_DE_D_DATASETID_2);
		}

		query.append(_FINDER_COLUMN_DE_D_GROUPID_2);

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
			query.append(DescripcionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(descripcion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Descripcion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the descripcions where datasetId = &#63; and groupId = &#63; from the database.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByDe_D(String datasetId, long groupId) {
		for (Descripcion descripcion : findByDe_D(datasetId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(descripcion);
		}
	}

	/**
	 * Returns the number of descripcions where datasetId = &#63; and groupId = &#63;.
	 *
	 * @param datasetId the dataset ID
	 * @param groupId the group ID
	 * @return the number of matching descripcions
	 */
	@Override
	public int countByDe_D(String datasetId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DE_D;

		Object[] finderArgs = new Object[] { datasetId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DESCRIPCION_WHERE);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_DE_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_DE_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_DE_D_DATASETID_2);
			}

			query.append(_FINDER_COLUMN_DE_D_GROUPID_2);

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

	private static final String _FINDER_COLUMN_DE_D_DATASETID_1 = "descripcion.datasetId IS NULL AND ";
	private static final String _FINDER_COLUMN_DE_D_DATASETID_2 = "descripcion.datasetId = ? AND ";
	private static final String _FINDER_COLUMN_DE_D_DATASETID_3 = "(descripcion.datasetId IS NULL OR descripcion.datasetId = '') AND ";
	private static final String _FINDER_COLUMN_DE_D_GROUPID_2 = "descripcion.groupId = ?";

	public DescripcionPersistenceImpl() {
		setModelClass(Descripcion.class);

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
	 * Caches the descripcion in the entity cache if it is enabled.
	 *
	 * @param descripcion the descripcion
	 */
	@Override
	public void cacheResult(Descripcion descripcion) {
		entityCache.putResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionImpl.class, descripcion.getPrimaryKey(), descripcion);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { descripcion.getUuid(), descripcion.getGroupId() },
			descripcion);

		descripcion.resetOriginalValues();
	}

	/**
	 * Caches the descripcions in the entity cache if it is enabled.
	 *
	 * @param descripcions the descripcions
	 */
	@Override
	public void cacheResult(List<Descripcion> descripcions) {
		for (Descripcion descripcion : descripcions) {
			if (entityCache.getResult(
						DescripcionModelImpl.ENTITY_CACHE_ENABLED,
						DescripcionImpl.class, descripcion.getPrimaryKey()) == null) {
				cacheResult(descripcion);
			}
			else {
				descripcion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all descripcions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DescripcionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the descripcion.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Descripcion descripcion) {
		entityCache.removeResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionImpl.class, descripcion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DescripcionModelImpl)descripcion, true);
	}

	@Override
	public void clearCache(List<Descripcion> descripcions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Descripcion descripcion : descripcions) {
			entityCache.removeResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
				DescripcionImpl.class, descripcion.getPrimaryKey());

			clearUniqueFindersCache((DescripcionModelImpl)descripcion, true);
		}
	}

	protected void cacheUniqueFindersCache(
		DescripcionModelImpl descripcionModelImpl) {
		Object[] args = new Object[] {
				descripcionModelImpl.getUuid(),
				descripcionModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			descripcionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DescripcionModelImpl descripcionModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					descripcionModelImpl.getUuid(),
					descripcionModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((descripcionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					descripcionModelImpl.getOriginalUuid(),
					descripcionModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new descripcion with the primary key. Does not add the descripcion to the database.
	 *
	 * @param descripcionId the primary key for the new descripcion
	 * @return the new descripcion
	 */
	@Override
	public Descripcion create(long descripcionId) {
		Descripcion descripcion = new DescripcionImpl();

		descripcion.setNew(true);
		descripcion.setPrimaryKey(descripcionId);

		String uuid = PortalUUIDUtil.generate();

		descripcion.setUuid(uuid);

		return descripcion;
	}

	/**
	 * Removes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param descripcionId the primary key of the descripcion
	 * @return the descripcion that was removed
	 * @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion remove(long descripcionId)
		throws NoSuchDescripcionException {
		return remove((Serializable)descripcionId);
	}

	/**
	 * Removes the descripcion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the descripcion
	 * @return the descripcion that was removed
	 * @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion remove(Serializable primaryKey)
		throws NoSuchDescripcionException {
		Session session = null;

		try {
			session = openSession();

			Descripcion descripcion = (Descripcion)session.get(DescripcionImpl.class,
					primaryKey);

			if (descripcion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDescripcionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(descripcion);
		}
		catch (NoSuchDescripcionException nsee) {
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
	protected Descripcion removeImpl(Descripcion descripcion) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(descripcion)) {
				descripcion = (Descripcion)session.get(DescripcionImpl.class,
						descripcion.getPrimaryKeyObj());
			}

			if (descripcion != null) {
				session.delete(descripcion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (descripcion != null) {
			clearCache(descripcion);
		}

		return descripcion;
	}

	@Override
	public Descripcion updateImpl(Descripcion descripcion) {
		boolean isNew = descripcion.isNew();

		if (!(descripcion instanceof DescripcionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(descripcion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(descripcion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in descripcion proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Descripcion implementation " +
				descripcion.getClass());
		}

		DescripcionModelImpl descripcionModelImpl = (DescripcionModelImpl)descripcion;

		if (Validator.isNull(descripcion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			descripcion.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (descripcion.isNew()) {
				session.save(descripcion);

				descripcion.setNew(false);
			}
			else {
				descripcion = (Descripcion)session.merge(descripcion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DescripcionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { descripcionModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					descripcionModelImpl.getDatasetId(),
					descripcionModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DE_D, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((descripcionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						descripcionModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { descripcionModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((descripcionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						descripcionModelImpl.getOriginalDatasetId(),
						descripcionModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DE_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D,
					args);

				args = new Object[] {
						descripcionModelImpl.getDatasetId(),
						descripcionModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DE_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DE_D,
					args);
			}
		}

		entityCache.putResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
			DescripcionImpl.class, descripcion.getPrimaryKey(), descripcion,
			false);

		clearUniqueFindersCache(descripcionModelImpl, false);
		cacheUniqueFindersCache(descripcionModelImpl);

		descripcion.resetOriginalValues();

		return descripcion;
	}

	/**
	 * Returns the descripcion with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the descripcion
	 * @return the descripcion
	 * @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDescripcionException {
		Descripcion descripcion = fetchByPrimaryKey(primaryKey);

		if (descripcion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDescripcionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return descripcion;
	}

	/**
	 * Returns the descripcion with the primary key or throws a {@link NoSuchDescripcionException} if it could not be found.
	 *
	 * @param descripcionId the primary key of the descripcion
	 * @return the descripcion
	 * @throws NoSuchDescripcionException if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion findByPrimaryKey(long descripcionId)
		throws NoSuchDescripcionException {
		return findByPrimaryKey((Serializable)descripcionId);
	}

	/**
	 * Returns the descripcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the descripcion
	 * @return the descripcion, or <code>null</code> if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
				DescripcionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Descripcion descripcion = (Descripcion)serializable;

		if (descripcion == null) {
			Session session = null;

			try {
				session = openSession();

				descripcion = (Descripcion)session.get(DescripcionImpl.class,
						primaryKey);

				if (descripcion != null) {
					cacheResult(descripcion);
				}
				else {
					entityCache.putResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
						DescripcionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
					DescripcionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return descripcion;
	}

	/**
	 * Returns the descripcion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param descripcionId the primary key of the descripcion
	 * @return the descripcion, or <code>null</code> if a descripcion with the primary key could not be found
	 */
	@Override
	public Descripcion fetchByPrimaryKey(long descripcionId) {
		return fetchByPrimaryKey((Serializable)descripcionId);
	}

	@Override
	public Map<Serializable, Descripcion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Descripcion> map = new HashMap<Serializable, Descripcion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Descripcion descripcion = fetchByPrimaryKey(primaryKey);

			if (descripcion != null) {
				map.put(primaryKey, descripcion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
					DescripcionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Descripcion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DESCRIPCION_WHERE_PKS_IN);

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

			for (Descripcion descripcion : (List<Descripcion>)q.list()) {
				map.put(descripcion.getPrimaryKeyObj(), descripcion);

				cacheResult(descripcion);

				uncachedPrimaryKeys.remove(descripcion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DescripcionModelImpl.ENTITY_CACHE_ENABLED,
					DescripcionImpl.class, primaryKey, nullModel);
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
	 * Returns all the descripcions.
	 *
	 * @return the descripcions
	 */
	@Override
	public List<Descripcion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Descripcion> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Descripcion> findAll(int start, int end,
		OrderByComparator<Descripcion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Descripcion> findAll(int start, int end,
		OrderByComparator<Descripcion> orderByComparator,
		boolean retrieveFromCache) {
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

		List<Descripcion> list = null;

		if (retrieveFromCache) {
			list = (List<Descripcion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DESCRIPCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DESCRIPCION;

				if (pagination) {
					sql = sql.concat(DescripcionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Descripcion>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the descripcions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Descripcion descripcion : findAll()) {
			remove(descripcion);
		}
	}

	/**
	 * Returns the number of descripcions.
	 *
	 * @return the number of descripcions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DESCRIPCION);

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
		return DescripcionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the descripcion persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DescripcionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DESCRIPCION = "SELECT descripcion FROM Descripcion descripcion";
	private static final String _SQL_SELECT_DESCRIPCION_WHERE_PKS_IN = "SELECT descripcion FROM Descripcion descripcion WHERE descripcionId IN (";
	private static final String _SQL_SELECT_DESCRIPCION_WHERE = "SELECT descripcion FROM Descripcion descripcion WHERE ";
	private static final String _SQL_COUNT_DESCRIPCION = "SELECT COUNT(descripcion) FROM Descripcion descripcion";
	private static final String _SQL_COUNT_DESCRIPCION_WHERE = "SELECT COUNT(descripcion) FROM Descripcion descripcion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "descripcion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Descripcion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Descripcion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DescripcionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}