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

import de.timowolfinger.liferay_bis_service.model.trachten;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing trachten in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class trachtenCacheModel
	implements CacheModel<trachten>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof trachtenCacheModel)) {
			return false;
		}

		trachtenCacheModel trachtenCacheModel = (trachtenCacheModel)object;

		if (id == trachtenCacheModel.id) {
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
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", bezeichnung=");
		sb.append(bezeichnung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public trachten toEntityModel() {
		trachtenImpl trachtenImpl = new trachtenImpl();

		trachtenImpl.setId(id);

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
		id = objectInput.readLong();
		bezeichnung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (bezeichnung == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bezeichnung);
		}
	}

	public long id;
	public String bezeichnung;

}