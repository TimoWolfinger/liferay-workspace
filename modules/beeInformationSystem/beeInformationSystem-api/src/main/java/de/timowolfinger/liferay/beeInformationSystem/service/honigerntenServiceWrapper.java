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

package de.timowolfinger.liferay.beeInformationSystem.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link honigerntenService}.
 *
 * @author Brian Wing Shun Chan
 * @see honigerntenService
 * @generated
 */
public class honigerntenServiceWrapper
	implements honigerntenService, ServiceWrapper<honigerntenService> {

	public honigerntenServiceWrapper() {
		this(null);
	}

	public honigerntenServiceWrapper(honigerntenService honigerntenService) {
		_honigerntenService = honigerntenService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _honigerntenService.getOSGiServiceIdentifier();
	}

	@Override
	public honigerntenService getWrappedService() {
		return _honigerntenService;
	}

	@Override
	public void setWrappedService(honigerntenService honigerntenService) {
		_honigerntenService = honigerntenService;
	}

	private honigerntenService _honigerntenService;

}