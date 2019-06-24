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
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.datosGob.service.http.DatasetServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.datosGob.service.http.DatasetServiceSoap
 * @generated
 */
@ProviderType
public class DatasetSoap implements Serializable {
	public static DatasetSoap toSoapModel(Dataset model) {
		DatasetSoap soapModel = new DatasetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDatasetId(model.getDatasetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setHomepage(model.getHomepage());

		return soapModel;
	}

	public static DatasetSoap[] toSoapModels(Dataset[] models) {
		DatasetSoap[] soapModels = new DatasetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DatasetSoap[][] toSoapModels(Dataset[][] models) {
		DatasetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DatasetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DatasetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DatasetSoap[] toSoapModels(List<Dataset> models) {
		List<DatasetSoap> soapModels = new ArrayList<DatasetSoap>(models.size());

		for (Dataset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DatasetSoap[soapModels.size()]);
	}

	public DatasetSoap() {
	}

	public String getPrimaryKey() {
		return _datasetId;
	}

	public void setPrimaryKey(String pk) {
		setDatasetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getDatasetId() {
		return _datasetId;
	}

	public void setDatasetId(String datasetId) {
		_datasetId = datasetId;
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

	private String _uuid;
	private String _datasetId;
	private long _groupId;
	private String _homepage;
}