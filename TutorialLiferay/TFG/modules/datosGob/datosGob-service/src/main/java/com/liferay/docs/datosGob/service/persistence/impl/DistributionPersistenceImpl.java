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

import com.liferay.docs.datosGob.exception.NoSuchDistributionException;
import com.liferay.docs.datosGob.model.Distribution;
import com.liferay.docs.datosGob.model.impl.DistributionImpl;
import com.liferay.docs.datosGob.model.impl.DistributionModelImpl;
import com.liferay.docs.datosGob.service.persistence.DistributionPersistence;

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
 * The persistence implementation for the distribution service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DistributionPersistence
 * @see com.liferay.docs.datosGob.service.persistence.DistributionUtil
 * @generated
 */
@ProviderType
public class DistributionPersistenceImpl extends BasePersistenceImpl<Distribution>
	implements DistributionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DistributionUtil} to access the distribution persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DistributionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DistributionModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the distributions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching distributions
	 */
	@Override
	public List<Distribution> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Distribution> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Distribution> findByUuid(String uuid, int start, int end,
		OrderByComparator<Distribution> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Distribution> findByUuid(String uuid, int start, int end,
		OrderByComparator<Distribution> orderByComparator,
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

		List<Distribution> list = null;

		if (retrieveFromCache) {
			list = (List<Distribution>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Distribution distribution : list) {
					if (!Objects.equals(uuid, distribution.getUuid())) {
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

			query.append(_SQL_SELECT_DISTRIBUTION_WHERE);

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
				query.append(DistributionModelImpl.ORDER_BY_JPQL);
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
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first distribution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching distribution
	 * @throws NoSuchDistributionException if a matching distribution could not be found
	 */
	@Override
	public Distribution findByUuid_First(String uuid,
		OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByUuid_First(uuid, orderByComparator);

		if (distribution != null) {
			return distribution;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDistributionException(msg.toString());
	}

	/**
	 * Returns the first distribution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByUuid_First(String uuid,
		OrderByComparator<Distribution> orderByComparator) {
		List<Distribution> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last distribution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching distribution
	 * @throws NoSuchDistributionException if a matching distribution could not be found
	 */
	@Override
	public Distribution findByUuid_Last(String uuid,
		OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByUuid_Last(uuid, orderByComparator);

		if (distribution != null) {
			return distribution;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDistributionException(msg.toString());
	}

	/**
	 * Returns the last distribution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByUuid_Last(String uuid,
		OrderByComparator<Distribution> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Distribution> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Distribution[] findByUuid_PrevAndNext(String url, String uuid,
		OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = findByPrimaryKey(url);

		Session session = null;

		try {
			session = openSession();

			Distribution[] array = new DistributionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, distribution, uuid,
					orderByComparator, true);

			array[1] = distribution;

			array[2] = getByUuid_PrevAndNext(session, distribution, uuid,
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

	protected Distribution getByUuid_PrevAndNext(Session session,
		Distribution distribution, String uuid,
		OrderByComparator<Distribution> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DISTRIBUTION_WHERE);

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
			query.append(DistributionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(distribution);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Distribution> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the distributions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Distribution distribution : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(distribution);
		}
	}

	/**
	 * Returns the number of distributions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching distributions
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DISTRIBUTION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "distribution.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "distribution.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(distribution.uuid IS NULL OR distribution.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DistributionModelImpl.UUID_COLUMN_BITMASK |
			DistributionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the distribution where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDistributionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching distribution
	 * @throws NoSuchDistributionException if a matching distribution could not be found
	 */
	@Override
	public Distribution findByUUID_G(String uuid, long groupId)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByUUID_G(uuid, groupId);

		if (distribution == null) {
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

			throw new NoSuchDistributionException(msg.toString());
		}

		return distribution;
	}

	/**
	 * Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the distribution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Distribution) {
			Distribution distribution = (Distribution)result;

			if (!Objects.equals(uuid, distribution.getUuid()) ||
					(groupId != distribution.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DISTRIBUTION_WHERE);

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

				List<Distribution> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Distribution distribution = list.get(0);

					result = distribution;

					cacheResult(distribution);
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
			return (Distribution)result;
		}
	}

	/**
	 * Removes the distribution where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the distribution that was removed
	 */
	@Override
	public Distribution removeByUUID_G(String uuid, long groupId)
		throws NoSuchDistributionException {
		Distribution distribution = findByUUID_G(uuid, groupId);

		return remove(distribution);
	}

	/**
	 * Returns the number of distributions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching distributions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DISTRIBUTION_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "distribution.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "distribution.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(distribution.uuid IS NULL OR distribution.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "distribution.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DI_D = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDi_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, DistributionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDi_D",
			new String[] { Long.class.getName(), String.class.getName() },
			DistributionModelImpl.GROUPID_COLUMN_BITMASK |
			DistributionModelImpl.DATASETID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DI_D = new FinderPath(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDi_D",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the distributions where groupId = &#63; and datasetId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 * @return the matching distributions
	 */
	@Override
	public List<Distribution> findByDi_D(long groupId, String datasetId) {
		return findByDi_D(groupId, datasetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end) {
		return findByDi_D(groupId, datasetId, start, end, null);
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
	@Override
	public List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end, OrderByComparator<Distribution> orderByComparator) {
		return findByDi_D(groupId, datasetId, start, end, orderByComparator,
			true);
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
	@Override
	public List<Distribution> findByDi_D(long groupId, String datasetId,
		int start, int end, OrderByComparator<Distribution> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D;
			finderArgs = new Object[] { groupId, datasetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DI_D;
			finderArgs = new Object[] {
					groupId, datasetId,
					
					start, end, orderByComparator
				};
		}

		List<Distribution> list = null;

		if (retrieveFromCache) {
			list = (List<Distribution>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Distribution distribution : list) {
					if ((groupId != distribution.getGroupId()) ||
							!Objects.equals(datasetId,
								distribution.getDatasetId())) {
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

			query.append(_SQL_SELECT_DISTRIBUTION_WHERE);

			query.append(_FINDER_COLUMN_DI_D_GROUPID_2);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_DI_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_DI_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_DI_D_DATASETID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DistributionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDatasetId) {
					qPos.add(datasetId);
				}

				if (!pagination) {
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching distribution
	 * @throws NoSuchDistributionException if a matching distribution could not be found
	 */
	@Override
	public Distribution findByDi_D_First(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByDi_D_First(groupId, datasetId,
				orderByComparator);

		if (distribution != null) {
			return distribution;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", datasetId=");
		msg.append(datasetId);

		msg.append("}");

		throw new NoSuchDistributionException(msg.toString());
	}

	/**
	 * Returns the first distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByDi_D_First(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator) {
		List<Distribution> list = findByDi_D(groupId, datasetId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Distribution findByDi_D_Last(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByDi_D_Last(groupId, datasetId,
				orderByComparator);

		if (distribution != null) {
			return distribution;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", datasetId=");
		msg.append(datasetId);

		msg.append("}");

		throw new NoSuchDistributionException(msg.toString());
	}

	/**
	 * Returns the last distribution in the ordered set where groupId = &#63; and datasetId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching distribution, or <code>null</code> if a matching distribution could not be found
	 */
	@Override
	public Distribution fetchByDi_D_Last(long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator) {
		int count = countByDi_D(groupId, datasetId);

		if (count == 0) {
			return null;
		}

		List<Distribution> list = findByDi_D(groupId, datasetId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Distribution[] findByDi_D_PrevAndNext(String url, long groupId,
		String datasetId, OrderByComparator<Distribution> orderByComparator)
		throws NoSuchDistributionException {
		Distribution distribution = findByPrimaryKey(url);

		Session session = null;

		try {
			session = openSession();

			Distribution[] array = new DistributionImpl[3];

			array[0] = getByDi_D_PrevAndNext(session, distribution, groupId,
					datasetId, orderByComparator, true);

			array[1] = distribution;

			array[2] = getByDi_D_PrevAndNext(session, distribution, groupId,
					datasetId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Distribution getByDi_D_PrevAndNext(Session session,
		Distribution distribution, long groupId, String datasetId,
		OrderByComparator<Distribution> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DISTRIBUTION_WHERE);

		query.append(_FINDER_COLUMN_DI_D_GROUPID_2);

		boolean bindDatasetId = false;

		if (datasetId == null) {
			query.append(_FINDER_COLUMN_DI_D_DATASETID_1);
		}
		else if (datasetId.equals("")) {
			query.append(_FINDER_COLUMN_DI_D_DATASETID_3);
		}
		else {
			bindDatasetId = true;

			query.append(_FINDER_COLUMN_DI_D_DATASETID_2);
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
			query.append(DistributionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDatasetId) {
			qPos.add(datasetId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(distribution);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Distribution> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the distributions where groupId = &#63; and datasetId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 */
	@Override
	public void removeByDi_D(long groupId, String datasetId) {
		for (Distribution distribution : findByDi_D(groupId, datasetId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(distribution);
		}
	}

	/**
	 * Returns the number of distributions where groupId = &#63; and datasetId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param datasetId the dataset ID
	 * @return the number of matching distributions
	 */
	@Override
	public int countByDi_D(long groupId, String datasetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DI_D;

		Object[] finderArgs = new Object[] { groupId, datasetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DISTRIBUTION_WHERE);

			query.append(_FINDER_COLUMN_DI_D_GROUPID_2);

			boolean bindDatasetId = false;

			if (datasetId == null) {
				query.append(_FINDER_COLUMN_DI_D_DATASETID_1);
			}
			else if (datasetId.equals("")) {
				query.append(_FINDER_COLUMN_DI_D_DATASETID_3);
			}
			else {
				bindDatasetId = true;

				query.append(_FINDER_COLUMN_DI_D_DATASETID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDatasetId) {
					qPos.add(datasetId);
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

	private static final String _FINDER_COLUMN_DI_D_GROUPID_2 = "distribution.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DI_D_DATASETID_1 = "distribution.datasetId IS NULL";
	private static final String _FINDER_COLUMN_DI_D_DATASETID_2 = "distribution.datasetId = ?";
	private static final String _FINDER_COLUMN_DI_D_DATASETID_3 = "(distribution.datasetId IS NULL OR distribution.datasetId = '')";

	public DistributionPersistenceImpl() {
		setModelClass(Distribution.class);

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
	 * Caches the distribution in the entity cache if it is enabled.
	 *
	 * @param distribution the distribution
	 */
	@Override
	public void cacheResult(Distribution distribution) {
		entityCache.putResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionImpl.class, distribution.getPrimaryKey(), distribution);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { distribution.getUuid(), distribution.getGroupId() },
			distribution);

		distribution.resetOriginalValues();
	}

	/**
	 * Caches the distributions in the entity cache if it is enabled.
	 *
	 * @param distributions the distributions
	 */
	@Override
	public void cacheResult(List<Distribution> distributions) {
		for (Distribution distribution : distributions) {
			if (entityCache.getResult(
						DistributionModelImpl.ENTITY_CACHE_ENABLED,
						DistributionImpl.class, distribution.getPrimaryKey()) == null) {
				cacheResult(distribution);
			}
			else {
				distribution.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all distributions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DistributionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the distribution.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Distribution distribution) {
		entityCache.removeResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionImpl.class, distribution.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DistributionModelImpl)distribution, true);
	}

	@Override
	public void clearCache(List<Distribution> distributions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Distribution distribution : distributions) {
			entityCache.removeResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
				DistributionImpl.class, distribution.getPrimaryKey());

			clearUniqueFindersCache((DistributionModelImpl)distribution, true);
		}
	}

	protected void cacheUniqueFindersCache(
		DistributionModelImpl distributionModelImpl) {
		Object[] args = new Object[] {
				distributionModelImpl.getUuid(),
				distributionModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			distributionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DistributionModelImpl distributionModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					distributionModelImpl.getUuid(),
					distributionModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((distributionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					distributionModelImpl.getOriginalUuid(),
					distributionModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new distribution with the primary key. Does not add the distribution to the database.
	 *
	 * @param url the primary key for the new distribution
	 * @return the new distribution
	 */
	@Override
	public Distribution create(String url) {
		Distribution distribution = new DistributionImpl();

		distribution.setNew(true);
		distribution.setPrimaryKey(url);

		String uuid = PortalUUIDUtil.generate();

		distribution.setUuid(uuid);

		return distribution;
	}

	/**
	 * Removes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param url the primary key of the distribution
	 * @return the distribution that was removed
	 * @throws NoSuchDistributionException if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution remove(String url) throws NoSuchDistributionException {
		return remove((Serializable)url);
	}

	/**
	 * Removes the distribution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the distribution
	 * @return the distribution that was removed
	 * @throws NoSuchDistributionException if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution remove(Serializable primaryKey)
		throws NoSuchDistributionException {
		Session session = null;

		try {
			session = openSession();

			Distribution distribution = (Distribution)session.get(DistributionImpl.class,
					primaryKey);

			if (distribution == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDistributionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(distribution);
		}
		catch (NoSuchDistributionException nsee) {
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
	protected Distribution removeImpl(Distribution distribution) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(distribution)) {
				distribution = (Distribution)session.get(DistributionImpl.class,
						distribution.getPrimaryKeyObj());
			}

			if (distribution != null) {
				session.delete(distribution);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (distribution != null) {
			clearCache(distribution);
		}

		return distribution;
	}

	@Override
	public Distribution updateImpl(Distribution distribution) {
		boolean isNew = distribution.isNew();

		if (!(distribution instanceof DistributionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(distribution.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(distribution);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in distribution proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Distribution implementation " +
				distribution.getClass());
		}

		DistributionModelImpl distributionModelImpl = (DistributionModelImpl)distribution;

		if (Validator.isNull(distribution.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			distribution.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (distribution.isNew()) {
				session.save(distribution);

				distribution.setNew(false);
			}
			else {
				distribution = (Distribution)session.merge(distribution);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DistributionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { distributionModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					distributionModelImpl.getGroupId(),
					distributionModelImpl.getDatasetId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DI_D, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((distributionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						distributionModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { distributionModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((distributionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						distributionModelImpl.getOriginalGroupId(),
						distributionModelImpl.getOriginalDatasetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DI_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D,
					args);

				args = new Object[] {
						distributionModelImpl.getGroupId(),
						distributionModelImpl.getDatasetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DI_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DI_D,
					args);
			}
		}

		entityCache.putResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
			DistributionImpl.class, distribution.getPrimaryKey(), distribution,
			false);

		clearUniqueFindersCache(distributionModelImpl, false);
		cacheUniqueFindersCache(distributionModelImpl);

		distribution.resetOriginalValues();

		return distribution;
	}

	/**
	 * Returns the distribution with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the distribution
	 * @return the distribution
	 * @throws NoSuchDistributionException if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDistributionException {
		Distribution distribution = fetchByPrimaryKey(primaryKey);

		if (distribution == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDistributionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return distribution;
	}

	/**
	 * Returns the distribution with the primary key or throws a {@link NoSuchDistributionException} if it could not be found.
	 *
	 * @param url the primary key of the distribution
	 * @return the distribution
	 * @throws NoSuchDistributionException if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution findByPrimaryKey(String url)
		throws NoSuchDistributionException {
		return findByPrimaryKey((Serializable)url);
	}

	/**
	 * Returns the distribution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the distribution
	 * @return the distribution, or <code>null</code> if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
				DistributionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Distribution distribution = (Distribution)serializable;

		if (distribution == null) {
			Session session = null;

			try {
				session = openSession();

				distribution = (Distribution)session.get(DistributionImpl.class,
						primaryKey);

				if (distribution != null) {
					cacheResult(distribution);
				}
				else {
					entityCache.putResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
						DistributionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
					DistributionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return distribution;
	}

	/**
	 * Returns the distribution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param url the primary key of the distribution
	 * @return the distribution, or <code>null</code> if a distribution with the primary key could not be found
	 */
	@Override
	public Distribution fetchByPrimaryKey(String url) {
		return fetchByPrimaryKey((Serializable)url);
	}

	@Override
	public Map<Serializable, Distribution> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Distribution> map = new HashMap<Serializable, Distribution>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Distribution distribution = fetchByPrimaryKey(primaryKey);

			if (distribution != null) {
				map.put(primaryKey, distribution);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
					DistributionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Distribution)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DISTRIBUTION_WHERE_PKS_IN);

		for (int i = 0; i < uncachedPrimaryKeys.size(); i++) {
			query.append("?");

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			QueryPos qPos = QueryPos.getInstance(q);

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				qPos.add((String)primaryKey);
			}

			for (Distribution distribution : (List<Distribution>)q.list()) {
				map.put(distribution.getPrimaryKeyObj(), distribution);

				cacheResult(distribution);

				uncachedPrimaryKeys.remove(distribution.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DistributionModelImpl.ENTITY_CACHE_ENABLED,
					DistributionImpl.class, primaryKey, nullModel);
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
	 * Returns all the distributions.
	 *
	 * @return the distributions
	 */
	@Override
	public List<Distribution> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Distribution> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Distribution> findAll(int start, int end,
		OrderByComparator<Distribution> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Distribution> findAll(int start, int end,
		OrderByComparator<Distribution> orderByComparator,
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

		List<Distribution> list = null;

		if (retrieveFromCache) {
			list = (List<Distribution>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DISTRIBUTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DISTRIBUTION;

				if (pagination) {
					sql = sql.concat(DistributionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Distribution>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the distributions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Distribution distribution : findAll()) {
			remove(distribution);
		}
	}

	/**
	 * Returns the number of distributions.
	 *
	 * @return the number of distributions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DISTRIBUTION);

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
		return DistributionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the distribution persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DistributionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DISTRIBUTION = "SELECT distribution FROM Distribution distribution";
	private static final String _SQL_SELECT_DISTRIBUTION_WHERE_PKS_IN = "SELECT distribution FROM Distribution distribution WHERE url IN (";
	private static final String _SQL_SELECT_DISTRIBUTION_WHERE = "SELECT distribution FROM Distribution distribution WHERE ";
	private static final String _SQL_COUNT_DISTRIBUTION = "SELECT COUNT(distribution) FROM Distribution distribution";
	private static final String _SQL_COUNT_DISTRIBUTION_WHERE = "SELECT COUNT(distribution) FROM Distribution distribution WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "distribution.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Distribution exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Distribution exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DistributionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}