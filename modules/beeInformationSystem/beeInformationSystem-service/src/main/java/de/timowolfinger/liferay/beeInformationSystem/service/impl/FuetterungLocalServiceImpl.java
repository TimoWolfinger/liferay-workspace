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

import de.timowolfinger.liferay.beeInformationSystem.service.base.FuetterungLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung",
	service = AopService.class
)
public class FuetterungLocalServiceImpl extends FuetterungLocalServiceBaseImpl {

	public Fuetterung addFuetterung( long futtermittel_id, Date beginn, Date ende, long menge_kg, long bienenvolk_id ) {

		long fuetterung_id = counterLocalService.increment();

		Fuetterung fuetterung = fuetterungPersistance.create(fuetterung_id);

		fuetterung.setFuttermittel_id(futtermittel_id);
		fuetterung.setBeginn(beginn);
		fuetterung.setEnde(ende);
		fuetterung.setMenge_kg(menge_kg);
		fuetterung.setBienenvolk_id(bienenvolk_id);

		bienenvolkPersistance.update(bienenvolk);
		return biennenvolk;
	}
}