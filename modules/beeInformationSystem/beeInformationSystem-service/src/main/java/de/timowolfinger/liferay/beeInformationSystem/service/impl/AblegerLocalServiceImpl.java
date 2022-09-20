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

import de.timowolfinger.liferay.beeInformationSystem.service.base.AblegerLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan, Timo Wolfinger
 */
@Component(
	property = "model.class.name=de.timowolfinger.liferay.beeInformationSystem.model.Ableger",
	service = AopService.class
)
public class AblegerLocalServiceImpl extends AblegerLocalServiceBaseImpl {

	public Ableger addAbleger(String bezeichnung, Date datum_ablegerbildung, Long muttervolk_id, Boolean erfolgreich, Boolean abgeschlossen) {

		Long ablegerId = counterLocalService.increment();

		Ableger ableger = ablegerPersistance.create(ablegerId);

		ableger.setBezeichnung(bezeichnung);
		ableger.setDatum_ablegerbildung(datum_ablegerbildung);
		ableger.setBienenvolk_id(muttervolk_id);
		ableger.setErfolgreich(erfolgreich);
		ableger.setAbgeschlossen(abgeschlossen);

		ablegerPersistance.update(ableger);
		return ableger;
	}
}