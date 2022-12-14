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

package de.timowolfinger.liferay.beeInformationSystem.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.Hersteller;
import de.timowolfinger.liferay.beeInformationSystem.service.HerstellerLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.HerstellerLocalServiceUtil;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.AblegerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BehandlungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BeutemassPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenrassePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.BienenvolkPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuetterungPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.FuttermittelPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.GesundheitszeugnisPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HerstellerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.HonigerntePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.MedikamentPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.TrachtPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.VoelkerentwicklungPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the hersteller local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.HerstellerLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.HerstellerLocalServiceImpl
 * @generated
 */
public abstract class HerstellerLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, HerstellerLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HerstellerLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>HerstellerLocalServiceUtil</code>.
	 */

	/**
	 * Adds the hersteller to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Hersteller addHersteller(Hersteller hersteller) {
		hersteller.setNew(true);

		return herstellerPersistence.update(hersteller);
	}

	/**
	 * Creates a new hersteller with the primary key. Does not add the hersteller to the database.
	 *
	 * @param hersteller_id the primary key for the new hersteller
	 * @return the new hersteller
	 */
	@Override
	@Transactional(enabled = false)
	public Hersteller createHersteller(long hersteller_id) {
		return herstellerPersistence.create(hersteller_id);
	}

	/**
	 * Deletes the hersteller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller that was removed
	 * @throws PortalException if a hersteller with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Hersteller deleteHersteller(long hersteller_id)
		throws PortalException {

		return herstellerPersistence.remove(hersteller_id);
	}

	/**
	 * Deletes the hersteller from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Hersteller deleteHersteller(Hersteller hersteller) {
		return herstellerPersistence.remove(hersteller);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return herstellerPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Hersteller.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return herstellerPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return herstellerPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return herstellerPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return herstellerPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return herstellerPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Hersteller fetchHersteller(long hersteller_id) {
		return herstellerPersistence.fetchByPrimaryKey(hersteller_id);
	}

	/**
	 * Returns the hersteller with the primary key.
	 *
	 * @param hersteller_id the primary key of the hersteller
	 * @return the hersteller
	 * @throws PortalException if a hersteller with the primary key could not be found
	 */
	@Override
	public Hersteller getHersteller(long hersteller_id) throws PortalException {
		return herstellerPersistence.findByPrimaryKey(hersteller_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(herstellerLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Hersteller.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("hersteller_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			herstellerLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Hersteller.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"hersteller_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(herstellerLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Hersteller.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("hersteller_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return herstellerPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return herstellerLocalService.deleteHersteller(
			(Hersteller)persistedModel);
	}

	@Override
	public BasePersistence<Hersteller> getBasePersistence() {
		return herstellerPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return herstellerPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the herstellers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HerstellerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of herstellers
	 * @param end the upper bound of the range of herstellers (not inclusive)
	 * @return the range of herstellers
	 */
	@Override
	public List<Hersteller> getHerstellers(int start, int end) {
		return herstellerPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of herstellers.
	 *
	 * @return the number of herstellers
	 */
	@Override
	public int getHerstellersCount() {
		return herstellerPersistence.countAll();
	}

	/**
	 * Updates the hersteller in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HerstellerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hersteller the hersteller
	 * @return the hersteller that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Hersteller updateHersteller(Hersteller hersteller) {
		return herstellerPersistence.update(hersteller);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HerstellerLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		herstellerLocalService = (HerstellerLocalService)aopProxy;

		_setLocalServiceUtilService(herstellerLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HerstellerLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Hersteller.class;
	}

	protected String getModelClassName() {
		return Hersteller.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = herstellerPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		HerstellerLocalService herstellerLocalService) {

		try {
			Field field = HerstellerLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, herstellerLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected AblegerPersistence ablegerPersistence;

	@Reference
	protected BehandlungPersistence behandlungPersistence;

	@Reference
	protected BeutemassPersistence beutemassPersistence;

	@Reference
	protected BienenrassePersistence bienenrassePersistence;

	@Reference
	protected BienenvolkPersistence bienenvolkPersistence;

	@Reference
	protected FuetterungPersistence fuetterungPersistence;

	@Reference
	protected FuttermittelPersistence futtermittelPersistence;

	@Reference
	protected GesundheitszeugnisPersistence gesundheitszeugnisPersistence;

	protected HerstellerLocalService herstellerLocalService;

	@Reference
	protected HerstellerPersistence herstellerPersistence;

	@Reference
	protected HonigerntePersistence honigerntePersistence;

	@Reference
	protected MedikamentPersistence medikamentPersistence;

	@Reference
	protected TrachtPersistence trachtPersistence;

	@Reference
	protected VoelkerentwicklungPersistence voelkerentwicklungPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}