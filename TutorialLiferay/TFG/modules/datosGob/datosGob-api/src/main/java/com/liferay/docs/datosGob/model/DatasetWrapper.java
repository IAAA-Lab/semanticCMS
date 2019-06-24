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
 * This class is a wrapper for {@link Dataset}.
 * </p>
 *
 * @author liferay
 * @see Dataset
 * @generated
 */
@ProviderType
public class DatasetWrapper implements Dataset, ModelWrapper<Dataset> {
	public DatasetWrapper(Dataset dataset) {
		_dataset = dataset;
	}

	@Override
	public Class<?> getModelClass() {
		return Dataset.class;
	}

	@Override
	public String getModelClassName() {
		return Dataset.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("datasetId", getDatasetId());
		attributes.put("groupId", getGroupId());
		attributes.put("homepage", getHomepage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String datasetId = (String)attributes.get("datasetId");

		if (datasetId != null) {
			setDatasetId(datasetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String homepage = (String)attributes.get("homepage");

		if (homepage != null) {
			setHomepage(homepage);
		}
	}

	@Override
	public Object clone() {
		return new DatasetWrapper((Dataset)_dataset.clone());
	}

	@Override
	public int compareTo(Dataset dataset) {
		return _dataset.compareTo(dataset);
	}

	/**
	* Returns the dataset ID of this dataset.
	*
	* @return the dataset ID of this dataset
	*/
	@Override
	public String getDatasetId() {
		return _dataset.getDatasetId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataset.getExpandoBridge();
	}

	/**
	* Returns the group ID of this dataset.
	*
	* @return the group ID of this dataset
	*/
	@Override
	public long getGroupId() {
		return _dataset.getGroupId();
	}

	/**
	* Returns the homepage of this dataset.
	*
	* @return the homepage of this dataset
	*/
	@Override
	public String getHomepage() {
		return _dataset.getHomepage();
	}

	/**
	* Returns the primary key of this dataset.
	*
	* @return the primary key of this dataset
	*/
	@Override
	public String getPrimaryKey() {
		return _dataset.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataset.getPrimaryKeyObj();
	}

	/**
	* Returns the uuid of this dataset.
	*
	* @return the uuid of this dataset
	*/
	@Override
	public String getUuid() {
		return _dataset.getUuid();
	}

	@Override
	public int hashCode() {
		return _dataset.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _dataset.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataset.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataset.isNew();
	}

	@Override
	public void persist() {
		_dataset.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataset.setCachedModel(cachedModel);
	}

	/**
	* Sets the dataset ID of this dataset.
	*
	* @param datasetId the dataset ID of this dataset
	*/
	@Override
	public void setDatasetId(String datasetId) {
		_dataset.setDatasetId(datasetId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataset.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataset.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataset.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this dataset.
	*
	* @param groupId the group ID of this dataset
	*/
	@Override
	public void setGroupId(long groupId) {
		_dataset.setGroupId(groupId);
	}

	/**
	* Sets the homepage of this dataset.
	*
	* @param homepage the homepage of this dataset
	*/
	@Override
	public void setHomepage(String homepage) {
		_dataset.setHomepage(homepage);
	}

	@Override
	public void setNew(boolean n) {
		_dataset.setNew(n);
	}

	/**
	* Sets the primary key of this dataset.
	*
	* @param primaryKey the primary key of this dataset
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_dataset.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataset.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uuid of this dataset.
	*
	* @param uuid the uuid of this dataset
	*/
	@Override
	public void setUuid(String uuid) {
		_dataset.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Dataset> toCacheModel() {
		return _dataset.toCacheModel();
	}

	@Override
	public Dataset toEscapedModel() {
		return new DatasetWrapper(_dataset.toEscapedModel());
	}

	@Override
	public String toString() {
		return _dataset.toString();
	}

	@Override
	public Dataset toUnescapedModel() {
		return new DatasetWrapper(_dataset.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _dataset.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DatasetWrapper)) {
			return false;
		}

		DatasetWrapper datasetWrapper = (DatasetWrapper)obj;

		if (Objects.equals(_dataset, datasetWrapper._dataset)) {
			return true;
		}

		return false;
	}

	@Override
	public Dataset getWrappedModel() {
		return _dataset;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataset.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataset.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataset.resetOriginalValues();
	}

	private final Dataset _dataset;
}