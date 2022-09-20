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

import de.timowolfinger.liferay.beeInformationSystem.model.Honigernten;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Honigernten in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HonigerntenCacheModel
	implements CacheModel<Honigernten>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HonigerntenCacheModel)) {
			return false;
		}

		HonigerntenCacheModel honigerntenCacheModel =
			(HonigerntenCacheModel)object;

		if (honigernten_id == honigerntenCacheModel.honigernten_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, honigernten_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{honigernten_id=");
		sb.append(honigernten_id);
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
	public Honigernten toEntityModel() {
		HonigerntenImpl honigerntenImpl = new HonigerntenImpl();

		honigerntenImpl.setHonigernten_id(honigernten_id);

		if (erntedatum == Long.MIN_VALUE) {
			honigerntenImpl.setErntedatum(null);
		}
		else {
			honigerntenImpl.setErntedatum(new Date(erntedatum));
		}

		honigerntenImpl.setErntemenge_kg(erntemenge_kg);
		honigerntenImpl.setBienenvolk_id(bienenvolk_id);
		honigerntenImpl.setTracht_id(tracht_id);

		honigerntenImpl.resetOriginalValues();

		return honigerntenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		honigernten_id = objectInput.readLong();
		erntedatum = objectInput.readLong();

		erntemenge_kg = objectInput.readInt();

		bienenvolk_id = objectInput.readLong();

		tracht_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(honigernten_id);
		objectOutput.writeLong(erntedatum);

		objectOutput.writeInt(erntemenge_kg);

		objectOutput.writeLong(bienenvolk_id);

		objectOutput.writeLong(tracht_id);
	}

	public long honigernten_id;
	public long erntedatum;
	public int erntemenge_kg;
	public long bienenvolk_id;
	public long tracht_id;

}