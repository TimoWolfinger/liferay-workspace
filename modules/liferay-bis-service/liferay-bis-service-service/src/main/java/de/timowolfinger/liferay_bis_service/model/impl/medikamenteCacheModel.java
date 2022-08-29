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

import de.timowolfinger.liferay_bis_service.model.medikamente;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing medikamente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class medikamenteCacheModel
	implements CacheModel<medikamente>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof medikamenteCacheModel)) {
			return false;
		}

		medikamenteCacheModel medikamenteCacheModel =
			(medikamenteCacheModel)object;

		if (id == medikamenteCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
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
	public medikamente toEntityModel() {
		medikamenteImpl medikamenteImpl = new medikamenteImpl();

		medikamenteImpl.setId(id);

		if (name == null) {
			medikamenteImpl.setName("");
		}
		else {
			medikamenteImpl.setName(name);
		}

		medikamenteImpl.setHersteller_id(hersteller_id);

		if (dosierung == null) {
			medikamenteImpl.setDosierung("");
		}
		else {
			medikamenteImpl.setDosierung(dosierung);
		}

		medikamenteImpl.resetOriginalValues();

		return medikamenteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();

		hersteller_id = objectInput.readLong();
		dosierung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

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

	public long id;
	public String name;
	public long hersteller_id;
	public String dosierung;

}