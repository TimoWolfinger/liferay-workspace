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

import de.timowolfinger.liferay.beeInformationSystem.model.Honigernte;
import de.timowolfinger.liferay.beeInformationSystem.service.HonigernteLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.HonigernteLocalServiceUtil;
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
 * Provides the base implementation for the honigernte local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.HonigernteLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.HonigernteLocalServiceImpl
 * @generated
 */
public abstract class HonigernteLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, HonigernteLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HonigernteLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>HonigernteLocalServiceUtil</code>.
	 */

	/**
	 * Adds the honigernte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Honigernte addHonigernte(Honigernte honigernte) {
		honigernte.setNew(true);

		return honigerntePersistence.update(honigernte);
	}

	/**
	 * Creates a new honigernte with the primary key. Does not add the honigernte to the database.
	 *
	 * @param honigernte_id the primary key for the new honigernte
	 * @return the new honigernte
	 */
	@Override
	@Transactional(enabled = false)
	public Honigernte createHonigernte(long honigernte_id) {
		return honigerntePersistence.create(honigernte_id);
	}

	/**
	 * Deletes the honigernte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte that was removed
	 * @throws PortalException if a honigernte with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Honigernte deleteHonigernte(long honigernte_id)
		throws PortalException {

		return honigerntePersistence.remove(honigernte_id);
	}

	/**
	 * Deletes the honigernte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Honigernte deleteHonigernte(Honigernte honigernte) {
		return honigerntePersistence.remove(honigernte);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return honigerntePersistence.dslQuery(dslQuery);
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
			Honigernte.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return honigerntePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
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

		return honigerntePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
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

		return honigerntePersistence.findWithDynamicQuery(
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
		return honigerntePersistence.countWithDynamicQuery(dynamicQuery);
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

		return honigerntePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Honigernte fetchHonigernte(long honigernte_id) {
		return honigerntePersistence.fetchByPrimaryKey(honigernte_id);
	}

	/**
	 * Returns the honigernte with the primary key.
	 *
	 * @param honigernte_id the primary key of the honigernte
	 * @return the honigernte
	 * @throws PortalException if a honigernte with the primary key could not be found
	 */
	@Override
	public Honigernte getHonigernte(long honigernte_id) throws PortalException {
		return honigerntePersistence.findByPrimaryKey(honigernte_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(honigernteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Honigernte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("honigernte_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			honigernteLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Honigernte.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"honigernte_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(honigernteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Honigernte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("honigernte_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return honigerntePersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return honigernteLocalService.deleteHonigernte(
			(Honigernte)persistedModel);
	}

	@Override
	public BasePersistence<Honigernte> getBasePersistence() {
		return honigerntePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return honigerntePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the honigerntes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigernteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of honigerntes
	 * @param end the upper bound of the range of honigerntes (not inclusive)
	 * @return the range of honigerntes
	 */
	@Override
	public List<Honigernte> getHonigerntes(int start, int end) {
		return honigerntePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of honigerntes.
	 *
	 * @return the number of honigerntes
	 */
	@Override
	public int getHonigerntesCount() {
		return honigerntePersistence.countAll();
	}

	/**
	 * Updates the honigernte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HonigernteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param honigernte the honigernte
	 * @return the honigernte that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Honigernte updateHonigernte(Honigernte honigernte) {
		return honigerntePersistence.update(honigernte);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HonigernteLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		honigernteLocalService = (HonigernteLocalService)aopProxy;

		_setLocalServiceUtilService(honigernteLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HonigernteLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Honigernte.class;
	}

	protected String getModelClassName() {
		return Honigernte.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = honigerntePersistence.getDataSource();

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
		HonigernteLocalService honigernteLocalService) {

		try {
			Field field = HonigernteLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, honigernteLocalService);
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

	@Reference
	protected HerstellerPersistence herstellerPersistence;

	protected HonigernteLocalService honigernteLocalService;

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