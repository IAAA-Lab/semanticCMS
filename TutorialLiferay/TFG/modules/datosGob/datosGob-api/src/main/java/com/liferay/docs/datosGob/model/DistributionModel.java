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
 * The base model interface for the Distribution service. Represents a row in the &quot;DB_Distribution&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.datosGob.model.impl.DistributionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.datosGob.model.impl.DistributionImpl}.
 * </p>
 *
 * @author liferay
 * @see Distribution
 * @see com.liferay.docs.datosGob.model.impl.DistributionImpl
 * @see com.liferay.docs.datosGob.model.impl.DistributionModelImpl
 * @generated
 */
@ProviderType
public interface DistributionModel extends BaseModel<Distribution> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a distribution model instance should use the {@link Distribution} interface instead.
	 */

	/**
	 * Returns the primary key of this distribution.
	 *
	 * @return the primary key of this distribution
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this distribution.
	 *
	 * @param primaryKey the primary key of this distribution
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this distribution.
	 *
	 * @return the uuid of this distribution
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this distribution.
	 *
	 * @param uuid the uuid of this distribution
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the url of this distribution.
	 *
	 * @return the url of this distribution
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this distribution.
	 *
	 * @param url the url of this distribution
	 */
	public void setUrl(String url);

	/**
	 * Returns the group ID of this distribution.
	 *
	 * @return the group ID of this distribution
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this distribution.
	 *
	 * @param groupId the group ID of this distribution
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the tipo of this distribution.
	 *
	 * @return the tipo of this distribution
	 */
	@AutoEscape
	public String getTipo();

	/**
	 * Sets the tipo of this distribution.
	 *
	 * @param tipo the tipo of this distribution
	 */
	public void setTipo(String tipo);

	/**
	 * Returns the dataset ID of this distribution.
	 *
	 * @return the dataset ID of this distribution
	 */
	@AutoEscape
	public String getDatasetId();

	/**
	 * Sets the dataset ID of this distribution.
	 *
	 * @param datasetId the dataset ID of this distribution
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
	public int compareTo(Distribution distribution);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Distribution> toCacheModel();

	@Override
	public Distribution toEscapedModel();

	@Override
	public Distribution toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}