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

import de.timowolfinger.liferay.beeInformationSystem.model.Tracht;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Tracht in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TrachtCacheModel implements CacheModel<Tracht>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TrachtCacheModel)) {
			return false;
		}

		TrachtCacheModel trachtCacheModel = (TrachtCacheModel)object;

		if (tracht_id == trachtCacheModel.tracht_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tracht_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tracht_id=");
		sb.append(tracht_id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tracht toEntityModel() {
		TrachtImpl trachtImpl = new TrachtImpl();

		trachtImpl.setTracht_id(tracht_id);

		if (bezeichnung == null) {
			trachtImpl.setBezeichnung("");
		}
		else {
			trachtImpl.setBezeichnung(bezeichnung);
		}

		trachtImpl.resetOriginalValues();

		return trachtImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tracht_id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tracht_id);

		if (bezeichnung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bezeichnung);
		}
	}

	public long tracht_id;
	public String bezeichnung;

}