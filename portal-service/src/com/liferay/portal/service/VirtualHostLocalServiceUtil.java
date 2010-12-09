/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
 * The utility for the virtual host local service. This utility wraps {@link com.liferay.portal.service.impl.VirtualHostLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VirtualHostLocalService
 * @see com.liferay.portal.service.base.VirtualHostLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.VirtualHostLocalServiceImpl
 * @generated
 */
public class VirtualHostLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.VirtualHostLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the virtual host to the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHost the virtual host to add
	* @return the virtual host that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.VirtualHost addVirtualHost(
		com.liferay.portal.model.VirtualHost virtualHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVirtualHost(virtualHost);
	}

	/**
	* Creates a new virtual host with the primary key. Does not add the virtual host to the database.
	*
	* @param virtualHostId the primary key for the new virtual host
	* @return the new virtual host
	*/
	public static com.liferay.portal.model.VirtualHost createVirtualHost(
		long virtualHostId) {
		return getService().createVirtualHost(virtualHostId);
	}

	/**
	* Deletes the virtual host with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHostId the primary key of the virtual host to delete
	* @throws PortalException if a virtual host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVirtualHost(long virtualHostId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVirtualHost(virtualHostId);
	}

	/**
	* Deletes the virtual host from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHost the virtual host to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVirtualHost(
		com.liferay.portal.model.VirtualHost virtualHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVirtualHost(virtualHost);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
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
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
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
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
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
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the virtual host with the primary key.
	*
	* @param virtualHostId the primary key of the virtual host to get
	* @return the virtual host
	* @throws PortalException if a virtual host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.VirtualHost getVirtualHost(
		long virtualHostId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualHost(virtualHostId);
	}

	/**
	* Gets a range of all the virtual hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of virtual hosts to return
	* @param end the upper bound of the range of virtual hosts to return (not inclusive)
	* @return the range of virtual hosts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.VirtualHost> getVirtualHosts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualHosts(start, end);
	}

	/**
	* Gets the number of virtual hosts.
	*
	* @return the number of virtual hosts
	* @throws SystemException if a system exception occurred
	*/
	public static int getVirtualHostsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualHostsCount();
	}

	/**
	* Updates the virtual host in the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHost the virtual host to update
	* @return the virtual host that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.VirtualHost updateVirtualHost(
		com.liferay.portal.model.VirtualHost virtualHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVirtualHost(virtualHost);
	}

	/**
	* Updates the virtual host in the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHost the virtual host to update
	* @param merge whether to merge the virtual host with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the virtual host that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.VirtualHost updateVirtualHost(
		com.liferay.portal.model.VirtualHost virtualHost, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVirtualHost(virtualHost, merge);
	}

	public static com.liferay.portal.model.VirtualHost addVirtualHost(
		long companyId, long layoutSetId, java.lang.String virtualHostName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addVirtualHost(companyId, layoutSetId, virtualHostName);
	}

	public static com.liferay.portal.model.VirtualHost getVirtualHost(
		long companyId, long layoutSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualHost(companyId, layoutSetId);
	}

	public static com.liferay.portal.model.VirtualHost getVirtualHost(
		java.lang.String virtualHostName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualHost(virtualHostName);
	}

	public static VirtualHostLocalService getService() {
		if (_service == null) {
			_service = (VirtualHostLocalService)PortalBeanLocatorUtil.locate(VirtualHostLocalService.class.getName());

			ReferenceRegistry.registerReference(VirtualHostLocalServiceUtil.class,
				"_service");
			MethodCache.remove(VirtualHostLocalService.class);
		}

		return _service;
	}

	public void setService(VirtualHostLocalService service) {
		MethodCache.remove(VirtualHostLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(VirtualHostLocalServiceUtil.class,
			"_service");
		MethodCache.remove(VirtualHostLocalService.class);
	}

	private static VirtualHostLocalService _service;
}