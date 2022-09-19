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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.ableger;
import de.timowolfinger.liferay.beeInformationSystem.model.ablegerModel;

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
 * The base model implementation for the ableger service. Represents a row in the &quot;ableger&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ablegerModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ablegerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ablegerImpl
 * @generated
 */
@JSON(strict = true)
public class ablegerModelImpl
	extends BaseModelImpl<ableger> implements ablegerModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ableger model instance should use the <code>ableger</code> interface instead.
	 */
	public static final String TABLE_NAME = "ableger";

	public static final Object[][] TABLE_COLUMNS = {
		{"ableger_id", Types.BIGINT}, {"bezeichnung", Types.VARCHAR},
		{"datum_ablegerbildung", Types.TIMESTAMP},
		{"muttervolk_id", Types.BIGINT}, {"erfolgreich", Types.BOOLEAN},
		{"abgeschlossen", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ableger_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bezeichnung", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("datum_ablegerbildung", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("muttervolk_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("erfolgreich", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("abgeschlossen", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ableger (ableger_id LONG not null primary key,bezeichnung VARCHAR(75) null,datum_ablegerbildung DATE null,muttervolk_id LONG,erfolgreich BOOLEAN,abgeschlossen BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table ableger";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ableger.ableger_id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ableger.ableger_id ASC";

	public static final String DATA_SOURCE = "extDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ABLEGER_ID_COLUMN_BITMASK = 1L;

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

	public ablegerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ableger_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAbleger_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ableger_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ableger.class;
	}

	@Override
	public String getModelClassName() {
		return ableger.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<ableger, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<ableger, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ableger, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((ableger)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<ableger, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<ableger, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(ableger)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<ableger, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<ableger, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<ableger, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<ableger, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<ableger, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<ableger, Object>>();
		Map<String, BiConsumer<ableger, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<ableger, ?>>();

		attributeGetterFunctions.put("ableger_id", ableger::getAbleger_id);
		attributeSetterBiConsumers.put(
			"ableger_id", (BiConsumer<ableger, Long>)ableger::setAbleger_id);
		attributeGetterFunctions.put("bezeichnung", ableger::getBezeichnung);
		attributeSetterBiConsumers.put(
			"bezeichnung",
			(BiConsumer<ableger, String>)ableger::setBezeichnung);
		attributeGetterFunctions.put(
			"datum_ablegerbildung", ableger::getDatum_ablegerbildung);
		attributeSetterBiConsumers.put(
			"datum_ablegerbildung",
			(BiConsumer<ableger, Date>)ableger::setDatum_ablegerbildung);
		attributeGetterFunctions.put("bienen_id", ableger::getBienen_id);
		attributeSetterBiConsumers.put(
			"bienen_id", (BiConsumer<ableger, Long>)ableger::setBienen_id);
		attributeGetterFunctions.put("erfolgreich", ableger::getErfolgreich);
		attributeSetterBiConsumers.put(
			"erfolgreich",
			(BiConsumer<ableger, Boolean>)ableger::setErfolgreich);
		attributeGetterFunctions.put(
			"abgeschlossen", ableger::getAbgeschlossen);
		attributeSetterBiConsumers.put(
			"abgeschlossen",
			(BiConsumer<ableger, Boolean>)ableger::setAbgeschlossen);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getAbleger_id() {
		return _ableger_id;
	}

	@Override
	public void setAbleger_id(long ableger_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ableger_id = ableger_id;
	}

	@JSON
	@Override
	public String getBezeichnung() {
		if (_bezeichnung == null) {
			return "";
		}
		else {
			return _bezeichnung;
		}
	}

	@Override
	public void setBezeichnung(String bezeichnung) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bezeichnung = bezeichnung;
	}

	@JSON
	@Override
	public Date getDatum_ablegerbildung() {
		return _datum_ablegerbildung;
	}

	@Override
	public void setDatum_ablegerbildung(Date datum_ablegerbildung) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_datum_ablegerbildung = datum_ablegerbildung;
	}

	@JSON
	@Override
	public long getBienen_id() {
		return _bienen_id;
	}

	@Override
	public void setBienen_id(long bienen_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bienen_id = bienen_id;
	}

	@JSON
	@Override
	public Boolean getErfolgreich() {
		return _erfolgreich;
	}

	@Override
	public void setErfolgreich(Boolean erfolgreich) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_erfolgreich = erfolgreich;
	}

	@JSON
	@Override
	public Boolean getAbgeschlossen() {
		return _abgeschlossen;
	}

	@Override
	public void setAbgeschlossen(Boolean abgeschlossen) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_abgeschlossen = abgeschlossen;
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
			0, ableger.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ableger toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, ableger>
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
		ablegerImpl ablegerImpl = new ablegerImpl();

		ablegerImpl.setAbleger_id(getAbleger_id());
		ablegerImpl.setBezeichnung(getBezeichnung());
		ablegerImpl.setDatum_ablegerbildung(getDatum_ablegerbildung());
		ablegerImpl.setBienen_id(getBienen_id());
		ablegerImpl.setErfolgreich(getErfolgreich());
		ablegerImpl.setAbgeschlossen(getAbgeschlossen());

		ablegerImpl.resetOriginalValues();

		return ablegerImpl;
	}

	@Override
	public ableger cloneWithOriginalValues() {
		ablegerImpl ablegerImpl = new ablegerImpl();

		ablegerImpl.setAbleger_id(
			this.<Long>getColumnOriginalValue("ableger_id"));
		ablegerImpl.setBezeichnung(
			this.<String>getColumnOriginalValue("bezeichnung"));
		ablegerImpl.setDatum_ablegerbildung(
			this.<Date>getColumnOriginalValue("datum_ablegerbildung"));
		ablegerImpl.setBienen_id(
			this.<Long>getColumnOriginalValue("muttervolk_id"));
		ablegerImpl.setErfolgreich(
			this.<Boolean>getColumnOriginalValue("erfolgreich"));
		ablegerImpl.setAbgeschlossen(
			this.<Boolean>getColumnOriginalValue("abgeschlossen"));

		return ablegerImpl;
	}

	@Override
	public int compareTo(ableger ableger) {
		int value = 0;

		if (getAbleger_id() < ableger.getAbleger_id()) {
			value = -1;
		}
		else if (getAbleger_id() > ableger.getAbleger_id()) {
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

		if (!(object instanceof ableger)) {
			return false;
		}

		ableger ableger = (ableger)object;

		long primaryKey = ableger.getPrimaryKey();

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
	public CacheModel<ableger> toCacheModel() {
		ablegerCacheModel ablegerCacheModel = new ablegerCacheModel();

		ablegerCacheModel.ableger_id = getAbleger_id();

		ablegerCacheModel.bezeichnung = getBezeichnung();

		String bezeichnung = ablegerCacheModel.bezeichnung;

		if ((bezeichnung != null) && (bezeichnung.length() == 0)) {
			ablegerCacheModel.bezeichnung = null;
		}

		Date datum_ablegerbildung = getDatum_ablegerbildung();

		if (datum_ablegerbildung != null) {
			ablegerCacheModel.datum_ablegerbildung =
				datum_ablegerbildung.getTime();
		}
		else {
			ablegerCacheModel.datum_ablegerbildung = Long.MIN_VALUE;
		}

		ablegerCacheModel.bienen_id = getBienen_id();

		Boolean erfolgreich = getErfolgreich();

		if (erfolgreich != null) {
			ablegerCacheModel.erfolgreich = erfolgreich;
		}

		Boolean abgeschlossen = getAbgeschlossen();

		if (abgeschlossen != null) {
			ablegerCacheModel.abgeschlossen = abgeschlossen;
		}

		return ablegerCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<ableger, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<ableger, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ableger, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((ableger)this);

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
		Map<String, Function<ableger, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<ableger, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ableger, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((ableger)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, ableger>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					ableger.class, ModelWrapper.class);

	}

	private long _ableger_id;
	private String _bezeichnung;
	private Date _datum_ablegerbildung;
	private long _bienen_id;
	private Boolean _erfolgreich;
	private Boolean _abgeschlossen;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<ableger, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((ableger)this);
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

		_columnOriginalValues.put("ableger_id", _ableger_id);
		_columnOriginalValues.put("bezeichnung", _bezeichnung);
		_columnOriginalValues.put(
			"datum_ablegerbildung", _datum_ablegerbildung);
		_columnOriginalValues.put("muttervolk_id", _bienen_id);
		_columnOriginalValues.put("erfolgreich", _erfolgreich);
		_columnOriginalValues.put("abgeschlossen", _abgeschlossen);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("muttervolk_id", "bienen_id");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ableger_id", 1L);

		columnBitmasks.put("bezeichnung", 2L);

		columnBitmasks.put("datum_ablegerbildung", 4L);

		columnBitmasks.put("muttervolk_id", 8L);

		columnBitmasks.put("erfolgreich", 16L);

		columnBitmasks.put("abgeschlossen", 32L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private ableger _escapedModel;

}