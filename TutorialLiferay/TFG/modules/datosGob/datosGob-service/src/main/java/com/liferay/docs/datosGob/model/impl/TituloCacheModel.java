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

import com.liferay.docs.datosGob.model.Titulo;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Titulo in entity cache.
 *
 * @author liferay
 * @see Titulo
 * @generated
 */
@ProviderType
public class TituloCacheModel implements CacheModel<Titulo>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TituloCacheModel)) {
			return false;
		}

		TituloCacheModel tituloCacheModel = (TituloCacheModel)obj;

		if (tituloId == tituloCacheModel.tituloId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tituloId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", tituloId=");
		sb.append(tituloId);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", datasetId=");
		sb.append(datasetId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Titulo toEntityModel() {
		TituloImpl tituloImpl = new TituloImpl();

		if (uuid == null) {
			tituloImpl.setUuid("");
		}
		else {
			tituloImpl.setUuid(uuid);
		}

		tituloImpl.setGroupId(groupId);
		tituloImpl.setTituloId(tituloId);

		if (titulo == null) {
			tituloImpl.setTitulo("");
		}
		else {
			tituloImpl.setTitulo(titulo);
		}

		if (datasetId == null) {
			tituloImpl.setDatasetId("");
		}
		else {
			tituloImpl.setDatasetId(datasetId);
		}

		tituloImpl.resetOriginalValues();

		return tituloImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		groupId = objectInput.readLong();

		tituloId = objectInput.readLong();
		titulo = objectInput.readUTF();
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

		objectOutput.writeLong(tituloId);

		if (titulo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titulo);
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
	public long tituloId;
	public String titulo;
	public String datasetId;
}