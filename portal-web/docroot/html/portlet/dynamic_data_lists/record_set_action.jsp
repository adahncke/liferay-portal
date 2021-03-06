<%--
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
--%>

<%@ include file="/html/portlet/dynamic_data_lists/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

String redirect = searchContainer.getIteratorURL().toString();

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

DDLRecordSet recordSet = (DDLRecordSet)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%= DDLRecordSetPermission.contains(permissionChecker, recordSet, ActionKeys.VIEW) %>">
		<portlet:renderURL var="viewRecordSetURL">
			<portlet:param name="struts_action" value="/dynamic_data_lists/view_record_set" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.VIEW %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="recordSetId" value="<%= String.valueOf(recordSet.getRecordSetId()) %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			image="view"
			url="<%= viewRecordSetURL %>"
		/>
	</c:if>

	<c:if test="<%= DDLRecordSetPermission.contains(permissionChecker, recordSet, ActionKeys.VIEW) %>">
		<portlet:renderURL var="viewRecordSetURL">
			<portlet:param name="struts_action" value="/dynamic_data_lists/view_record_set" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.VIEW %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="recordSetId" value="<%= String.valueOf(recordSet.getRecordSetId()) %>" />
			<portlet:param name="spreadsheet" value="true" />
		</portlet:renderURL>

		<liferay-ui:icon
			image="view_tasks"
			message="spreadsheet-view"
			url="<%= viewRecordSetURL %>"
		/>
	</c:if>

	<c:if test="<%= DDLRecordSetPermission.contains(permissionChecker, recordSet, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editRecordSetURL">
			<portlet:param name="struts_action" value="/dynamic_data_lists/edit_record_set" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.UPDATE %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="recordSetId" value="<%= String.valueOf(recordSet.getRecordSetId()) %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			image="edit"
			url="<%= editRecordSetURL %>"
		/>
	</c:if>

	<c:if test="<%= DDLRecordSetPermission.contains(permissionChecker, recordSet, ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= DDLRecordSet.class.getName() %>"
			modelResourceDescription="<%= recordSet.getName(locale) %>"
			resourcePrimKey="<%= String.valueOf(recordSet.getRecordSetId()) %>"
			var="permissionsRecordSetURL"
		/>

		<liferay-ui:icon
			image="permissions"
			url="<%= permissionsRecordSetURL %>"
		/>
	</c:if>

	<c:if test="<%= DDLRecordSetPermission.contains(permissionChecker, recordSet, ActionKeys.DELETE) %>">
		<portlet:actionURL var="deleteRecordSetURL">
			<portlet:param name="struts_action" value="/dynamic_data_lists/edit_record_set" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="recordSetId" value="<%= String.valueOf(recordSet.getRecordSetId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%= deleteRecordSetURL %>" />
	</c:if>
</liferay-ui:icon-menu>