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

import com.liferay.docs.datosGob.model.Dataset;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Dataset in entity cache.
 *
 * @author liferay
 * @see Dataset
 * @generated
 */
@ProviderType
public class DatasetCacheModel implements CacheModel<Dataset>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DatasetCacheModel)) {
			return false;
		}

		DatasetCacheModel datasetCacheModel = (DatasetCacheModel)obj;

		if (datasetId.equals(datasetCacheModel.datasetId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, datasetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", datasetId=");
		sb.append(datasetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", homepage=");
		sb.append(homepage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dataset toEntityModel() {
		DatasetImpl datasetImpl = new DatasetImpl();

		if (uuid == null) {
			datasetImpl.setUuid("");
		}
		else {
			datasetImpl.setUuid(uuid);
		}

		if (datasetId == null) {
			datasetImpl.setDatasetId("");
		}
		else {
			datasetImpl.setDatasetId(datasetId);
		}

		datasetImpl.setGroupId(groupId);

		if (homepage == null) {
			datasetImpl.setHomepage("");
		}
		else {
			datasetImpl.setHomepage(homepage);
		}

		datasetImpl.resetOriginalValues();

		return datasetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		datasetId = objectInput.readUTF();

		groupId = objectInput.readLong();
		homepage = objectInput.readUTF();
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

		if (datasetId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(datasetId);
		}

		objectOutput.writeLong(groupId);

		if (homepage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homepage);
		}
	}

	public String uuid;
	public String datasetId;
	public long groupId;
	public String homepage;
}