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
 * This class is a wrapper for {@link Titulo}.
 * </p>
 *
 * @author liferay
 * @see Titulo
 * @generated
 */
@ProviderType
public class TituloWrapper implements Titulo, ModelWrapper<Titulo> {
	public TituloWrapper(Titulo titulo) {
		_titulo = titulo;
	}

	@Override
	public Class<?> getModelClass() {
		return Titulo.class;
	}

	@Override
	public String getModelClassName() {
		return Titulo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("tituloId", getTituloId());
		attributes.put("titulo", getTitulo());
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

		Long tituloId = (Long)attributes.get("tituloId");

		if (tituloId != null) {
			setTituloId(tituloId);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		String datasetId = (String)attributes.get("datasetId");

		if (datasetId != null) {
			setDatasetId(datasetId);
		}
	}

	@Override
	public Object clone() {
		return new TituloWrapper((Titulo)_titulo.clone());
	}

	@Override
	public int compareTo(Titulo titulo) {
		return _titulo.compareTo(titulo);
	}

	/**
	* Returns the dataset ID of this titulo.
	*
	* @return the dataset ID of this titulo
	*/
	@Override
	public String getDatasetId() {
		return _titulo.getDatasetId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _titulo.getExpandoBridge();
	}

	/**
	* Returns the group ID of this titulo.
	*
	* @return the group ID of this titulo
	*/
	@Override
	public long getGroupId() {
		return _titulo.getGroupId();
	}

	/**
	* Returns the primary key of this titulo.
	*
	* @return the primary key of this titulo
	*/
	@Override
	public long getPrimaryKey() {
		return _titulo.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _titulo.getPrimaryKeyObj();
	}

	/**
	* Returns the titulo of this titulo.
	*
	* @return the titulo of this titulo
	*/
	@Override
	public String getTitulo() {
		return _titulo.getTitulo();
	}

	/**
	* Returns the titulo ID of this titulo.
	*
	* @return the titulo ID of this titulo
	*/
	@Override
	public long getTituloId() {
		return _titulo.getTituloId();
	}

	/**
	* Returns the uuid of this titulo.
	*
	* @return the uuid of this titulo
	*/
	@Override
	public String getUuid() {
		return _titulo.getUuid();
	}

	@Override
	public int hashCode() {
		return _titulo.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _titulo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _titulo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _titulo.isNew();
	}

	@Override
	public void persist() {
		_titulo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_titulo.setCachedModel(cachedModel);
	}

	/**
	* Sets the dataset ID of this titulo.
	*
	* @param datasetId the dataset ID of this titulo
	*/
	@Override
	public void setDatasetId(String datasetId) {
		_titulo.setDatasetId(datasetId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_titulo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_titulo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_titulo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this titulo.
	*
	* @param groupId the group ID of this titulo
	*/
	@Override
	public void setGroupId(long groupId) {
		_titulo.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_titulo.setNew(n);
	}

	/**
	* Sets the primary key of this titulo.
	*
	* @param primaryKey the primary key of this titulo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_titulo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_titulo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the titulo of this titulo.
	*
	* @param titulo the titulo of this titulo
	*/
	@Override
	public void setTitulo(String titulo) {
		_titulo.setTitulo(titulo);
	}

	/**
	* Sets the titulo ID of this titulo.
	*
	* @param tituloId the titulo ID of this titulo
	*/
	@Override
	public void setTituloId(long tituloId) {
		_titulo.setTituloId(tituloId);
	}

	/**
	* Sets the uuid of this titulo.
	*
	* @param uuid the uuid of this titulo
	*/
	@Override
	public void setUuid(String uuid) {
		_titulo.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Titulo> toCacheModel() {
		return _titulo.toCacheModel();
	}

	@Override
	public Titulo toEscapedModel() {
		return new TituloWrapper(_titulo.toEscapedModel());
	}

	@Override
	public String toString() {
		return _titulo.toString();
	}

	@Override
	public Titulo toUnescapedModel() {
		return new TituloWrapper(_titulo.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _titulo.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TituloWrapper)) {
			return false;
		}

		TituloWrapper tituloWrapper = (TituloWrapper)obj;

		if (Objects.equals(_titulo, tituloWrapper._titulo)) {
			return true;
		}

		return false;
	}

	@Override
	public Titulo getWrappedModel() {
		return _titulo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _titulo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _titulo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_titulo.resetOriginalValues();
	}

	private final Titulo _titulo;
}