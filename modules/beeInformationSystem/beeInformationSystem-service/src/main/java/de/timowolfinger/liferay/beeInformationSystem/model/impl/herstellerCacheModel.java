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

import de.timowolfinger.liferay.beeInformationSystem.model.hersteller;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing hersteller in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class herstellerCacheModel
	implements CacheModel<hersteller>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof herstellerCacheModel)) {
			return false;
		}

		herstellerCacheModel herstellerCacheModel =
			(herstellerCacheModel)object;

		if (hersteller_id == herstellerCacheModel.hersteller_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hersteller_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{hersteller_id=");
		sb.append(hersteller_id);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public hersteller toEntityModel() {
		herstellerImpl herstellerImpl = new herstellerImpl();

		herstellerImpl.setHersteller_id(hersteller_id);

		if (name == null) {
			herstellerImpl.setName("");
		}
		else {
			herstellerImpl.setName(name);
		}

		herstellerImpl.resetOriginalValues();

		return herstellerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hersteller_id = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(hersteller_id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long hersteller_id;
	public String name;

}