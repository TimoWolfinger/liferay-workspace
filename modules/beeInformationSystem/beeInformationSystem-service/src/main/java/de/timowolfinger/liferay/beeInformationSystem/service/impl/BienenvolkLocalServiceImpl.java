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

import de.timowolfinger.liferay.beeInformationSystem.service.base.BienenvolkLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk",
	service = AopService.class
)
public class BienenvolkLocalServiceImpl extends BienenvolkLocalServiceBaseImpl {

	public Bienenvolk addBienenvolk(String bezeichnung, 
		long weisel_jahr, String bemerkungen, long muttervolk_id, 
		long bienenrasse_id, long beutemass_id, String geo_coordinaten, 
		int anschaffung_ableger_jahr, Boolean aktiv, 
		int aufloesung_tod_jahr, long gesundheitszeugnis_id ) {

			long bienenvolk_id = counterLocalService.increment();

			Bienenvolk bienenvolk = bienenvolkPersistance.create(bienenvolk_id);
			bienenvolk.setBezeichnung(bezeichnung);
			bienenvolk.setWeisel_jahr(weisel_jahr);
			bienenvolk.setBemerkungen(bemerkungen);
			bienenvolk.setBienenvolk_id(muttervolk_id);
			bienenvolk.setBienenrasse_id(bienenrasse_id);
			bienenvolk.setBeutemassId(beutemass_id);
			bienenvolk.setGeoCoordinaten(geo_coordinaten);
			bienenvolk.setAnschaffung_ableger_jar(anschaffung_ableger_jahr);
			bienenvolk.setAktiv(aktiv);
			bienenvolk.setAufloesung_tod_jahr(aufloesung_tod_jahr);
			bienenvolk.setGesundheitszeugnis_id(gesundheitszeugnis_id);

			bienenvolkPersistance.update(bienenvolk);
			return bienenvolk;
	}
}