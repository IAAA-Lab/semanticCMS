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

import com.liferay.docs.datosGob.model.Coleccion;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Coleccion in entity cache.
 *
 * @author liferay
 * @see Coleccion
 * @generated
 */
@ProviderType
public class ColeccionCacheModel implements CacheModel<Coleccion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ColeccionCacheModel)) {
			return false;
		}

		ColeccionCacheModel coleccionCacheModel = (ColeccionCacheModel)obj;

		if (homepage.equals(coleccionCacheModel.homepage)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, homepage);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", homepage=");
		sb.append(homepage);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Coleccion toEntityModel() {
		ColeccionImpl coleccionImpl = new ColeccionImpl();

		if (uuid == null) {
			coleccionImpl.setUuid("");
		}
		else {
			coleccionImpl.setUuid(uuid);
		}

		coleccionImpl.setGroupId(groupId);

		if (homepage == null) {
			coleccionImpl.setHomepage("");
		}
		else {
			coleccionImpl.setHomepage(homepage);
		}

		if (titulo == null) {
			coleccionImpl.setTitulo("");
		}
		else {
			coleccionImpl.setTitulo(titulo);
		}

		coleccionImpl.resetOriginalValues();

		return coleccionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		groupId = objectInput.readLong();
		homepage = objectInput.readUTF();
		titulo = objectInput.readUTF();
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

		if (homepage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homepage);
		}

		if (titulo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titulo);
		}
	}

	public String uuid;
	public long groupId;
	public String homepage;
	public String titulo;
}