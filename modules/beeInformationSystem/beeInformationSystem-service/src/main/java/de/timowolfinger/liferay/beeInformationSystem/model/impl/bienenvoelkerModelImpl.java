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

import de.timowolfinger.liferay.beeInformationSystem.model.bienenvoelker;
import de.timowolfinger.liferay.beeInformationSystem.model.bienenvoelkerModel;

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
 * The base model implementation for the bienenvoelker service. Represents a row in the &quot;bienenvoelker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>bienenvoelkerModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link bienenvoelkerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bienenvoelkerImpl
 * @generated
 */
@JSON(strict = true)
public class bienenvoelkerModelImpl
	extends BaseModelImpl<bienenvoelker> implements bienenvoelkerModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bienenvoelker model instance should use the <code>bienenvoelker</code> interface instead.
	 */
	public static final String TABLE_NAME = "bienenvoelker";

	public static final Object[][] TABLE_COLUMNS = {
		{"bienenvoelker_id", Types.BIGINT}, {"bezeichnung", Types.VARCHAR},
		{"weisel_jahr", Types.BIGINT}, {"bemerkungen", Types.VARCHAR},
		{"muttervolk", Types.BIGINT}, {"bienenrasse_id", Types.BIGINT},
		{"beutemass_id", Types.BIGINT}, {"geo_coordinaten", Types.VARCHAR},
		{"anschaffung_ableger_jahr", Types.INTEGER}, {"aktiv", Types.BOOLEAN},
		{"aufloesung_tod_jahr", Types.INTEGER},
		{"gesundheitszeugnis_id", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("bienenvoelker_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bezeichnung", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("weisel_jahr", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bemerkungen", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("muttervolk", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bienenrasse_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("beutemass_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("geo_coordinaten", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("anschaffung_ableger_jahr", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("aktiv", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("aufloesung_tod_jahr", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("gesundheitszeugnis_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table bienenvoelker (bienenvoelker_id LONG not null primary key,bezeichnung VARCHAR(75) null,weisel_jahr LONG,bemerkungen VARCHAR(75) null,muttervolk LONG,bienenrasse_id LONG,beutemass_id LONG,geo_coordinaten VARCHAR(75) null,anschaffung_ableger_jahr INTEGER,aktiv BOOLEAN,aufloesung_tod_jahr INTEGER,gesundheitszeugnis_id LONG)";

	public static final String TABLE_SQL_DROP = "drop table bienenvoelker";

	public static final String ORDER_BY_JPQL =
		" ORDER BY bienenvoelker.bienenvoelker_id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY bienenvoelker.bienenvoelker_id ASC";

	public static final String DATA_SOURCE = "extDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BIENENVOELKER_ID_COLUMN_BITMASK = 1L;

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

	public bienenvoelkerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bienenvoelker_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBienenvoelker_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bienenvoelker_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return bienenvoelker.class;
	}

	@Override
	public String getModelClassName() {
		return bienenvoelker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<bienenvoelker, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<bienenvoelker, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<bienenvoelker, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((bienenvoelker)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<bienenvoelker, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<bienenvoelker, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(bienenvoelker)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<bienenvoelker, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<bienenvoelker, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<bienenvoelker, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<bienenvoelker, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<bienenvoelker, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<bienenvoelker, Object>>();
		Map<String, BiConsumer<bienenvoelker, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<bienenvoelker, ?>>();

		attributeGetterFunctions.put(
			"bienenvoelker_id", bienenvoelker::getBienenvoelker_id);
		attributeSetterBiConsumers.put(
			"bienenvoelker_id",
			(BiConsumer<bienenvoelker, Long>)
				bienenvoelker::setBienenvoelker_id);
		attributeGetterFunctions.put(
			"bezeichnung", bienenvoelker::getBezeichnung);
		attributeSetterBiConsumers.put(
			"bezeichnung",
			(BiConsumer<bienenvoelker, String>)bienenvoelker::setBezeichnung);
		attributeGetterFunctions.put(
			"weisel_jahr", bienenvoelker::getWeisel_jahr);
		attributeSetterBiConsumers.put(
			"weisel_jahr",
			(BiConsumer<bienenvoelker, Long>)bienenvoelker::setWeisel_jahr);
		attributeGetterFunctions.put(
			"bemerkungen", bienenvoelker::getBemerkungen);
		attributeSetterBiConsumers.put(
			"bemerkungen",
			(BiConsumer<bienenvoelker, String>)bienenvoelker::setBemerkungen);
		attributeGetterFunctions.put(
			"bienenvoelker_id", bienenvoelker::getBienenvoelker_id);
		attributeSetterBiConsumers.put(
			"bienenvoelker_id",
			(BiConsumer<bienenvoelker, Long>)
				bienenvoelker::setBienenvoelker_id);
		attributeGetterFunctions.put(
			"bienenrasse_id", bienenvoelker::getBienenrasse_id);
		attributeSetterBiConsumers.put(
			"bienenrasse_id",
			(BiConsumer<bienenvoelker, Long>)bienenvoelker::setBienenrasse_id);
		attributeGetterFunctions.put(
			"beutemass_id", bienenvoelker::getBeutemass_id);
		attributeSetterBiConsumers.put(
			"beutemass_id",
			(BiConsumer<bienenvoelker, Long>)bienenvoelker::setBeutemass_id);
		attributeGetterFunctions.put(
			"geo_coordinaten", bienenvoelker::getGeo_coordinaten);
		attributeSetterBiConsumers.put(
			"geo_coordinaten",
			(BiConsumer<bienenvoelker, String>)
				bienenvoelker::setGeo_coordinaten);
		attributeGetterFunctions.put(
			"anschaffung_ableger_jahr",
			bienenvoelker::getAnschaffung_ableger_jahr);
		attributeSetterBiConsumers.put(
			"anschaffung_ableger_jahr",
			(BiConsumer<bienenvoelker, Integer>)
				bienenvoelker::setAnschaffung_ableger_jahr);
		attributeGetterFunctions.put("aktiv", bienenvoelker::getAktiv);
		attributeSetterBiConsumers.put(
			"aktiv",
			(BiConsumer<bienenvoelker, Boolean>)bienenvoelker::setAktiv);
		attributeGetterFunctions.put(
			"aufloesung_tod_jahr", bienenvoelker::getAufloesung_tod_jahr);
		attributeSetterBiConsumers.put(
			"aufloesung_tod_jahr",
			(BiConsumer<bienenvoelker, Integer>)
				bienenvoelker::setAufloesung_tod_jahr);
		attributeGetterFunctions.put(
			"gesundheitszeugnis_id", bienenvoelker::getGesundheitszeugnis_id);
		attributeSetterBiConsumers.put(
			"gesundheitszeugnis_id",
			(BiConsumer<bienenvoelker, Long>)
				bienenvoelker::setGesundheitszeugnis_id);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getBienenvoelker_id() {
		return _bienenvoelker_id;
	}

	@Override
	public void setBienenvoelker_id(long bienenvoelker_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bienenvoelker_id = bienenvoelker_id;
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
	public long getWeisel_jahr() {
		return _weisel_jahr;
	}

	@Override
	public void setWeisel_jahr(long weisel_jahr) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_weisel_jahr = weisel_jahr;
	}

	@JSON
	@Override
	public String getBemerkungen() {
		if (_bemerkungen == null) {
			return "";
		}
		else {
			return _bemerkungen;
		}
	}

	@Override
	public void setBemerkungen(String bemerkungen) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bemerkungen = bemerkungen;
	}

	@JSON
	@Override
	public long getBienenvoelker_id() {
		return _bienenvoelker_id;
	}

	@Override
	public void setBienenvoelker_id(long bienenvoelker_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bienenvoelker_id = bienenvoelker_id;
	}

	@JSON
	@Override
	public long getBienenrasse_id() {
		return _bienenrasse_id;
	}

	@Override
	public void setBienenrasse_id(long bienenrasse_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bienenrasse_id = bienenrasse_id;
	}

	@JSON
	@Override
	public long getBeutemass_id() {
		return _beutemass_id;
	}

	@Override
	public void setBeutemass_id(long beutemass_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_beutemass_id = beutemass_id;
	}

	@JSON
	@Override
	public String getGeo_coordinaten() {
		if (_geo_coordinaten == null) {
			return "";
		}
		else {
			return _geo_coordinaten;
		}
	}

	@Override
	public void setGeo_coordinaten(String geo_coordinaten) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_geo_coordinaten = geo_coordinaten;
	}

	@JSON
	@Override
	public int getAnschaffung_ableger_jahr() {
		return _anschaffung_ableger_jahr;
	}

	@Override
	public void setAnschaffung_ableger_jahr(int anschaffung_ableger_jahr) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_anschaffung_ableger_jahr = anschaffung_ableger_jahr;
	}

	@JSON
	@Override
	public Boolean getAktiv() {
		return _aktiv;
	}

	@Override
	public void setAktiv(Boolean aktiv) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_aktiv = aktiv;
	}

	@JSON
	@Override
	public int getAufloesung_tod_jahr() {
		return _aufloesung_tod_jahr;
	}

	@Override
	public void setAufloesung_tod_jahr(int aufloesung_tod_jahr) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_aufloesung_tod_jahr = aufloesung_tod_jahr;
	}

	@JSON
	@Override
	public long getGesundheitszeugnis_id() {
		return _gesundheitszeugnis_id;
	}

	@Override
	public void setGesundheitszeugnis_id(long gesundheitszeugnis_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_gesundheitszeugnis_id = gesundheitszeugnis_id;
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
			0, bienenvoelker.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public bienenvoelker toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, bienenvoelker>
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
		bienenvoelkerImpl bienenvoelkerImpl = new bienenvoelkerImpl();

		bienenvoelkerImpl.setBienenvoelker_id(getBienenvoelker_id());
		bienenvoelkerImpl.setBezeichnung(getBezeichnung());
		bienenvoelkerImpl.setWeisel_jahr(getWeisel_jahr());
		bienenvoelkerImpl.setBemerkungen(getBemerkungen());
		bienenvoelkerImpl.setBienenvoelker_id(getBienenvoelker_id());
		bienenvoelkerImpl.setBienenrasse_id(getBienenrasse_id());
		bienenvoelkerImpl.setBeutemass_id(getBeutemass_id());
		bienenvoelkerImpl.setGeo_coordinaten(getGeo_coordinaten());
		bienenvoelkerImpl.setAnschaffung_ableger_jahr(
			getAnschaffung_ableger_jahr());
		bienenvoelkerImpl.setAktiv(getAktiv());
		bienenvoelkerImpl.setAufloesung_tod_jahr(getAufloesung_tod_jahr());
		bienenvoelkerImpl.setGesundheitszeugnis_id(getGesundheitszeugnis_id());

		bienenvoelkerImpl.resetOriginalValues();

		return bienenvoelkerImpl;
	}

	@Override
	public bienenvoelker cloneWithOriginalValues() {
		bienenvoelkerImpl bienenvoelkerImpl = new bienenvoelkerImpl();

		bienenvoelkerImpl.setBienenvoelker_id(
			this.<Long>getColumnOriginalValue("bienenvoelker_id"));
		bienenvoelkerImpl.setBezeichnung(
			this.<String>getColumnOriginalValue("bezeichnung"));
		bienenvoelkerImpl.setWeisel_jahr(
			this.<Long>getColumnOriginalValue("weisel_jahr"));
		bienenvoelkerImpl.setBemerkungen(
			this.<String>getColumnOriginalValue("bemerkungen"));
		bienenvoelkerImpl.setBienenvoelker_id(
			this.<Long>getColumnOriginalValue("muttervolk"));
		bienenvoelkerImpl.setBienenrasse_id(
			this.<Long>getColumnOriginalValue("bienenrasse_id"));
		bienenvoelkerImpl.setBeutemass_id(
			this.<Long>getColumnOriginalValue("beutemass_id"));
		bienenvoelkerImpl.setGeo_coordinaten(
			this.<String>getColumnOriginalValue("geo_coordinaten"));
		bienenvoelkerImpl.setAnschaffung_ableger_jahr(
			this.<Integer>getColumnOriginalValue("anschaffung_ableger_jahr"));
		bienenvoelkerImpl.setAktiv(
			this.<Boolean>getColumnOriginalValue("aktiv"));
		bienenvoelkerImpl.setAufloesung_tod_jahr(
			this.<Integer>getColumnOriginalValue("aufloesung_tod_jahr"));
		bienenvoelkerImpl.setGesundheitszeugnis_id(
			this.<Long>getColumnOriginalValue("gesundheitszeugnis_id"));

		return bienenvoelkerImpl;
	}

	@Override
	public int compareTo(bienenvoelker bienenvoelker) {
		int value = 0;

		if (getBienenvoelker_id() < bienenvoelker.getBienenvoelker_id()) {
			value = -1;
		}
		else if (getBienenvoelker_id() > bienenvoelker.getBienenvoelker_id()) {
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

		if (!(object instanceof bienenvoelker)) {
			return false;
		}

		bienenvoelker bienenvoelker = (bienenvoelker)object;

		long primaryKey = bienenvoelker.getPrimaryKey();

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
	public CacheModel<bienenvoelker> toCacheModel() {
		bienenvoelkerCacheModel bienenvoelkerCacheModel =
			new bienenvoelkerCacheModel();

		bienenvoelkerCacheModel.bienenvoelker_id = getBienenvoelker_id();

		bienenvoelkerCacheModel.bezeichnung = getBezeichnung();

		String bezeichnung = bienenvoelkerCacheModel.bezeichnung;

		if ((bezeichnung != null) && (bezeichnung.length() == 0)) {
			bienenvoelkerCacheModel.bezeichnung = null;
		}

		bienenvoelkerCacheModel.weisel_jahr = getWeisel_jahr();

		bienenvoelkerCacheModel.bemerkungen = getBemerkungen();

		String bemerkungen = bienenvoelkerCacheModel.bemerkungen;

		if ((bemerkungen != null) && (bemerkungen.length() == 0)) {
			bienenvoelkerCacheModel.bemerkungen = null;
		}

		bienenvoelkerCacheModel.bienenvoelker_id = getBienenvoelker_id();

		bienenvoelkerCacheModel.bienenrasse_id = getBienenrasse_id();

		bienenvoelkerCacheModel.beutemass_id = getBeutemass_id();

		bienenvoelkerCacheModel.geo_coordinaten = getGeo_coordinaten();

		String geo_coordinaten = bienenvoelkerCacheModel.geo_coordinaten;

		if ((geo_coordinaten != null) && (geo_coordinaten.length() == 0)) {
			bienenvoelkerCacheModel.geo_coordinaten = null;
		}

		bienenvoelkerCacheModel.anschaffung_ableger_jahr =
			getAnschaffung_ableger_jahr();

		Boolean aktiv = getAktiv();

		if (aktiv != null) {
			bienenvoelkerCacheModel.aktiv = aktiv;
		}

		bienenvoelkerCacheModel.aufloesung_tod_jahr = getAufloesung_tod_jahr();

		bienenvoelkerCacheModel.gesundheitszeugnis_id =
			getGesundheitszeugnis_id();

		return bienenvoelkerCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<bienenvoelker, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<bienenvoelker, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<bienenvoelker, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((bienenvoelker)this);

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
		Map<String, Function<bienenvoelker, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<bienenvoelker, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<bienenvoelker, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((bienenvoelker)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, bienenvoelker>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					bienenvoelker.class, ModelWrapper.class);

	}

	private long _bienenvoelker_id;
	private String _bezeichnung;
	private long _weisel_jahr;
	private String _bemerkungen;
	private long _bienenvoelker_id;
	private long _bienenrasse_id;
	private long _beutemass_id;
	private String _geo_coordinaten;
	private int _anschaffung_ableger_jahr;
	private Boolean _aktiv;
	private int _aufloesung_tod_jahr;
	private long _gesundheitszeugnis_id;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<bienenvoelker, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((bienenvoelker)this);
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

		_columnOriginalValues.put("bienenvoelker_id", _bienenvoelker_id);
		_columnOriginalValues.put("bezeichnung", _bezeichnung);
		_columnOriginalValues.put("weisel_jahr", _weisel_jahr);
		_columnOriginalValues.put("bemerkungen", _bemerkungen);
		_columnOriginalValues.put("muttervolk", _bienenvoelker_id);
		_columnOriginalValues.put("bienenrasse_id", _bienenrasse_id);
		_columnOriginalValues.put("beutemass_id", _beutemass_id);
		_columnOriginalValues.put("geo_coordinaten", _geo_coordinaten);
		_columnOriginalValues.put(
			"anschaffung_ableger_jahr", _anschaffung_ableger_jahr);
		_columnOriginalValues.put("aktiv", _aktiv);
		_columnOriginalValues.put("aufloesung_tod_jahr", _aufloesung_tod_jahr);
		_columnOriginalValues.put(
			"gesundheitszeugnis_id", _gesundheitszeugnis_id);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("muttervolk", "bienenvoelker_id");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("bienenvoelker_id", 1L);

		columnBitmasks.put("bezeichnung", 2L);

		columnBitmasks.put("weisel_jahr", 4L);

		columnBitmasks.put("bemerkungen", 8L);

		columnBitmasks.put("muttervolk", 16L);

		columnBitmasks.put("bienenrasse_id", 32L);

		columnBitmasks.put("beutemass_id", 64L);

		columnBitmasks.put("geo_coordinaten", 128L);

		columnBitmasks.put("anschaffung_ableger_jahr", 256L);

		columnBitmasks.put("aktiv", 512L);

		columnBitmasks.put("aufloesung_tod_jahr", 1024L);

		columnBitmasks.put("gesundheitszeugnis_id", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private bienenvoelker _escapedModel;

}