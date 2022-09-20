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

import de.timowolfinger.liferay.beeInformationSystem.model.Fuetterungen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Fuetterungen in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FuetterungenCacheModel
	implements CacheModel<Fuetterungen>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FuetterungenCacheModel)) {
			return false;
		}

		FuetterungenCacheModel fuetterungenCacheModel =
			(FuetterungenCacheModel)object;

		if (fuetterungen_id == fuetterungenCacheModel.fuetterungen_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fuetterungen_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{fuetterungen_id=");
		sb.append(fuetterungen_id);
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
	public Fuetterungen toEntityModel() {
		FuetterungenImpl fuetterungenImpl = new FuetterungenImpl();

		fuetterungenImpl.setFuetterungen_id(fuetterungen_id);
		fuetterungenImpl.setFuttermittel_id(futtermittel_id);

		if (beginn == Long.MIN_VALUE) {
			fuetterungenImpl.setBeginn(null);
		}
		else {
			fuetterungenImpl.setBeginn(new Date(beginn));
		}

		if (ende == Long.MIN_VALUE) {
			fuetterungenImpl.setEnde(null);
		}
		else {
			fuetterungenImpl.setEnde(new Date(ende));
		}

		fuetterungenImpl.setMenge_kg(menge_kg);
		fuetterungenImpl.setBienenvolk_id(bienenvolk_id);

		fuetterungenImpl.resetOriginalValues();

		return fuetterungenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fuetterungen_id = objectInput.readLong();

		futtermittel_id = objectInput.readLong();
		beginn = objectInput.readLong();
		ende = objectInput.readLong();

		menge_kg = objectInput.readLong();

		bienenvolk_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fuetterungen_id);

		objectOutput.writeLong(futtermittel_id);
		objectOutput.writeLong(beginn);
		objectOutput.writeLong(ende);

		objectOutput.writeLong(menge_kg);

		objectOutput.writeLong(bienenvolk_id);
	}

	public long fuetterungen_id;
	public long futtermittel_id;
	public long beginn;
	public long ende;
	public long menge_kg;
	public long bienenvolk_id;

}