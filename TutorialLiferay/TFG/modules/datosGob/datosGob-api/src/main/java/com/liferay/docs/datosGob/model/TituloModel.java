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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Titulo service. Represents a row in the &quot;DB_Titulo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.datosGob.model.impl.TituloModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.datosGob.model.impl.TituloImpl}.
 * </p>
 *
 * @author liferay
 * @see Titulo
 * @see com.liferay.docs.datosGob.model.impl.TituloImpl
 * @see com.liferay.docs.datosGob.model.impl.TituloModelImpl
 * @generated
 */
@ProviderType
public interface TituloModel extends BaseModel<Titulo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a titulo model instance should use the {@link Titulo} interface instead.
	 */

	/**
	 * Returns the primary key of this titulo.
	 *
	 * @return the primary key of this titulo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this titulo.
	 *
	 * @param primaryKey the primary key of this titulo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this titulo.
	 *
	 * @return the uuid of this titulo
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this titulo.
	 *
	 * @param uuid the uuid of this titulo
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the group ID of this titulo.
	 *
	 * @return the group ID of this titulo
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this titulo.
	 *
	 * @param groupId the group ID of this titulo
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the titulo ID of this titulo.
	 *
	 * @return the titulo ID of this titulo
	 */
	public long getTituloId();

	/**
	 * Sets the titulo ID of this titulo.
	 *
	 * @param tituloId the titulo ID of this titulo
	 */
	public void setTituloId(long tituloId);

	/**
	 * Returns the titulo of this titulo.
	 *
	 * @return the titulo of this titulo
	 */
	@AutoEscape
	public String getTitulo();

	/**
	 * Sets the titulo of this titulo.
	 *
	 * @param titulo the titulo of this titulo
	 */
	public void setTitulo(String titulo);

	/**
	 * Returns the dataset ID of this titulo.
	 *
	 * @return the dataset ID of this titulo
	 */
	@AutoEscape
	public String getDatasetId();

	/**
	 * Sets the dataset ID of this titulo.
	 *
	 * @param datasetId the dataset ID of this titulo
	 */
	public void setDatasetId(String datasetId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Titulo titulo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Titulo> toCacheModel();

	@Override
	public Titulo toEscapedModel();

	@Override
	public Titulo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}