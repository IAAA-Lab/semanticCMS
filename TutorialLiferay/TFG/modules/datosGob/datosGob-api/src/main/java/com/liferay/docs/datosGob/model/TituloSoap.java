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
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.datosGob.service.http.TituloServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.http.TituloServiceSoap
 * @generated
 */
@ProviderType
public class TituloSoap implements Serializable {
	public static TituloSoap toSoapModel(Titulo model) {
		TituloSoap soapModel = new TituloSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setTituloId(model.getTituloId());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setDatasetId(model.getDatasetId());

		return soapModel;
	}

	public static TituloSoap[] toSoapModels(Titulo[] models) {
		TituloSoap[] soapModels = new TituloSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TituloSoap[][] toSoapModels(Titulo[][] models) {
		TituloSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TituloSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TituloSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TituloSoap[] toSoapModels(List<Titulo> models) {
		List<TituloSoap> soapModels = new ArrayList<TituloSoap>(models.size());

		for (Titulo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TituloSoap[soapModels.size()]);
	}

	public TituloSoap() {
	}

	public long getPrimaryKey() {
		return _tituloId;
	}

	public void setPrimaryKey(long pk) {
		setTituloId(pk);
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

	public long getTituloId() {
		return _tituloId;
	}

	public void setTituloId(long tituloId) {
		_tituloId = tituloId;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public String getDatasetId() {
		return _datasetId;
	}

	public void setDatasetId(String datasetId) {
		_datasetId = datasetId;
	}

	private String _uuid;
	private long _groupId;
	private long _tituloId;
	private String _titulo;
	private String _datasetId;
}