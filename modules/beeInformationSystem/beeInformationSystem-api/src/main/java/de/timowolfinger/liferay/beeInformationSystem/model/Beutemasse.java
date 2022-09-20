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

package de.timowolfinger.liferay.beeInformationSystem.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Beutemasse service. Represents a row in the &quot;beutemasse&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BeutemasseModel
 * @generated
 */
@ImplementationClassName(
	"de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseImpl"
)
@ProviderType
public interface Beutemasse extends BeutemasseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemasseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Beutemasse, Long> BEUTEMASSE_ID_ACCESSOR =
		new Accessor<Beutemasse, Long>() {

			@Override
			public Long get(Beutemasse beutemasse) {
				return beutemasse.getBeutemasse_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Beutemasse> getTypeClass() {
				return Beutemasse.class;
			}

		};

}