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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.datosGob.service.http.DistributionServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.http.DistributionServiceSoap
 * @generated
 */
@ProviderType
public class DistributionSoap implements Serializable {
	public static DistributionSoap toSoapModel(Distribution model) {
		DistributionSoap soapModel = new DistributionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUrl(model.getUrl());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setTipo(model.getTipo());
		soapModel.setDatasetId(model.getDatasetId());

		return soapModel;
	}

	public static DistributionSoap[] toSoapModels(Distribution[] models) {
		DistributionSoap[] soapModels = new DistributionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DistributionSoap[][] toSoapModels(Distribution[][] models) {
		DistributionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DistributionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DistributionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DistributionSoap[] toSoapModels(List<Distribution> models) {
		List<DistributionSoap> soapModels = new ArrayList<DistributionSoap>(models.size());

		for (Distribution model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DistributionSoap[soapModels.size()]);
	}

	public DistributionSoap() {
	}

	public String getPrimaryKey() {
		return _url;
	}

	public void setPrimaryKey(String pk) {
		setUrl(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getTipo() {
		return _tipo;
	}

	public void setTipo(String tipo) {
		_tipo = tipo;
	}

	public String getDatasetId() {
		return _datasetId;
	}

	public void setDatasetId(String datasetId) {
		_datasetId = datasetId;
	}

	private String _uuid;
	private String _url;
	private long _groupId;
	private String _tipo;
	private String _datasetId;
}