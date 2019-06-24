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

import com.liferay.docs.datosGob.exception.NoSuchDatasetException;
import com.liferay.docs.datosGob.model.Dataset;
import com.liferay.docs.datosGob.model.impl.DatasetImpl;
import com.liferay.docs.datosGob.model.impl.DatasetModelImpl;
import com.liferay.docs.datosGob.service.persistence.DatasetPersistence;

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
 * The persistence implementation for the dataset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see DatasetPersistence
 * @see com.liferay.docs.datosGob.service.persistence.DatasetUtil
 * @generated
 */
@ProviderType
public class DatasetPersistenceImpl extends BasePersistenceImpl<Dataset>
	implements DatasetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DatasetUtil} to access the dataset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DatasetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DatasetModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the datasets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching datasets
	 */
	@Override
	public List<Dataset> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Dataset> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Dataset> findByUuid(String uuid, int start, int end,
		OrderByComparator<Dataset> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Dataset> findByUuid(String uuid, int start, int end,
		OrderByComparator<Dataset> orderByComparator, boolean retrieveFromCache) {
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

		List<Dataset> list = null;

		if (retrieveFromCache) {
			list = (List<Dataset>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Dataset dataset : list) {
					if (!Objects.equals(uuid, dataset.getUuid())) {
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

			query.append(_SQL_SELECT_DATASET_WHERE);

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
				query.append(DatasetModelImpl.ORDER_BY_JPQL);
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
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dataset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dataset
	 * @throws NoSuchDatasetException if a matching dataset could not be found
	 */
	@Override
	public Dataset findByUuid_First(String uuid,
		OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByUuid_First(uuid, orderByComparator);

		if (dataset != null) {
			return dataset;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDatasetException(msg.toString());
	}

	/**
	 * Returns the first dataset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByUuid_First(String uuid,
		OrderByComparator<Dataset> orderByComparator) {
		List<Dataset> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dataset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dataset
	 * @throws NoSuchDatasetException if a matching dataset could not be found
	 */
	@Override
	public Dataset findByUuid_Last(String uuid,
		OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByUuid_Last(uuid, orderByComparator);

		if (dataset != null) {
			return dataset;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDatasetException(msg.toString());
	}

	/**
	 * Returns the last dataset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByUuid_Last(String uuid,
		OrderByComparator<Dataset> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Dataset> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Dataset[] findByUuid_PrevAndNext(String datasetId, String uuid,
		OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = findByPrimaryKey(datasetId);

		Session session = null;

		try {
			session = openSession();

			Dataset[] array = new DatasetImpl[3];

			array[0] = getByUuid_PrevAndNext(session, dataset, uuid,
					orderByComparator, true);

			array[1] = dataset;

			array[2] = getByUuid_PrevAndNext(session, dataset, uuid,
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

	protected Dataset getByUuid_PrevAndNext(Session session, Dataset dataset,
		String uuid, OrderByComparator<Dataset> orderByComparator,
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

		query.append(_SQL_SELECT_DATASET_WHERE);

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
			query.append(DatasetModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dataset);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Dataset> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the datasets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Dataset dataset : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dataset);
		}
	}

	/**
	 * Returns the number of datasets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching datasets
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATASET_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "dataset.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "dataset.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(dataset.uuid IS NULL OR dataset.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DatasetModelImpl.UUID_COLUMN_BITMASK |
			DatasetModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the dataset where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDatasetException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dataset
	 * @throws NoSuchDatasetException if a matching dataset could not be found
	 */
	@Override
	public Dataset findByUUID_G(String uuid, long groupId)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByUUID_G(uuid, groupId);

		if (dataset == null) {
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

			throw new NoSuchDatasetException(msg.toString());
		}

		return dataset;
	}

	/**
	 * Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dataset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Dataset) {
			Dataset dataset = (Dataset)result;

			if (!Objects.equals(uuid, dataset.getUuid()) ||
					(groupId != dataset.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DATASET_WHERE);

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

				List<Dataset> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Dataset dataset = list.get(0);

					result = dataset;

					cacheResult(dataset);
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
			return (Dataset)result;
		}
	}

	/**
	 * Removes the dataset where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dataset that was removed
	 */
	@Override
	public Dataset removeByUUID_G(String uuid, long groupId)
		throws NoSuchDatasetException {
		Dataset dataset = findByUUID_G(uuid, groupId);

		return remove(dataset);
	}

	/**
	 * Returns the number of datasets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching datasets
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATASET_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "dataset.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "dataset.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(dataset.uuid IS NULL OR dataset.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "dataset.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_D = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, DatasetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_D",
			new String[] { Long.class.getName(), String.class.getName() },
			DatasetModelImpl.GROUPID_COLUMN_BITMASK |
			DatasetModelImpl.HOMEPAGE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_D = new FinderPath(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_D",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the datasets where groupId = &#63; and homepage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 * @return the matching datasets
	 */
	@Override
	public List<Dataset> findByD_D(long groupId, String homepage) {
		return findByD_D(groupId, homepage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Dataset> findByD_D(long groupId, String homepage, int start,
		int end) {
		return findByD_D(groupId, homepage, start, end, null);
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
	@Override
	public List<Dataset> findByD_D(long groupId, String homepage, int start,
		int end, OrderByComparator<Dataset> orderByComparator) {
		return findByD_D(groupId, homepage, start, end, orderByComparator, true);
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
	@Override
	public List<Dataset> findByD_D(long groupId, String homepage, int start,
		int end, OrderByComparator<Dataset> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D;
			finderArgs = new Object[] { groupId, homepage };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_D;
			finderArgs = new Object[] {
					groupId, homepage,
					
					start, end, orderByComparator
				};
		}

		List<Dataset> list = null;

		if (retrieveFromCache) {
			list = (List<Dataset>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Dataset dataset : list) {
					if ((groupId != dataset.getGroupId()) ||
							!Objects.equals(homepage, dataset.getHomepage())) {
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

			query.append(_SQL_SELECT_DATASET_WHERE);

			query.append(_FINDER_COLUMN_D_D_GROUPID_2);

			boolean bindHomepage = false;

			if (homepage == null) {
				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_1);
			}
			else if (homepage.equals("")) {
				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_3);
			}
			else {
				bindHomepage = true;

				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DatasetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindHomepage) {
					qPos.add(homepage);
				}

				if (!pagination) {
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dataset
	 * @throws NoSuchDatasetException if a matching dataset could not be found
	 */
	@Override
	public Dataset findByD_D_First(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByD_D_First(groupId, homepage, orderByComparator);

		if (dataset != null) {
			return dataset;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", homepage=");
		msg.append(homepage);

		msg.append("}");

		throw new NoSuchDatasetException(msg.toString());
	}

	/**
	 * Returns the first dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByD_D_First(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator) {
		List<Dataset> list = findByD_D(groupId, homepage, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Dataset findByD_D_Last(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByD_D_Last(groupId, homepage, orderByComparator);

		if (dataset != null) {
			return dataset;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", homepage=");
		msg.append(homepage);

		msg.append("}");

		throw new NoSuchDatasetException(msg.toString());
	}

	/**
	 * Returns the last dataset in the ordered set where groupId = &#63; and homepage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dataset, or <code>null</code> if a matching dataset could not be found
	 */
	@Override
	public Dataset fetchByD_D_Last(long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator) {
		int count = countByD_D(groupId, homepage);

		if (count == 0) {
			return null;
		}

		List<Dataset> list = findByD_D(groupId, homepage, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Dataset[] findByD_D_PrevAndNext(String datasetId, long groupId,
		String homepage, OrderByComparator<Dataset> orderByComparator)
		throws NoSuchDatasetException {
		Dataset dataset = findByPrimaryKey(datasetId);

		Session session = null;

		try {
			session = openSession();

			Dataset[] array = new DatasetImpl[3];

			array[0] = getByD_D_PrevAndNext(session, dataset, groupId,
					homepage, orderByComparator, true);

			array[1] = dataset;

			array[2] = getByD_D_PrevAndNext(session, dataset, groupId,
					homepage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Dataset getByD_D_PrevAndNext(Session session, Dataset dataset,
		long groupId, String homepage,
		OrderByComparator<Dataset> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DATASET_WHERE);

		query.append(_FINDER_COLUMN_D_D_GROUPID_2);

		boolean bindHomepage = false;

		if (homepage == null) {
			query.append(_FINDER_COLUMN_D_D_HOMEPAGE_1);
		}
		else if (homepage.equals("")) {
			query.append(_FINDER_COLUMN_D_D_HOMEPAGE_3);
		}
		else {
			bindHomepage = true;

			query.append(_FINDER_COLUMN_D_D_HOMEPAGE_2);
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
			query.append(DatasetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindHomepage) {
			qPos.add(homepage);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataset);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Dataset> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the datasets where groupId = &#63; and homepage = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 */
	@Override
	public void removeByD_D(long groupId, String homepage) {
		for (Dataset dataset : findByD_D(groupId, homepage, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dataset);
		}
	}

	/**
	 * Returns the number of datasets where groupId = &#63; and homepage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param homepage the homepage
	 * @return the number of matching datasets
	 */
	@Override
	public int countByD_D(long groupId, String homepage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_D;

		Object[] finderArgs = new Object[] { groupId, homepage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATASET_WHERE);

			query.append(_FINDER_COLUMN_D_D_GROUPID_2);

			boolean bindHomepage = false;

			if (homepage == null) {
				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_1);
			}
			else if (homepage.equals("")) {
				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_3);
			}
			else {
				bindHomepage = true;

				query.append(_FINDER_COLUMN_D_D_HOMEPAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindHomepage) {
					qPos.add(homepage);
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

	private static final String _FINDER_COLUMN_D_D_GROUPID_2 = "dataset.groupId = ? AND ";
	private static final String _FINDER_COLUMN_D_D_HOMEPAGE_1 = "dataset.homepage IS NULL";
	private static final String _FINDER_COLUMN_D_D_HOMEPAGE_2 = "dataset.homepage = ?";
	private static final String _FINDER_COLUMN_D_D_HOMEPAGE_3 = "(dataset.homepage IS NULL OR dataset.homepage = '')";

	public DatasetPersistenceImpl() {
		setModelClass(Dataset.class);

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
	 * Caches the dataset in the entity cache if it is enabled.
	 *
	 * @param dataset the dataset
	 */
	@Override
	public void cacheResult(Dataset dataset) {
		entityCache.putResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetImpl.class, dataset.getPrimaryKey(), dataset);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { dataset.getUuid(), dataset.getGroupId() }, dataset);

		dataset.resetOriginalValues();
	}

	/**
	 * Caches the datasets in the entity cache if it is enabled.
	 *
	 * @param datasets the datasets
	 */
	@Override
	public void cacheResult(List<Dataset> datasets) {
		for (Dataset dataset : datasets) {
			if (entityCache.getResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
						DatasetImpl.class, dataset.getPrimaryKey()) == null) {
				cacheResult(dataset);
			}
			else {
				dataset.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all datasets.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DatasetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dataset.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Dataset dataset) {
		entityCache.removeResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetImpl.class, dataset.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DatasetModelImpl)dataset, true);
	}

	@Override
	public void clearCache(List<Dataset> datasets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Dataset dataset : datasets) {
			entityCache.removeResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
				DatasetImpl.class, dataset.getPrimaryKey());

			clearUniqueFindersCache((DatasetModelImpl)dataset, true);
		}
	}

	protected void cacheUniqueFindersCache(DatasetModelImpl datasetModelImpl) {
		Object[] args = new Object[] {
				datasetModelImpl.getUuid(), datasetModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			datasetModelImpl, false);
	}

	protected void clearUniqueFindersCache(DatasetModelImpl datasetModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					datasetModelImpl.getUuid(), datasetModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((datasetModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					datasetModelImpl.getOriginalUuid(),
					datasetModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new dataset with the primary key. Does not add the dataset to the database.
	 *
	 * @param datasetId the primary key for the new dataset
	 * @return the new dataset
	 */
	@Override
	public Dataset create(String datasetId) {
		Dataset dataset = new DatasetImpl();

		dataset.setNew(true);
		dataset.setPrimaryKey(datasetId);

		String uuid = PortalUUIDUtil.generate();

		dataset.setUuid(uuid);

		return dataset;
	}

	/**
	 * Removes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param datasetId the primary key of the dataset
	 * @return the dataset that was removed
	 * @throws NoSuchDatasetException if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset remove(String datasetId) throws NoSuchDatasetException {
		return remove((Serializable)datasetId);
	}

	/**
	 * Removes the dataset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dataset
	 * @return the dataset that was removed
	 * @throws NoSuchDatasetException if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset remove(Serializable primaryKey)
		throws NoSuchDatasetException {
		Session session = null;

		try {
			session = openSession();

			Dataset dataset = (Dataset)session.get(DatasetImpl.class, primaryKey);

			if (dataset == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDatasetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataset);
		}
		catch (NoSuchDatasetException nsee) {
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
	protected Dataset removeImpl(Dataset dataset) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataset)) {
				dataset = (Dataset)session.get(DatasetImpl.class,
						dataset.getPrimaryKeyObj());
			}

			if (dataset != null) {
				session.delete(dataset);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataset != null) {
			clearCache(dataset);
		}

		return dataset;
	}

	@Override
	public Dataset updateImpl(Dataset dataset) {
		boolean isNew = dataset.isNew();

		if (!(dataset instanceof DatasetModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dataset.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(dataset);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dataset proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Dataset implementation " +
				dataset.getClass());
		}

		DatasetModelImpl datasetModelImpl = (DatasetModelImpl)dataset;

		if (Validator.isNull(dataset.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dataset.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (dataset.isNew()) {
				session.save(dataset);

				dataset.setNew(false);
			}
			else {
				dataset = (Dataset)session.merge(dataset);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DatasetModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { datasetModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					datasetModelImpl.getGroupId(),
					datasetModelImpl.getHomepage()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_D_D, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((datasetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { datasetModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { datasetModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((datasetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						datasetModelImpl.getOriginalGroupId(),
						datasetModelImpl.getOriginalHomepage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D,
					args);

				args = new Object[] {
						datasetModelImpl.getGroupId(),
						datasetModelImpl.getHomepage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_D,
					args);
			}
		}

		entityCache.putResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
			DatasetImpl.class, dataset.getPrimaryKey(), dataset, false);

		clearUniqueFindersCache(datasetModelImpl, false);
		cacheUniqueFindersCache(datasetModelImpl);

		dataset.resetOriginalValues();

		return dataset;
	}

	/**
	 * Returns the dataset with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dataset
	 * @return the dataset
	 * @throws NoSuchDatasetException if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDatasetException {
		Dataset dataset = fetchByPrimaryKey(primaryKey);

		if (dataset == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDatasetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataset;
	}

	/**
	 * Returns the dataset with the primary key or throws a {@link NoSuchDatasetException} if it could not be found.
	 *
	 * @param datasetId the primary key of the dataset
	 * @return the dataset
	 * @throws NoSuchDatasetException if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset findByPrimaryKey(String datasetId)
		throws NoSuchDatasetException {
		return findByPrimaryKey((Serializable)datasetId);
	}

	/**
	 * Returns the dataset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dataset
	 * @return the dataset, or <code>null</code> if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
				DatasetImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Dataset dataset = (Dataset)serializable;

		if (dataset == null) {
			Session session = null;

			try {
				session = openSession();

				dataset = (Dataset)session.get(DatasetImpl.class, primaryKey);

				if (dataset != null) {
					cacheResult(dataset);
				}
				else {
					entityCache.putResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
						DatasetImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
					DatasetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataset;
	}

	/**
	 * Returns the dataset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param datasetId the primary key of the dataset
	 * @return the dataset, or <code>null</code> if a dataset with the primary key could not be found
	 */
	@Override
	public Dataset fetchByPrimaryKey(String datasetId) {
		return fetchByPrimaryKey((Serializable)datasetId);
	}

	@Override
	public Map<Serializable, Dataset> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Dataset> map = new HashMap<Serializable, Dataset>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Dataset dataset = fetchByPrimaryKey(primaryKey);

			if (dataset != null) {
				map.put(primaryKey, dataset);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
					DatasetImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Dataset)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATASET_WHERE_PKS_IN);

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

			for (Dataset dataset : (List<Dataset>)q.list()) {
				map.put(dataset.getPrimaryKeyObj(), dataset);

				cacheResult(dataset);

				uncachedPrimaryKeys.remove(dataset.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DatasetModelImpl.ENTITY_CACHE_ENABLED,
					DatasetImpl.class, primaryKey, nullModel);
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
	 * Returns all the datasets.
	 *
	 * @return the datasets
	 */
	@Override
	public List<Dataset> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Dataset> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Dataset> findAll(int start, int end,
		OrderByComparator<Dataset> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Dataset> findAll(int start, int end,
		OrderByComparator<Dataset> orderByComparator, boolean retrieveFromCache) {
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

		List<Dataset> list = null;

		if (retrieveFromCache) {
			list = (List<Dataset>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATASET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATASET;

				if (pagination) {
					sql = sql.concat(DatasetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Dataset>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the datasets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Dataset dataset : findAll()) {
			remove(dataset);
		}
	}

	/**
	 * Returns the number of datasets.
	 *
	 * @return the number of datasets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATASET);

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
		return DatasetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dataset persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DatasetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATASET = "SELECT dataset FROM Dataset dataset";
	private static final String _SQL_SELECT_DATASET_WHERE_PKS_IN = "SELECT dataset FROM Dataset dataset WHERE datasetId IN (";
	private static final String _SQL_SELECT_DATASET_WHERE = "SELECT dataset FROM Dataset dataset WHERE ";
	private static final String _SQL_COUNT_DATASET = "SELECT COUNT(dataset) FROM Dataset dataset";
	private static final String _SQL_COUNT_DATASET_WHERE = "SELECT COUNT(dataset) FROM Dataset dataset WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataset.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Dataset exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Dataset exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DatasetPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}