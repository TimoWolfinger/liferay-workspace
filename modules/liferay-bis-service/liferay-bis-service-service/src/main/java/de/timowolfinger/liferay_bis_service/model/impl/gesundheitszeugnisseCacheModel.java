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

package de.timowolfinger.liferay_bis_service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import de.timowolfinger.liferay_bis_service.model.gesundheitszeugnisse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing gesundheitszeugnisse in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class gesundheitszeugnisseCacheModel
	implements CacheModel<gesundheitszeugnisse>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof gesundheitszeugnisseCacheModel)) {
			return false;
		}

		gesundheitszeugnisseCacheModel gesundheitszeugnisseCacheModel =
			(gesundheitszeugnisseCacheModel)object;

		if (id == gesundheitszeugnisseCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
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
	public gesundheitszeugnisse toEntityModel() {
		gesundheitszeugnisseImpl gesundheitszeugnisseImpl =
			new gesundheitszeugnisseImpl();

		gesundheitszeugnisseImpl.setId(id);

		if (seriennummer_lt_form == null) {
			gesundheitszeugnisseImpl.setSeriennummer_lt_form("");
		}
		else {
			gesundheitszeugnisseImpl.setSeriennummer_lt_form(
				seriennummer_lt_form);
		}

		if (dokument == null) {
			gesundheitszeugnisseImpl.setDokument("");
		}
		else {
			gesundheitszeugnisseImpl.setDokument(dokument);
		}

		if (ausstellungsdatum == Long.MIN_VALUE) {
			gesundheitszeugnisseImpl.setAusstellungsdatum(null);
		}
		else {
			gesundheitszeugnisseImpl.setAusstellungsdatum(
				new Date(ausstellungsdatum));
		}

		if (dokument_dateityp == null) {
			gesundheitszeugnisseImpl.setDokument_dateityp("");
		}
		else {
			gesundheitszeugnisseImpl.setDokument_dateityp(dokument_dateityp);
		}

		gesundheitszeugnisseImpl.resetOriginalValues();

		return gesundheitszeugnisseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		seriennummer_lt_form = objectInput.readUTF();
		dokument = objectInput.readUTF();
		ausstellungsdatum = objectInput.readLong();
		dokument_dateityp = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

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

	public long id;
	public String seriennummer_lt_form;
	public String dokument;
	public long ausstellungsdatum;
	public String dokument_dateityp;

}