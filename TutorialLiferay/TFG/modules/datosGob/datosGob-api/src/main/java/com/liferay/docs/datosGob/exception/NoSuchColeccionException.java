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
package com.liferay.docs.datosGob.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author liferay
 */
@ProviderType
public class NoSuchColeccionException extends NoSuchModelException {

	public NoSuchColeccionException() {
	}

	public NoSuchColeccionException(String msg) {
		super(msg);
	}

	public NoSuchColeccionException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchColeccionException(Throwable cause) {
		super(cause);
	}

}