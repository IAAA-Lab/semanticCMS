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

import com.liferay.docs.datosGob.model.Descripcion;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Descripcion in entity cache.
 *
 * @author liferay
 * @see Descripcion
 * @generated
 */
@ProviderType
public class DescripcionCacheModel implements CacheModel<Descripcion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DescripcionCacheModel)) {
			return false;
		}

		DescripcionCacheModel descripcionCacheModel = (DescripcionCacheModel)obj;

		if (descripcionId == descripcionCacheModel.descripcionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, descripcionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", descripcionId=");
		sb.append(descripcionId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", datasetId=");
		sb.append(datasetId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Descripcion toEntityModel() {
		DescripcionImpl descripcionImpl = new DescripcionImpl();

		if (uuid == null) {
			descripcionImpl.setUuid("");
		}
		else {
			descripcionImpl.setUuid(uuid);
		}

		descripcionImpl.setGroupId(groupId);
		descripcionImpl.setDescripcionId(descripcionId);

		if (descripcion == null) {
			descripcionImpl.setDescripcion("");
		}
		else {
			descripcionImpl.setDescripcion(descripcion);
		}

		if (datasetId == null) {
			descripcionImpl.setDatasetId("");
		}
		else {
			descripcionImpl.setDatasetId(datasetId);
		}

		descripcionImpl.resetOriginalValues();

		return descripcionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		groupId = objectInput.readLong();

		descripcionId = objectInput.readLong();
		descripcion = objectInput.readUTF();
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

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(descripcionId);

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (datasetId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(datasetId);
		}
	}

	public String uuid;
	public long groupId;
	public long descripcionId;
	public String descripcion;
	public String datasetId;
}