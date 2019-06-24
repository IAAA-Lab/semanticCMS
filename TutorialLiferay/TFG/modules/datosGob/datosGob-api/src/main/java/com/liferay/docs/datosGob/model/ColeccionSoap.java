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
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.datosGob.service.http.ColeccionServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.http.ColeccionServiceSoap
 * @generated
 */
@ProviderType
public class ColeccionSoap implements Serializable {
	public static ColeccionSoap toSoapModel(Coleccion model) {
		ColeccionSoap soapModel = new ColeccionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setHomepage(model.getHomepage());
		soapModel.setTitulo(model.getTitulo());

		return soapModel;
	}

	public static ColeccionSoap[] toSoapModels(Coleccion[] models) {
		ColeccionSoap[] soapModels = new ColeccionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ColeccionSoap[][] toSoapModels(Coleccion[][] models) {
		ColeccionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ColeccionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ColeccionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ColeccionSoap[] toSoapModels(List<Coleccion> models) {
		List<ColeccionSoap> soapModels = new ArrayList<ColeccionSoap>(models.size());

		for (Coleccion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ColeccionSoap[soapModels.size()]);
	}

	public ColeccionSoap() {
	}

	public String getPrimaryKey() {
		return _homepage;
	}

	public void setPrimaryKey(String pk) {
		setHomepage(pk);
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

	public String getHomepage() {
		return _homepage;
	}

	public void setHomepage(String homepage) {
		_homepage = homepage;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	private String _uuid;
	private long _groupId;
	private String _homepage;
	private String _titulo;
}