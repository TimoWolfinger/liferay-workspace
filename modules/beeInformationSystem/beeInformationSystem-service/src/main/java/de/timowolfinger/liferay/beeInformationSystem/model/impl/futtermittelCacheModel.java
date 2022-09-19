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

import de.timowolfinger.liferay.beeInformationSystem.model.futtermittel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing futtermittel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class futtermittelCacheModel
	implements CacheModel<futtermittel>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof futtermittelCacheModel)) {
			return false;
		}

		futtermittelCacheModel futtermittelCacheModel =
			(futtermittelCacheModel)object;

		if (futtermittel_id == futtermittelCacheModel.futtermittel_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, futtermittel_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{futtermittel_id=");
		sb.append(futtermittel_id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", hersteller_id=");
		sb.append(hersteller_id);
		sb.append(", gebindegroesse=");
		sb.append(gebindegroesse);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public futtermittel toEntityModel() {
		futtermittelImpl futtermittelImpl = new futtermittelImpl();

		futtermittelImpl.setFuttermittel_id(futtermittel_id);

		if (name == null) {
			futtermittelImpl.setName("");
		}
		else {
			futtermittelImpl.setName(name);
		}

		futtermittelImpl.setHersteller_id(hersteller_id);

		if (gebindegroesse == null) {
			futtermittelImpl.setGebindegroesse("");
		}
		else {
			futtermittelImpl.setGebindegroesse(gebindegroesse);
		}

		futtermittelImpl.resetOriginalValues();

		return futtermittelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		futtermittel_id = objectInput.readLong();
		name = objectInput.readUTF();

		hersteller_id = objectInput.readLong();
		gebindegroesse = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(futtermittel_id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(hersteller_id);

		if (gebindegroesse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gebindegroesse);
		}
	}

	public long futtermittel_id;
	public String name;
	public long hersteller_id;
	public String gebindegroesse;

}