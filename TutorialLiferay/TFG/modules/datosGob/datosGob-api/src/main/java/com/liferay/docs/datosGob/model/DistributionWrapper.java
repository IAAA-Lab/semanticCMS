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

package com.liferay.docs.datosGob.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Distribution}.
 * </p>
 *
 * @author liferay
 * @see Distribution
 * @generated
 */
@ProviderType
public class DistributionWrapper implements Distribution,
	ModelWrapper<Distribution> {
	public DistributionWrapper(Distribution distribution) {
		_distribution = distribution;
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

	@Override
	public Object clone() {
		return new DistributionWrapper((Distribution)_distribution.clone());
	}

	@Override
	public int compareTo(Distribution distribution) {
		return _distribution.compareTo(distribution);
	}

	/**
	* Returns the dataset ID of this distribution.
	*
	* @return the dataset ID of this distribution
	*/
	@Override
	public String getDatasetId() {
		return _distribution.getDatasetId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _distribution.getExpandoBridge();
	}

	/**
	* Returns the group ID of this distribution.
	*
	* @return the group ID of this distribution
	*/
	@Override
	public long getGroupId() {
		return _distribution.getGroupId();
	}

	/**
	* Returns the primary key of this distribution.
	*
	* @return the primary key of this distribution
	*/
	@Override
	public String getPrimaryKey() {
		return _distribution.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _distribution.getPrimaryKeyObj();
	}

	/**
	* Returns the tipo of this distribution.
	*
	* @return the tipo of this distribution
	*/
	@Override
	public String getTipo() {
		return _distribution.getTipo();
	}

	/**
	* Returns the url of this distribution.
	*
	* @return the url of this distribution
	*/
	@Override
	public String getUrl() {
		return _distribution.getUrl();
	}

	/**
	* Returns the uuid of this distribution.
	*
	* @return the uuid of this distribution
	*/
	@Override
	public String getUuid() {
		return _distribution.getUuid();
	}

	@Override
	public int hashCode() {
		return _distribution.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _distribution.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _distribution.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _distribution.isNew();
	}

	@Override
	public void persist() {
		_distribution.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_distribution.setCachedModel(cachedModel);
	}

	/**
	* Sets the dataset ID of this distribution.
	*
	* @param datasetId the dataset ID of this distribution
	*/
	@Override
	public void setDatasetId(String datasetId) {
		_distribution.setDatasetId(datasetId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_distribution.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_distribution.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_distribution.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this distribution.
	*
	* @param groupId the group ID of this distribution
	*/
	@Override
	public void setGroupId(long groupId) {
		_distribution.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_distribution.setNew(n);
	}

	/**
	* Sets the primary key of this distribution.
	*
	* @param primaryKey the primary key of this distribution
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_distribution.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_distribution.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tipo of this distribution.
	*
	* @param tipo the tipo of this distribution
	*/
	@Override
	public void setTipo(String tipo) {
		_distribution.setTipo(tipo);
	}

	/**
	* Sets the url of this distribution.
	*
	* @param url the url of this distribution
	*/
	@Override
	public void setUrl(String url) {
		_distribution.setUrl(url);
	}

	/**
	* Sets the uuid of this distribution.
	*
	* @param uuid the uuid of this distribution
	*/
	@Override
	public void setUuid(String uuid) {
		_distribution.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Distribution> toCacheModel() {
		return _distribution.toCacheModel();
	}

	@Override
	public Distribution toEscapedModel() {
		return new DistributionWrapper(_distribution.toEscapedModel());
	}

	@Override
	public String toString() {
		return _distribution.toString();
	}

	@Override
	public Distribution toUnescapedModel() {
		return new DistributionWrapper(_distribution.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _distribution.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DistributionWrapper)) {
			return false;
		}

		DistributionWrapper distributionWrapper = (DistributionWrapper)obj;

		if (Objects.equals(_distribution, distributionWrapper._distribution)) {
			return true;
		}

		return false;
	}

	@Override
	public Distribution getWrappedModel() {
		return _distribution;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _distribution.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _distribution.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_distribution.resetOriginalValues();
	}

	private final Distribution _distribution;
}