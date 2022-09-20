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

import de.timowolfinger.liferay.beeInformationSystem.model.Beutemass;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Beutemass in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BeutemassCacheModel
	implements CacheModel<Beutemass>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BeutemassCacheModel)) {
			return false;
		}

		BeutemassCacheModel beutemassCacheModel = (BeutemassCacheModel)object;

		if (beutemass_id == beutemassCacheModel.beutemass_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, beutemass_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{beutemass_id=");
		sb.append(beutemass_id);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Beutemass toEntityModel() {
		BeutemassImpl beutemassImpl = new BeutemassImpl();

		beutemassImpl.setBeutemass_id(beutemass_id);

		if (name == null) {
			beutemassImpl.setName("");
		}
		else {
			beutemassImpl.setName(name);
		}

		beutemassImpl.resetOriginalValues();

		return beutemassImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		beutemass_id = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(beutemass_id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long beutemass_id;
	public String name;

}