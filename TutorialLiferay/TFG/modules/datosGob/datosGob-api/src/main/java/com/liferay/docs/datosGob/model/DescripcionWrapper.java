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
 * This class is a wrapper for {@link Descripcion}.
 * </p>
 *
 * @author liferay
 * @see Descripcion
 * @generated
 */
@ProviderType
public class DescripcionWrapper implements Descripcion,
	ModelWrapper<Descripcion> {
	public DescripcionWrapper(Descripcion descripcion) {
		_descripcion = descripcion;
	}

	@Override
	public Class<?> getModelClass() {
		return Descripcion.class;
	}

	@Override
	public String getModelClassName() {
		return Descripcion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("descripcionId", getDescripcionId());
		attributes.put("descripcion", getDescripcion());
		attributes.put("datasetId", getDatasetId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long descripcionId = (Long)attributes.get("descripcionId");

		if (descripcionId != null) {
			setDescripcionId(descripcionId);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String datasetId = (String)attributes.get("datasetId");

		if (datasetId != null) {
			setDatasetId(datasetId);
		}
	}

	@Override
	public Object clone() {
		return new DescripcionWrapper((Descripcion)_descripcion.clone());
	}

	@Override
	public int compareTo(Descripcion descripcion) {
		return _descripcion.compareTo(descripcion);
	}

	/**
	* Returns the dataset ID of this descripcion.
	*
	* @return the dataset ID of this descripcion
	*/
	@Override
	public String getDatasetId() {
		return _descripcion.getDatasetId();
	}

	/**
	* Returns the descripcion of this descripcion.
	*
	* @return the descripcion of this descripcion
	*/
	@Override
	public String getDescripcion() {
		return _descripcion.getDescripcion();
	}

	/**
	* Returns the descripcion ID of this descripcion.
	*
	* @return the descripcion ID of this descripcion
	*/
	@Override
	public long getDescripcionId() {
		return _descripcion.getDescripcionId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _descripcion.getExpandoBridge();
	}

	/**
	* Returns the group ID of this descripcion.
	*
	* @return the group ID of this descripcion
	*/
	@Override
	public long getGroupId() {
		return _descripcion.getGroupId();
	}

	/**
	* Returns the primary key of this descripcion.
	*
	* @return the primary key of this descripcion
	*/
	@Override
	public long getPrimaryKey() {
		return _descripcion.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _descripcion.getPrimaryKeyObj();
	}

	/**
	* Returns the uuid of this descripcion.
	*
	* @return the uuid of this descripcion
	*/
	@Override
	public String getUuid() {
		return _descripcion.getUuid();
	}

	@Override
	public int hashCode() {
		return _descripcion.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _descripcion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _descripcion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _descripcion.isNew();
	}

	@Override
	public void persist() {
		_descripcion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_descripcion.setCachedModel(cachedModel);
	}

	/**
	* Sets the dataset ID of this descripcion.
	*
	* @param datasetId the dataset ID of this descripcion
	*/
	@Override
	public void setDatasetId(String datasetId) {
		_descripcion.setDatasetId(datasetId);
	}

	/**
	* Sets the descripcion of this descripcion.
	*
	* @param descripcion the descripcion of this descripcion
	*/
	@Override
	public void setDescripcion(String descripcion) {
		_descripcion.setDescripcion(descripcion);
	}

	/**
	* Sets the descripcion ID of this descripcion.
	*
	* @param descripcionId the descripcion ID of this descripcion
	*/
	@Override
	public void setDescripcionId(long descripcionId) {
		_descripcion.setDescripcionId(descripcionId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_descripcion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_descripcion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_descripcion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this descripcion.
	*
	* @param groupId the group ID of this descripcion
	*/
	@Override
	public void setGroupId(long groupId) {
		_descripcion.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_descripcion.setNew(n);
	}

	/**
	* Sets the primary key of this descripcion.
	*
	* @param primaryKey the primary key of this descripcion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_descripcion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_descripcion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uuid of this descripcion.
	*
	* @param uuid the uuid of this descripcion
	*/
	@Override
	public void setUuid(String uuid) {
		_descripcion.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Descripcion> toCacheModel() {
		return _descripcion.toCacheModel();
	}

	@Override
	public Descripcion toEscapedModel() {
		return new DescripcionWrapper(_descripcion.toEscapedModel());
	}

	@Override
	public String toString() {
		return _descripcion.toString();
	}

	@Override
	public Descripcion toUnescapedModel() {
		return new DescripcionWrapper(_descripcion.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _descripcion.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DescripcionWrapper)) {
			return false;
		}

		DescripcionWrapper descripcionWrapper = (DescripcionWrapper)obj;

		if (Objects.equals(_descripcion, descripcionWrapper._descripcion)) {
			return true;
		}

		return false;
	}

	@Override
	public Descripcion getWrappedModel() {
		return _descripcion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _descripcion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _descripcion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_descripcion.resetOriginalValues();
	}

	private final Descripcion _descripcion;
}