<%@include file="../init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Dataset dataset = (Dataset) row.getObject();
%>


<liferay-ui:icon-menu>
	<liferay-portlet:renderURL portletName="Dataset" varImpl="redirectURL">
		<liferay-portlet:param name="jspPage"
			value="/datasetPortlet/view.jsp" />
		<portlet:param name="datasetId"
			value="<%=String.valueOf(dataset.getDatasetId())%>" />
	</liferay-portlet:renderURL>
	<aui:button value="Ver"
		onClick="<%=redirectURL.toString()%>" name="redirectButton" />


</liferay-ui:icon-menu>