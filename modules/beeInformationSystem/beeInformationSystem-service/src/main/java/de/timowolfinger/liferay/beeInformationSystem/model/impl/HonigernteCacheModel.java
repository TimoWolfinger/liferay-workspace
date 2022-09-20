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

import de.timowolfinger.liferay.beeInformationSystem.model.Honigernte;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Honigernte in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HonigernteCacheModel
	implements CacheModel<Honigernte>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HonigernteCacheModel)) {
			return false;
		}

		HonigernteCacheModel honigernteCacheModel =
			(HonigernteCacheModel)object;

		if (honigernte_id == honigernteCacheModel.honigernte_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, honigernte_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{honigernte_id=");
		sb.append(honigernte_id);
		sb.append(", erntedatum=");
		sb.append(erntedatum);
		sb.append(", erntemenge_kg=");
		sb.append(erntemenge_kg);
		sb.append(", bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append(", tracht_id=");
		sb.append(tracht_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Honigernte toEntityModel() {
		HonigernteImpl honigernteImpl = new HonigernteImpl();

		honigernteImpl.setHonigernte_id(honigernte_id);

		if (erntedatum == Long.MIN_VALUE) {
			honigernteImpl.setErntedatum(null);
		}
		else {
			honigernteImpl.setErntedatum(new Date(erntedatum));
		}

		honigernteImpl.setErntemenge_kg(erntemenge_kg);
		honigernteImpl.setBienenvolk_id(bienenvolk_id);
		honigernteImpl.setTracht_id(tracht_id);

		honigernteImpl.resetOriginalValues();

		return honigernteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		honigernte_id = objectInput.readLong();
		erntedatum = objectInput.readLong();

		erntemenge_kg = objectInput.readInt();

		bienenvolk_id = objectInput.readLong();

		tracht_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(honigernte_id);
		objectOutput.writeLong(erntedatum);

		objectOutput.writeInt(erntemenge_kg);

		objectOutput.writeLong(bienenvolk_id);

		objectOutput.writeLong(tracht_id);
	}

	public long honigernte_id;
	public long erntedatum;
	public int erntemenge_kg;
	public long bienenvolk_id;
	public long tracht_id;

}