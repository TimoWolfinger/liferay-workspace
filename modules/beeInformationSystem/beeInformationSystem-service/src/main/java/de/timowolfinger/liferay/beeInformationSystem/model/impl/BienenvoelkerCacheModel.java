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

import de.timowolfinger.liferay.beeInformationSystem.model.Bienenvoelker;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bienenvoelker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BienenvoelkerCacheModel
	implements CacheModel<Bienenvoelker>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BienenvoelkerCacheModel)) {
			return false;
		}

		BienenvoelkerCacheModel bienenvoelkerCacheModel =
			(BienenvoelkerCacheModel)object;

		if (bienenvoelker_id == bienenvoelkerCacheModel.bienenvoelker_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bienenvoelker_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{bienenvoelker_id=");
		sb.append(bienenvoelker_id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append(", weisel_jahr=");
		sb.append(weisel_jahr);
		sb.append(", bemerkungen=");
		sb.append(bemerkungen);
		sb.append(", bienenvoelker_id=");
		sb.append(bienenvoelker_id);
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
	public Bienenvoelker toEntityModel() {
		BienenvoelkerImpl bienenvoelkerImpl = new BienenvoelkerImpl();

		bienenvoelkerImpl.setBienenvoelker_id(bienenvoelker_id);

		if (bezeichnung == null) {
			bienenvoelkerImpl.setBezeichnung("");
		}
		else {
			bienenvoelkerImpl.setBezeichnung(bezeichnung);
		}

		bienenvoelkerImpl.setWeisel_jahr(weisel_jahr);

		if (bemerkungen == null) {
			bienenvoelkerImpl.setBemerkungen("");
		}
		else {
			bienenvoelkerImpl.setBemerkungen(bemerkungen);
		}

		bienenvoelkerImpl.setBienenvoelker_id(bienenvoelker_id);
		bienenvoelkerImpl.setBienenrasse_id(bienenrasse_id);
		bienenvoelkerImpl.setBeutemass_id(beutemass_id);

		if (geo_coordinaten == null) {
			bienenvoelkerImpl.setGeo_coordinaten("");
		}
		else {
			bienenvoelkerImpl.setGeo_coordinaten(geo_coordinaten);
		}

		bienenvoelkerImpl.setAnschaffung_ableger_jahr(anschaffung_ableger_jahr);
		bienenvoelkerImpl.setAktiv(aktiv);
		bienenvoelkerImpl.setAufloesung_tod_jahr(aufloesung_tod_jahr);
		bienenvoelkerImpl.setGesundheitszeugnis_id(gesundheitszeugnis_id);

		bienenvoelkerImpl.resetOriginalValues();

		return bienenvoelkerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bienenvoelker_id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();

		weisel_jahr = objectInput.readLong();
		bemerkungen = objectInput.readUTF();

		bienenvoelker_id = objectInput.readLong();

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
		objectOutput.writeLong(bienenvoelker_id);

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

		objectOutput.writeLong(bienenvoelker_id);

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

	public long bienenvoelker_id;
	public String bezeichnung;
	public long weisel_jahr;
	public String bemerkungen;
	public long bienenvoelker_id;
	public long bienenrasse_id;
	public long beutemass_id;
	public String geo_coordinaten;
	public int anschaffung_ableger_jahr;
	public boolean aktiv;
	public int aufloesung_tod_jahr;
	public long gesundheitszeugnis_id;

}