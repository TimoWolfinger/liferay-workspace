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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.medikamente;
import de.timowolfinger.liferay.beeInformationSystem.model.medikamenteModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the medikamente service. Represents a row in the &quot;medikamente&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>medikamenteModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link medikamenteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see medikamenteImpl
 * @generated
 */
public class medikamenteModelImpl
	extends BaseModelImpl<medikamente> implements medikamenteModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medikamente model instance should use the <code>medikamente</code> interface instead.
	 */
	public static final String TABLE_NAME = "medikamente";

	public static final Object[][] TABLE_COLUMNS = {
		{"medikamente_id", Types.BIGINT}, {"name", Types.VARCHAR},
		{"hersteller_id", Types.BIGINT}, {"dosierung", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("medikamente_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hersteller_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dosierung", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table medikamente (medikamente_id LONG not null primary key,name VARCHAR(75) null,hersteller_id LONG,dosierung VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table medikamente";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medikamente.medikamente_id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY medikamente.medikamente_id ASC";

	public static final String DATA_SOURCE = "extDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MEDIKAMENTE_ID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public medikamenteModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medikamente_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedikamente_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medikamente_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return medikamente.class;
	}

	@Override
	public String getModelClassName() {
		return medikamente.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<medikamente, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<medikamente, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<medikamente, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((medikamente)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<medikamente, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<medikamente, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(medikamente)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<medikamente, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<medikamente, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<medikamente, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<medikamente, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<medikamente, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<medikamente, Object>>();
		Map<String, BiConsumer<medikamente, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<medikamente, ?>>();

		attributeGetterFunctions.put(
			"medikamente_id", medikamente::getMedikamente_id);
		attributeSetterBiConsumers.put(
			"medikamente_id",
			(BiConsumer<medikamente, Long>)medikamente::setMedikamente_id);
		attributeGetterFunctions.put("name", medikamente::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<medikamente, String>)medikamente::setName);
		attributeGetterFunctions.put(
			"hersteller_id", medikamente::getHersteller_id);
		attributeSetterBiConsumers.put(
			"hersteller_id",
			(BiConsumer<medikamente, Long>)medikamente::setHersteller_id);
		attributeGetterFunctions.put("dosierung", medikamente::getDosierung);
		attributeSetterBiConsumers.put(
			"dosierung",
			(BiConsumer<medikamente, String>)medikamente::setDosierung);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getMedikamente_id() {
		return _medikamente_id;
	}

	@Override
	public void setMedikamente_id(long medikamente_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medikamente_id = medikamente_id;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@Override
	public long getHersteller_id() {
		return _hersteller_id;
	}

	@Override
	public void setHersteller_id(long hersteller_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hersteller_id = hersteller_id;
	}

	@Override
	public String getDosierung() {
		if (_dosierung == null) {
			return "";
		}
		else {
			return _dosierung;
		}
	}

	@Override
	public void setDosierung(String dosierung) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dosierung = dosierung;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, medikamente.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public medikamente toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, medikamente>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		medikamenteImpl medikamenteImpl = new medikamenteImpl();

		medikamenteImpl.setMedikamente_id(getMedikamente_id());
		medikamenteImpl.setName(getName());
		medikamenteImpl.setHersteller_id(getHersteller_id());
		medikamenteImpl.setDosierung(getDosierung());

		medikamenteImpl.resetOriginalValues();

		return medikamenteImpl;
	}

	@Override
	public medikamente cloneWithOriginalValues() {
		medikamenteImpl medikamenteImpl = new medikamenteImpl();

		medikamenteImpl.setMedikamente_id(
			this.<Long>getColumnOriginalValue("medikamente_id"));
		medikamenteImpl.setName(this.<String>getColumnOriginalValue("name"));
		medikamenteImpl.setHersteller_id(
			this.<Long>getColumnOriginalValue("hersteller_id"));
		medikamenteImpl.setDosierung(
			this.<String>getColumnOriginalValue("dosierung"));

		return medikamenteImpl;
	}

	@Override
	public int compareTo(medikamente medikamente) {
		int value = 0;

		if (getMedikamente_id() < medikamente.getMedikamente_id()) {
			value = -1;
		}
		else if (getMedikamente_id() > medikamente.getMedikamente_id()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof medikamente)) {
			return false;
		}

		medikamente medikamente = (medikamente)object;

		long primaryKey = medikamente.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<medikamente> toCacheModel() {
		medikamenteCacheModel medikamenteCacheModel =
			new medikamenteCacheModel();

		medikamenteCacheModel.medikamente_id = getMedikamente_id();

		medikamenteCacheModel.name = getName();

		String name = medikamenteCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			medikamenteCacheModel.name = null;
		}

		medikamenteCacheModel.hersteller_id = getHersteller_id();

		medikamenteCacheModel.dosierung = getDosierung();

		String dosierung = medikamenteCacheModel.dosierung;

		if ((dosierung != null) && (dosierung.length() == 0)) {
			medikamenteCacheModel.dosierung = null;
		}

		return medikamenteCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<medikamente, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<medikamente, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<medikamente, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((medikamente)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<medikamente, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<medikamente, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<medikamente, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((medikamente)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, medikamente>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					medikamente.class, ModelWrapper.class);

	}

	private long _medikamente_id;
	private String _name;
	private long _hersteller_id;
	private String _dosierung;

	public <T> T getColumnValue(String columnName) {
		Function<medikamente, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((medikamente)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("medikamente_id", _medikamente_id);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("hersteller_id", _hersteller_id);
		_columnOriginalValues.put("dosierung", _dosierung);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("medikamente_id", 1L);

		columnBitmasks.put("name", 2L);

		columnBitmasks.put("hersteller_id", 4L);

		columnBitmasks.put("dosierung", 8L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private medikamente _escapedModel;

}