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

package de.timowolfinger.liferay.beeInformationSystem.service.impl;

import com.liferay.portal.aop.AopService;

import de.timowolfinger.liferay.beeInformationSystem.service.base.BehandlungLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=de.timowolfinger.liferay.beeInformationSystem.model.Behandlung",
	service = AopService.class
)
public class BehandlungLocalServiceImpl extends BehandlungLocalServiceBaseImpl {

	public Behandlung addBehandlung(Long bienenvolk_id, Long medikament_id, Date beginn, Date ende) {
		Long behandlung_id = counterLocalService.increment();

		Behandlung behandlung = behandlungPersistance.create(behandlung_id);
		behandlung.setBienenvolk_id(bienenvolk_id);
		behandlung.setMedikament_id(medikament_id);
		behandlung.setBeginn(beginn);
		behandlung.setEnde(ende);

		behandlungPersistance.update(behandlung);
		return behandlung;
	}

}