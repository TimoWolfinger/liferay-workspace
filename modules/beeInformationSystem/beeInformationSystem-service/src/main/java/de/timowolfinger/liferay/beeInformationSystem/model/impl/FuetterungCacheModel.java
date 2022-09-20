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

import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Fuetterung in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FuetterungCacheModel
	implements CacheModel<Fuetterung>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FuetterungCacheModel)) {
			return false;
		}

		FuetterungCacheModel fuetterungCacheModel =
			(FuetterungCacheModel)object;

		if (fuetterung_id == fuetterungCacheModel.fuetterung_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fuetterung_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{fuetterung_id=");
		sb.append(fuetterung_id);
		sb.append(", futtermittel_id=");
		sb.append(futtermittel_id);
		sb.append(", beginn=");
		sb.append(beginn);
		sb.append(", ende=");
		sb.append(ende);
		sb.append(", menge_kg=");
		sb.append(menge_kg);
		sb.append(", bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Fuetterung toEntityModel() {
		FuetterungImpl fuetterungImpl = new FuetterungImpl();

		fuetterungImpl.setFuetterung_id(fuetterung_id);
		fuetterungImpl.setFuttermittel_id(futtermittel_id);

		if (beginn == Long.MIN_VALUE) {
			fuetterungImpl.setBeginn(null);
		}
		else {
			fuetterungImpl.setBeginn(new Date(beginn));
		}

		if (ende == Long.MIN_VALUE) {
			fuetterungImpl.setEnde(null);
		}
		else {
			fuetterungImpl.setEnde(new Date(ende));
		}

		fuetterungImpl.setMenge_kg(menge_kg);
		fuetterungImpl.setBienenvolk_id(bienenvolk_id);

		fuetterungImpl.resetOriginalValues();

		return fuetterungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fuetterung_id = objectInput.readLong();

		futtermittel_id = objectInput.readLong();
		beginn = objectInput.readLong();
		ende = objectInput.readLong();

		menge_kg = objectInput.readLong();

		bienenvolk_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fuetterung_id);

		objectOutput.writeLong(futtermittel_id);
		objectOutput.writeLong(beginn);
		objectOutput.writeLong(ende);

		objectOutput.writeLong(menge_kg);

		objectOutput.writeLong(bienenvolk_id);
	}

	public long fuetterung_id;
	public long futtermittel_id;
	public long beginn;
	public long ende;
	public long menge_kg;
	public long bienenvolk_id;

}