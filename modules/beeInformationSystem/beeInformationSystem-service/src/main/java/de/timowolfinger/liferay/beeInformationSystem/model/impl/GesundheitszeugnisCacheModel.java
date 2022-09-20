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

import de.timowolfinger.liferay.beeInformationSystem.model.Gesundheitszeugnis;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Gesundheitszeugnis in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GesundheitszeugnisCacheModel
	implements CacheModel<Gesundheitszeugnis>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GesundheitszeugnisCacheModel)) {
			return false;
		}

		GesundheitszeugnisCacheModel gesundheitszeugnisCacheModel =
			(GesundheitszeugnisCacheModel)object;

		if (gesundheitszeugnis_id ==
				gesundheitszeugnisCacheModel.gesundheitszeugnis_id) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, gesundheitszeugnis_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{gesundheitszeugnis_id=");
		sb.append(gesundheitszeugnis_id);
		sb.append(", seriennummer_lt_form=");
		sb.append(seriennummer_lt_form);
		sb.append(", dokument=");
		sb.append(dokument);
		sb.append(", ausstellungsdatum=");
		sb.append(ausstellungsdatum);
		sb.append(", dokument_dateityp=");
		sb.append(dokument_dateityp);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Gesundheitszeugnis toEntityModel() {
		GesundheitszeugnisImpl gesundheitszeugnisImpl =
			new GesundheitszeugnisImpl();

		gesundheitszeugnisImpl.setGesundheitszeugnis_id(gesundheitszeugnis_id);

		if (seriennummer_lt_form == null) {
			gesundheitszeugnisImpl.setSeriennummer_lt_form("");
		}
		else {
			gesundheitszeugnisImpl.setSeriennummer_lt_form(
				seriennummer_lt_form);
		}

		if (dokument == null) {
			gesundheitszeugnisImpl.setDokument("");
		}
		else {
			gesundheitszeugnisImpl.setDokument(dokument);
		}

		if (ausstellungsdatum == Long.MIN_VALUE) {
			gesundheitszeugnisImpl.setAusstellungsdatum(null);
		}
		else {
			gesundheitszeugnisImpl.setAusstellungsdatum(
				new Date(ausstellungsdatum));
		}

		if (dokument_dateityp == null) {
			gesundheitszeugnisImpl.setDokument_dateityp("");
		}
		else {
			gesundheitszeugnisImpl.setDokument_dateityp(dokument_dateityp);
		}

		gesundheitszeugnisImpl.resetOriginalValues();

		return gesundheitszeugnisImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		gesundheitszeugnis_id = objectInput.readLong();
		seriennummer_lt_form = objectInput.readUTF();
		dokument = objectInput.readUTF();
		ausstellungsdatum = objectInput.readLong();
		dokument_dateityp = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(gesundheitszeugnis_id);

		if (seriennummer_lt_form == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seriennummer_lt_form);
		}

		if (dokument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dokument);
		}

		objectOutput.writeLong(ausstellungsdatum);

		if (dokument_dateityp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dokument_dateityp);
		}
	}

	public long gesundheitszeugnis_id;
	public String seriennummer_lt_form;
	public String dokument;
	public long ausstellungsdatum;
	public String dokument_dateityp;

}