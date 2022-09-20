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

import de.timowolfinger.liferay.beeInformationSystem.model.Medikament;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Medikament in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedikamentCacheModel
	implements CacheModel<Medikament>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedikamentCacheModel)) {
			return false;
		}

		MedikamentCacheModel medikamentCacheModel =
			(MedikamentCacheModel)object;

		if (medikament_id == medikamentCacheModel.medikament_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medikament_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{medikament_id=");
		sb.append(medikament_id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", hersteller_id=");
		sb.append(hersteller_id);
		sb.append(", dosierung=");
		sb.append(dosierung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Medikament toEntityModel() {
		MedikamentImpl medikamentImpl = new MedikamentImpl();

		medikamentImpl.setMedikament_id(medikament_id);

		if (name == null) {
			medikamentImpl.setName("");
		}
		else {
			medikamentImpl.setName(name);
		}

		medikamentImpl.setHersteller_id(hersteller_id);

		if (dosierung == null) {
			medikamentImpl.setDosierung("");
		}
		else {
			medikamentImpl.setDosierung(dosierung);
		}

		medikamentImpl.resetOriginalValues();

		return medikamentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medikament_id = objectInput.readLong();
		name = objectInput.readUTF();

		hersteller_id = objectInput.readLong();
		dosierung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medikament_id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(hersteller_id);

		if (dosierung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dosierung);
		}
	}

	public long medikament_id;
	public String name;
	public long hersteller_id;
	public String dosierung;

}