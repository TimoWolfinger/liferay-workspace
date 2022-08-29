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

package de.timowolfinger.liferay_bis_service.model.impl;

import de.timowolfinger.liferay_bis_service.model.trachten;
import de.timowolfinger.liferay_bis_service.service.trachtenLocalServiceUtil;

/**
 * The extended model base implementation for the trachten service. Represents a row in the &quot;trachten&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link trachtenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see trachtenImpl
 * @see trachten
 * @generated
 */
public abstract class trachtenBaseImpl
	extends trachtenModelImpl implements trachten {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a trachten model instance should use the <code>trachten</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			trachtenLocalServiceUtil.addtrachten(this);
		}
		else {
			trachtenLocalServiceUtil.updatetrachten(this);
		}
	}

}