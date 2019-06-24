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

package com.liferay.docs.datosGob.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.model.Distribution;
import com.liferay.docs.datosGob.model.DistributionModel;
import com.liferay.docs.datosGob.model.DistributionSoap;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Distribution service. Represents a row in the &quot;DB_Distribution&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DistributionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DistributionImpl}.
 * </p>
 *
 * @author liferay
 * @see DistributionImpl
 * @see Distribution
 * @see DistributionModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DistributionModelImpl extends BaseModelImpl<Distribution>
	implements DistributionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a distribution model instance should use the {@link Distribution} interface instead.
	 */
	public static final String TABLE_NAME = "DB_Distribution";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "tipo", Types.VARCHAR },
			{ "datasetId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("tipo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("datasetId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table DB_Distribution (uuid_ VARCHAR(75) null,url VARCHAR(500) not null primary key,groupId LONG,tipo VARCHAR(75) null,datasetId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DB_Distribution";
	public static final String ORDER_BY_JPQL = " ORDER BY distribution.url ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DB_Distribution.url ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.datosGob.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.datosGob.model.Distribution"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.datosGob.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.datosGob.model.Distribution"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.docs.datosGob.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.docs.datosGob.model.Distribution"),
			true);
	public static final long DATASETID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long URL_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Distribution toModel(DistributionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Distribution model = new DistributionImpl();

		model.setUuid(soapModel.getUuid());
		model.setUrl(soapModel.getUrl());
		model.setGroupId(soapModel.getGroupId());
		model.setTipo(soapModel.getTipo());
		model.setDatasetId(soapModel.getDatasetId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Distribution> toModels(DistributionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Distribution> models = new ArrayList<Distribution>(soapModels.length);

		for (DistributionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.docs.datosGob.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.datosGob.model.Distribution"));

	public DistributionModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _url;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setUrl(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _url;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Distribution.class;
	}

	@Override
	public String getModelClassName() {
		return Distribution.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("url", getUrl());
		attributes.put("groupId", getGroupId());
		attributes.put("tipo", getTipo());
		attributes.put("datasetId", getDatasetId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String tipo = (String)attributes.get("tipo");

		if (tipo != null) {
			setTipo(tipo);
		}

		String datasetId = (String)attributes.get("datasetId");

		if (datasetId != null) {
			setDatasetId(datasetId);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return "";
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public String getTipo() {
		if (_tipo == null) {
			return "";
		}
		else {
			return _tipo;
		}
	}

	@Override
	public void setTipo(String tipo) {
		_tipo = tipo;
	}

	@JSON
	@Override
	public String getDatasetId() {
		if (_datasetId == null) {
			return "";
		}
		else {
			return _datasetId;
		}
	}

	@Override
	public void setDatasetId(String datasetId) {
		_columnBitmask |= DATASETID_COLUMN_BITMASK;

		if (_originalDatasetId == null) {
			_originalDatasetId = _datasetId;
		}

		_datasetId = datasetId;
	}

	public String getOriginalDatasetId() {
		return GetterUtil.getString(_originalDatasetId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Distribution toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Distribution)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DistributionImpl distributionImpl = new DistributionImpl();

		distributionImpl.setUuid(getUuid());
		distributionImpl.setUrl(getUrl());
		distributionImpl.setGroupId(getGroupId());
		distributionImpl.setTipo(getTipo());
		distributionImpl.setDatasetId(getDatasetId());

		distributionImpl.resetOriginalValues();

		return distributionImpl;
	}

	@Override
	public int compareTo(Distribution distribution) {
		String primaryKey = distribution.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Distribution)) {
			return false;
		}

		Distribution distribution = (Distribution)obj;

		String primaryKey = distribution.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		DistributionModelImpl distributionModelImpl = this;

		distributionModelImpl._originalUuid = distributionModelImpl._uuid;

		distributionModelImpl._originalGroupId = distributionModelImpl._groupId;

		distributionModelImpl._setOriginalGroupId = false;

		distributionModelImpl._originalDatasetId = distributionModelImpl._datasetId;

		distributionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Distribution> toCacheModel() {
		DistributionCacheModel distributionCacheModel = new DistributionCacheModel();

		distributionCacheModel.uuid = getUuid();

		String uuid = distributionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			distributionCacheModel.uuid = null;
		}

		distributionCacheModel.url = getUrl();

		String url = distributionCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			distributionCacheModel.url = null;
		}

		distributionCacheModel.groupId = getGroupId();

		distributionCacheModel.tipo = getTipo();

		String tipo = distributionCacheModel.tipo;

		if ((tipo != null) && (tipo.length() == 0)) {
			distributionCacheModel.tipo = null;
		}

		distributionCacheModel.datasetId = getDatasetId();

		String datasetId = distributionCacheModel.datasetId;

		if ((datasetId != null) && (datasetId.length() == 0)) {
			distributionCacheModel.datasetId = null;
		}

		return distributionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", tipo=");
		sb.append(getTipo());
		sb.append(", datasetId=");
		sb.append(getDatasetId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.datosGob.model.Distribution");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipo</column-name><column-value><![CDATA[");
		sb.append(getTipo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datasetId</column-name><column-value><![CDATA[");
		sb.append(getDatasetId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Distribution.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Distribution.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private String _url;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _tipo;
	private String _datasetId;
	private String _originalDatasetId;
	private long _columnBitmask;
	private Distribution _escapedModel;
}