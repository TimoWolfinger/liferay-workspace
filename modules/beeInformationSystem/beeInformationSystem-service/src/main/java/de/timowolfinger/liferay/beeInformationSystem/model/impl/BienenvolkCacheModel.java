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

package de.timowolfinger.liferay.beeInformationSystem.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvolk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bienenvolk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BienenvolkCacheModel
	implements CacheModel<Bienenvolk>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BienenvolkCacheModel)) {
			return false;
		}

		BienenvolkCacheModel bienenvolkCacheModel =
			(BienenvolkCacheModel)object;

		if (bienenvolk_id == bienenvolkCacheModel.bienenvolk_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bienenvolk_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append(", weisel_jahr=");
		sb.append(weisel_jahr);
		sb.append(", bemerkungen=");
		sb.append(bemerkungen);
		sb.append(", bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append(", bienenrasse_id=");
		sb.append(bienenrasse_id);
		sb.append(", beutemass_id=");
		sb.append(beutemass_id);
		sb.append(", geo_coordinaten=");
		sb.append(geo_coordinaten);
		sb.append(", anschaffung_ableger_jahr=");
		sb.append(anschaffung_ableger_jahr);
		sb.append(", aktiv=");
		sb.append(aktiv);
		sb.append(", aufloesung_tod_jahr=");
		sb.append(aufloesung_tod_jahr);
		sb.append(", gesundheitszeugnis_id=");
		sb.append(gesundheitszeugnis_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bienenvolk toEntityModel() {
		BienenvolkImpl bienenvolkImpl = new BienenvolkImpl();

		bienenvolkImpl.setBienenvolk_id(bienenvolk_id);

		if (bezeichnung == null) {
			bienenvolkImpl.setBezeichnung("");
		}
		else {
			bienenvolkImpl.setBezeichnung(bezeichnung);
		}

		bienenvolkImpl.setWeisel_jahr(weisel_jahr);

		if (bemerkungen == null) {
			bienenvolkImpl.setBemerkungen("");
		}
		else {
			bienenvolkImpl.setBemerkungen(bemerkungen);
		}

		bienenvolkImpl.setBienenvolk_id(bienenvolk_id);
		bienenvolkImpl.setBienenrasse_id(bienenrasse_id);
		bienenvolkImpl.setBeutemass_id(beutemass_id);

		if (geo_coordinaten == null) {
			bienenvolkImpl.setGeo_coordinaten("");
		}
		else {
			bienenvolkImpl.setGeo_coordinaten(geo_coordinaten);
		}

		bienenvolkImpl.setAnschaffung_ableger_jahr(anschaffung_ableger_jahr);
		bienenvolkImpl.setAktiv(aktiv);
		bienenvolkImpl.setAufloesung_tod_jahr(aufloesung_tod_jahr);
		bienenvolkImpl.setGesundheitszeugnis_id(gesundheitszeugnis_id);

		bienenvolkImpl.resetOriginalValues();

		return bienenvolkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bienenvolk_id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();

		weisel_jahr = objectInput.readLong();
		bemerkungen = objectInput.readUTF();

		bienenvolk_id = objectInput.readLong();

		bienenrasse_id = objectInput.readLong();

		beutemass_id = objectInput.readLong();
		geo_coordinaten = objectInput.readUTF();

		anschaffung_ableger_jahr = objectInput.readInt();

		aktiv = objectInput.readBoolean();

		aufloesung_tod_jahr = objectInput.readInt();

		gesundheitszeugnis_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(bienenvolk_id);

		if (bezeichnung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bezeichnung);
		}

		objectOutput.writeLong(weisel_jahr);

		if (bemerkungen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bemerkungen);
		}

		objectOutput.writeLong(bienenvolk_id);

		objectOutput.writeLong(bienenrasse_id);

		objectOutput.writeLong(beutemass_id);

		if (geo_coordinaten == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(geo_coordinaten);
		}

		objectOutput.writeInt(anschaffung_ableger_jahr);

		objectOutput.writeBoolean(aktiv);

		objectOutput.writeInt(aufloesung_tod_jahr);

		objectOutput.writeLong(gesundheitszeugnis_id);
	}

	public long bienenvolk_id;
	public String bezeichnung;
	public long weisel_jahr;
	public String bemerkungen;
	public long bienenvolk_id;
	public long bienenrasse_id;
	public long beutemass_id;
	public String geo_coordinaten;
	public int anschaffung_ableger_jahr;
	public boolean aktiv;
	public int aufloesung_tod_jahr;
	public long gesundheitszeugnis_id;

}