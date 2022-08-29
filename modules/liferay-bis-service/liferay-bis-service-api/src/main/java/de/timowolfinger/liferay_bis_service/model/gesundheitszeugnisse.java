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

package de.timowolfinger.liferay_bis_service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the gesundheitszeugnisse service. Represents a row in the &quot;gesundheitszeugnisse&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see gesundheitszeugnisseModel
 * @generated
 */
@ImplementationClassName(
	"de.timowolfinger.liferay_bis_service.model.impl.gesundheitszeugnisseImpl"
)
@ProviderType
public interface gesundheitszeugnisse
	extends gesundheitszeugnisseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>de.timowolfinger.liferay_bis_service.model.impl.gesundheitszeugnisseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<gesundheitszeugnisse, Long> ID_ACCESSOR =
		new Accessor<gesundheitszeugnisse, Long>() {

			@Override
			public Long get(gesundheitszeugnisse gesundheitszeugnisse) {
				return gesundheitszeugnisse.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<gesundheitszeugnisse> getTypeClass() {
				return gesundheitszeugnisse.class;
			}

		};

}