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
 * Provides a wrapper for {@link herstellerService}.
 *
 * @author Brian Wing Shun Chan
 * @see herstellerService
 * @generated
 */
public class herstellerServiceWrapper
	implements herstellerService, ServiceWrapper<herstellerService> {

	public herstellerServiceWrapper() {
		this(null);
	}

	public herstellerServiceWrapper(herstellerService herstellerService) {
		_herstellerService = herstellerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _herstellerService.getOSGiServiceIdentifier();
	}

	@Override
	public herstellerService getWrappedService() {
		return _herstellerService;
	}

	@Override
	public void setWrappedService(herstellerService herstellerService) {
		_herstellerService = herstellerService;
	}

	private herstellerService _herstellerService;

}