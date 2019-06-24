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
 * The base model interface for the Descripcion service. Represents a row in the &quot;DB_Descripcion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.datosGob.model.impl.DescripcionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.datosGob.model.impl.DescripcionImpl}.
 * </p>
 *
 * @author liferay
 * @see Descripcion
 * @see com.liferay.docs.datosGob.model.impl.DescripcionImpl
 * @see com.liferay.docs.datosGob.model.impl.DescripcionModelImpl
 * @generated
 */
@ProviderType
public interface DescripcionModel extends BaseModel<Descripcion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a descripcion model instance should use the {@link Descripcion} interface instead.
	 */

	/**
	 * Returns the primary key of this descripcion.
	 *
	 * @return the primary key of this descripcion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this descripcion.
	 *
	 * @param primaryKey the primary key of this descripcion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this descripcion.
	 *
	 * @return the uuid of this descripcion
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this descripcion.
	 *
	 * @param uuid the uuid of this descripcion
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the group ID of this descripcion.
	 *
	 * @return the group ID of this descripcion
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this descripcion.
	 *
	 * @param groupId the group ID of this descripcion
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the descripcion ID of this descripcion.
	 *
	 * @return the descripcion ID of this descripcion
	 */
	public long getDescripcionId();

	/**
	 * Sets the descripcion ID of this descripcion.
	 *
	 * @param descripcionId the descripcion ID of this descripcion
	 */
	public void setDescripcionId(long descripcionId);

	/**
	 * Returns the descripcion of this descripcion.
	 *
	 * @return the descripcion of this descripcion
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this descripcion.
	 *
	 * @param descripcion the descripcion of this descripcion
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the dataset ID of this descripcion.
	 *
	 * @return the dataset ID of this descripcion
	 */
	@AutoEscape
	public String getDatasetId();

	/**
	 * Sets the dataset ID of this descripcion.
	 *
	 * @param datasetId the dataset ID of this descripcion
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
	public int compareTo(Descripcion descripcion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Descripcion> toCacheModel();

	@Override
	public Descripcion toEscapedModel();

	@Override
	public Descripcion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}