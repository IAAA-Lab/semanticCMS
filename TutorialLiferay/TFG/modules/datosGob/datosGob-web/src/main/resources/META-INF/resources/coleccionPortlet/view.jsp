<%@ include file="../init.jsp"%>


<%
	String coleccionId = String.valueOf((String) renderRequest.getAttribute("coleccionId"));
%>

<p>
	<b><liferay-ui:message key="datosgob.caption" /></b>
</p>
<%
	out.print(coleccionId);
%>



<liferay-ui:search-container
	total="<%=DatasetLocalServiceUtil.getDatasetsCount(scopeGroupId.longValue(), coleccionId)%>">
	<liferay-ui:search-container-results
		results="<%=DatasetLocalServiceUtil.getDatasets(scopeGroupId.longValue(), coleccionId,
						searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.liferay.docs.datosGob.model.Dataset" modelVar="dataset">

		<liferay-ui:search-container-column-text value="<%=TituloLocalServiceUtil.getTitulos(scopeGroupId.longValue(), dataset.getDatasetId()).get(0).getTitulo()%>" />

		<liferay-ui:search-container-column-jsp
			path="/coleccionPortlet/view_action.jsp" align="right" />




	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>