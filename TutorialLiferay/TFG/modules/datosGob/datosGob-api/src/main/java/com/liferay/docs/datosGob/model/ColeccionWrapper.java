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
 * This class is a wrapper for {@link Coleccion}.
 * </p>
 *
 * @author liferay
 * @see Coleccion
 * @generated
 */
@ProviderType
public class ColeccionWrapper implements Coleccion, ModelWrapper<Coleccion> {
	public ColeccionWrapper(Coleccion coleccion) {
		_coleccion = coleccion;
	}

	@Override
	public Class<?> getModelClass() {
		return Coleccion.class;
	}

	@Override
	public String getModelClassName() {
		return Coleccion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("homepage", getHomepage());
		attributes.put("titulo", getTitulo());

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

		String homepage = (String)attributes.get("homepage");

		if (homepage != null) {
			setHomepage(homepage);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}
	}

	@Override
	public Object clone() {
		return new ColeccionWrapper((Coleccion)_coleccion.clone());
	}

	@Override
	public int compareTo(Coleccion coleccion) {
		return _coleccion.compareTo(coleccion);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _coleccion.getExpandoBridge();
	}

	/**
	* Returns the group ID of this coleccion.
	*
	* @return the group ID of this coleccion
	*/
	@Override
	public long getGroupId() {
		return _coleccion.getGroupId();
	}

	/**
	* Returns the homepage of this coleccion.
	*
	* @return the homepage of this coleccion
	*/
	@Override
	public String getHomepage() {
		return _coleccion.getHomepage();
	}

	/**
	* Returns the primary key of this coleccion.
	*
	* @return the primary key of this coleccion
	*/
	@Override
	public String getPrimaryKey() {
		return _coleccion.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _coleccion.getPrimaryKeyObj();
	}

	/**
	* Returns the titulo of this coleccion.
	*
	* @return the titulo of this coleccion
	*/
	@Override
	public String getTitulo() {
		return _coleccion.getTitulo();
	}

	/**
	* Returns the uuid of this coleccion.
	*
	* @return the uuid of this coleccion
	*/
	@Override
	public String getUuid() {
		return _coleccion.getUuid();
	}

	@Override
	public int hashCode() {
		return _coleccion.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _coleccion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _coleccion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _coleccion.isNew();
	}

	@Override
	public void persist() {
		_coleccion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_coleccion.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_coleccion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_coleccion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_coleccion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this coleccion.
	*
	* @param groupId the group ID of this coleccion
	*/
	@Override
	public void setGroupId(long groupId) {
		_coleccion.setGroupId(groupId);
	}

	/**
	* Sets the homepage of this coleccion.
	*
	* @param homepage the homepage of this coleccion
	*/
	@Override
	public void setHomepage(String homepage) {
		_coleccion.setHomepage(homepage);
	}

	@Override
	public void setNew(boolean n) {
		_coleccion.setNew(n);
	}

	/**
	* Sets the primary key of this coleccion.
	*
	* @param primaryKey the primary key of this coleccion
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_coleccion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_coleccion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the titulo of this coleccion.
	*
	* @param titulo the titulo of this coleccion
	*/
	@Override
	public void setTitulo(String titulo) {
		_coleccion.setTitulo(titulo);
	}

	/**
	* Sets the uuid of this coleccion.
	*
	* @param uuid the uuid of this coleccion
	*/
	@Override
	public void setUuid(String uuid) {
		_coleccion.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Coleccion> toCacheModel() {
		return _coleccion.toCacheModel();
	}

	@Override
	public Coleccion toEscapedModel() {
		return new ColeccionWrapper(_coleccion.toEscapedModel());
	}

	@Override
	public String toString() {
		return _coleccion.toString();
	}

	@Override
	public Coleccion toUnescapedModel() {
		return new ColeccionWrapper(_coleccion.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _coleccion.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ColeccionWrapper)) {
			return false;
		}

		ColeccionWrapper coleccionWrapper = (ColeccionWrapper)obj;

		if (Objects.equals(_coleccion, coleccionWrapper._coleccion)) {
			return true;
		}

		return false;
	}

	@Override
	public Coleccion getWrappedModel() {
		return _coleccion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _coleccion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _coleccion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_coleccion.resetOriginalValues();
	}

	private final Coleccion _coleccion;
}