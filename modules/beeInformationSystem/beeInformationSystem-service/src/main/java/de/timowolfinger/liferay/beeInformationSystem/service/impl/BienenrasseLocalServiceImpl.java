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

import de.timowolfinger.liferay.beeInformationSystem.service.base.BienenrasseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=de.timowolfinger.liferay.beeInformationSystem.model.Bienenrasse",
	service = AopService.class
)
public class BienenrasseLocalServiceImpl
	extends BienenrasseLocalServiceBaseImpl {

		public Bienenrasse addBienenrasse(String bezeichnung) {
			Long bienenrasse_id counterLocalService.increment();

			Bienenrasse bienenrasse = bienenrassePersistance.create(bienenrasse_id);
			bienenrasse.setBezeichnung(bezeichnung);

			bienenrassePersistance.update(bienenrasse);
			return bienenrasse;
		}
}