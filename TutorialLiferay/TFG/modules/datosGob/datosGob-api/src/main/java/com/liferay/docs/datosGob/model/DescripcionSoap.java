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
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.datosGob.service.http.DescripcionServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.http.DescripcionServiceSoap
 * @generated
 */
@ProviderType
public class DescripcionSoap implements Serializable {
	public static DescripcionSoap toSoapModel(Descripcion model) {
		DescripcionSoap soapModel = new DescripcionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setDescripcionId(model.getDescripcionId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setDatasetId(model.getDatasetId());

		return soapModel;
	}

	public static DescripcionSoap[] toSoapModels(Descripcion[] models) {
		DescripcionSoap[] soapModels = new DescripcionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DescripcionSoap[][] toSoapModels(Descripcion[][] models) {
		DescripcionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DescripcionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DescripcionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DescripcionSoap[] toSoapModels(List<Descripcion> models) {
		List<DescripcionSoap> soapModels = new ArrayList<DescripcionSoap>(models.size());

		for (Descripcion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DescripcionSoap[soapModels.size()]);
	}

	public DescripcionSoap() {
	}

	public long getPrimaryKey() {
		return _descripcionId;
	}

	public void setPrimaryKey(long pk) {
		setDescripcionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getDescripcionId() {
		return _descripcionId;
	}

	public void setDescripcionId(long descripcionId) {
		_descripcionId = descripcionId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getDatasetId() {
		return _datasetId;
	}

	public void setDatasetId(String datasetId) {
		_datasetId = datasetId;
	}

	private String _uuid;
	private long _groupId;
	private long _descripcionId;
	private String _descripcion;
	private String _datasetId;
}