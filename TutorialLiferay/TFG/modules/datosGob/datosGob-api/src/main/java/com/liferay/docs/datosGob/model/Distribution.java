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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Distribution service. Represents a row in the &quot;DB_Distribution&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see DistributionModel
 * @see com.liferay.docs.datosGob.model.impl.DistributionImpl
 * @see com.liferay.docs.datosGob.model.impl.DistributionModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.docs.datosGob.model.impl.DistributionImpl")
@ProviderType
public interface Distribution extends DistributionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.docs.datosGob.model.impl.DistributionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Distribution, Long> DISTRIBUTION_ID_ACCESSOR = new Accessor<Distribution, Long>() {
			@Override
			public Long get(Distribution distribution) {
				return distribution.getDistributionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Distribution> getTypeClass() {
				return Distribution.class;
			}
		};
}