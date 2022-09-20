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

import de.timowolfinger.liferay.beeInformationSystem.model.Trachten;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Trachten in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TrachtenCacheModel
	implements CacheModel<Trachten>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TrachtenCacheModel)) {
			return false;
		}

		TrachtenCacheModel trachtenCacheModel = (TrachtenCacheModel)object;

		if (trachten_id == trachtenCacheModel.trachten_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, trachten_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{trachten_id=");
		sb.append(trachten_id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Trachten toEntityModel() {
		TrachtenImpl trachtenImpl = new TrachtenImpl();

		trachtenImpl.setTrachten_id(trachten_id);

		if (bezeichnung == null) {
			trachtenImpl.setBezeichnung("");
		}
		else {
			trachtenImpl.setBezeichnung(bezeichnung);
		}

		trachtenImpl.resetOriginalValues();

		return trachtenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		trachten_id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(trachten_id);

		if (bezeichnung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bezeichnung);
		}
	}

	public long trachten_id;
	public String bezeichnung;

}