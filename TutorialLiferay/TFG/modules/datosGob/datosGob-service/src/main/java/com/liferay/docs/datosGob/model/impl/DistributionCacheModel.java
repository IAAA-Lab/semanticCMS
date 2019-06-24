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

package com.liferay.docs.datosGob.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.datosGob.model.Distribution;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Distribution in entity cache.
 *
 * @author liferay
 * @see Distribution
 * @generated
 */
@ProviderType
public class DistributionCacheModel implements CacheModel<Distribution>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DistributionCacheModel)) {
			return false;
		}

		DistributionCacheModel distributionCacheModel = (DistributionCacheModel)obj;

		if (url.equals(distributionCacheModel.url)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, url);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", url=");
		sb.append(url);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", tipo=");
		sb.append(tipo);
		sb.append(", datasetId=");
		sb.append(datasetId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Distribution toEntityModel() {
		DistributionImpl distributionImpl = new DistributionImpl();

		if (uuid == null) {
			distributionImpl.setUuid("");
		}
		else {
			distributionImpl.setUuid(uuid);
		}

		if (url == null) {
			distributionImpl.setUrl("");
		}
		else {
			distributionImpl.setUrl(url);
		}

		distributionImpl.setGroupId(groupId);

		if (tipo == null) {
			distributionImpl.setTipo("");
		}
		else {
			distributionImpl.setTipo(tipo);
		}

		if (datasetId == null) {
			distributionImpl.setDatasetId("");
		}
		else {
			distributionImpl.setDatasetId(datasetId);
		}

		distributionImpl.resetOriginalValues();

		return distributionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		url = objectInput.readUTF();

		groupId = objectInput.readLong();
		tipo = objectInput.readUTF();
		datasetId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeLong(groupId);

		if (tipo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipo);
		}

		if (datasetId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(datasetId);
		}
	}

	public String uuid;
	public String url;
	public long groupId;
	public String tipo;
	public String datasetId;
}