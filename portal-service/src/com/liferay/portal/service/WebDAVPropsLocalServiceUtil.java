/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the web d a v props local service. This utility wraps {@link com.liferay.portal.service.impl.WebDAVPropsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WebDAVPropsLocalService
 * @see com.liferay.portal.service.base.WebDAVPropsLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.WebDAVPropsLocalServiceImpl
 * @generated
 */
public class WebDAVPropsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.WebDAVPropsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the web d a v props to the database. Also notifies the appropriate model listeners.
	*
	* @param webDAVProps the web d a v props
	* @return the web d a v props that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.WebDAVProps addWebDAVProps(
		com.liferay.portal.model.WebDAVProps webDAVProps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWebDAVProps(webDAVProps);
	}

	/**
	* Creates a new web d a v props with the primary key. Does not add the web d a v props to the database.
	*
	* @param webDavPropsId the primary key for the new web d a v props
	* @return the new web d a v props
	*/
	public static com.liferay.portal.model.WebDAVProps createWebDAVProps(
		long webDavPropsId) {
		return getService().createWebDAVProps(webDavPropsId);
	}

	/**
	* Deletes the web d a v props with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param webDavPropsId the primary key of the web d a v props
	* @throws PortalException if a web d a v props with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteWebDAVProps(long webDavPropsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteWebDAVProps(webDavPropsId);
	}

	/**
	* Deletes the web d a v props from the database. Also notifies the appropriate model listeners.
	*
	* @param webDAVProps the web d a v props
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteWebDAVProps(
		com.liferay.portal.model.WebDAVProps webDAVProps)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteWebDAVProps(webDAVProps);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the web d a v props with the primary key.
	*
	* @param webDavPropsId the primary key of the web d a v props
	* @return the web d a v props
	* @throws PortalException if a web d a v props with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.WebDAVProps getWebDAVProps(
		long webDavPropsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWebDAVProps(webDavPropsId);
	}

	/**
	* Returns a range of all the web d a v propses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of web d a v propses
	* @param end the upper bound of the range of web d a v propses (not inclusive)
	* @return the range of web d a v propses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.WebDAVProps> getWebDAVPropses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWebDAVPropses(start, end);
	}

	/**
	* Returns the number of web d a v propses.
	*
	* @return the number of web d a v propses
	* @throws SystemException if a system exception occurred
	*/
	public static int getWebDAVPropsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWebDAVPropsesCount();
	}

	/**
	* Updates the web d a v props in the database. Also notifies the appropriate model listeners.
	*
	* @param webDAVProps the web d a v props
	* @return the web d a v props that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.WebDAVProps updateWebDAVProps(
		com.liferay.portal.model.WebDAVProps webDAVProps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWebDAVProps(webDAVProps);
	}

	/**
	* Updates the web d a v props in the database. Also notifies the appropriate model listeners.
	*
	* @param webDAVProps the web d a v props
	* @param merge whether to merge the web d a v props with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the web d a v props that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.WebDAVProps updateWebDAVProps(
		com.liferay.portal.model.WebDAVProps webDAVProps, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWebDAVProps(webDAVProps, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static void deleteWebDAVProps(java.lang.String className,
		long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteWebDAVProps(className, classPK);
	}

	public static com.liferay.portal.model.WebDAVProps getWebDAVProps(
		long companyId, java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWebDAVProps(companyId, className, classPK);
	}

	public static void storeWebDAVProps(
		com.liferay.portal.model.WebDAVProps webDavProps)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().storeWebDAVProps(webDavProps);
	}

	public static WebDAVPropsLocalService getService() {
		if (_service == null) {
			_service = (WebDAVPropsLocalService)PortalBeanLocatorUtil.locate(WebDAVPropsLocalService.class.getName());

			ReferenceRegistry.registerReference(WebDAVPropsLocalServiceUtil.class,
				"_service");
			MethodCache.remove(WebDAVPropsLocalService.class);
		}

		return _service;
	}

	public void setService(WebDAVPropsLocalService service) {
		MethodCache.remove(WebDAVPropsLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(WebDAVPropsLocalServiceUtil.class,
			"_service");
		MethodCache.remove(WebDAVPropsLocalService.class);
	}

	private static WebDAVPropsLocalService _service;
}