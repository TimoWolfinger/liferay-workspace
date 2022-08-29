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

import de.timowolfinger.liferay_bis_service.model.ableger;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ableger in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ablegerCacheModel implements CacheModel<ableger>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ablegerCacheModel)) {
			return false;
		}

		ablegerCacheModel ablegerCacheModel = (ablegerCacheModel)object;

		if (id == ablegerCacheModel.id) {
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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append(", datum_ablegerbildung=");
		sb.append(datum_ablegerbildung);
		sb.append(", muttervolk_id=");
		sb.append(muttervolk_id);
		sb.append(", erfolgreich=");
		sb.append(erfolgreich);
		sb.append(", abgeschlossen=");
		sb.append(abgeschlossen);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ableger toEntityModel() {
		ablegerImpl ablegerImpl = new ablegerImpl();

		ablegerImpl.setId(id);

		if (bezeichnung == null) {
			ablegerImpl.setBezeichnung("");
		}
		else {
			ablegerImpl.setBezeichnung(bezeichnung);
		}

		if (datum_ablegerbildung == Long.MIN_VALUE) {
			ablegerImpl.setDatum_ablegerbildung(null);
		}
		else {
			ablegerImpl.setDatum_ablegerbildung(new Date(datum_ablegerbildung));
		}

		ablegerImpl.setMuttervolk_id(muttervolk_id);
		ablegerImpl.setErfolgreich(erfolgreich);
		ablegerImpl.setAbgeschlossen(abgeschlossen);

		ablegerImpl.resetOriginalValues();

		return ablegerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();
		datum_ablegerbildung = objectInput.readLong();

		muttervolk_id = objectInput.readLong();

		erfolgreich = objectInput.readBoolean();

		abgeschlossen = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (bezeichnung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bezeichnung);
		}

		objectOutput.writeLong(datum_ablegerbildung);

		objectOutput.writeLong(muttervolk_id);

		objectOutput.writeBoolean(erfolgreich);

		objectOutput.writeBoolean(abgeschlossen);
	}

	public long id;
	public String bezeichnung;
	public long datum_ablegerbildung;
	public long muttervolk_id;
	public boolean erfolgreich;
	public boolean abgeschlossen;

}