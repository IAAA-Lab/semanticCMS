<%@ include file="../init.jsp"%>


<%
	String datasetId = String.valueOf((String) renderRequest.getAttribute("datasetId"));
%>

<p>
	<b><liferay-ui:message key="dataset.caption" /></b>
</p>

<%
	out.print(scopeGroupId.longValue()+"\n");
%>

<c:if test="<%=datasetId != "Vacío"%>">
	<dl>
		<dt>DatasetHomepage</dt>
		<dd><%=DatasetLocalServiceUtil.getDataset(datasetId).getHomepage()%></dd>
		<dt>DatasetId</dt>
		<dd><%=datasetId%></dd>

	</dl>

	<liferay-ui:search-container
		total="<%=TituloLocalServiceUtil.getTitulosCount(scopeGroupId.longValue(), datasetId)%>">
		<liferay-ui:search-container-results
			results="<%=TituloLocalServiceUtil.getTitulos(scopeGroupId.longValue(), datasetId,
							searchContainer.getStart(), searchContainer.getEnd())%>" />

		<liferay-ui:search-container-row
			className="com.liferay.docs.datosGob.model.Titulo" modelVar="Título">


			<liferay-ui:search-container-column-text property="titulo" />



		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />

	</liferay-ui:search-container>


	<liferay-ui:search-container
		total="<%=DescripcionLocalServiceUtil.getDescripcionsCount(scopeGroupId.longValue(), datasetId)%>">
		<liferay-ui:search-container-results
			results="<%=DescripcionLocalServiceUtil.getDescripcions(scopeGroupId.longValue(), datasetId,
							searchContainer.getStart(), searchContainer.getEnd())%>" />

		<liferay-ui:search-container-row
			className="com.liferay.docs.datosGob.model.Descripcion"
			modelVar="descripcion">

			<liferay-ui:search-container-column-text property="descripcion" />



		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />

	</liferay-ui:search-container>


	<liferay-ui:search-container
		total="<%=DistributionLocalServiceUtil.getDistributionsCount(scopeGroupId.longValue(), datasetId)%>">
		<liferay-ui:search-container-results
			results="<%=DistributionLocalServiceUtil.getDistributions(scopeGroupId.longValue(), datasetId,
							searchContainer.getStart(), searchContainer.getEnd())%>" />

		<liferay-ui:search-container-row
			className="com.liferay.docs.datosGob.model.Distribution"
			modelVar="distribution">



			<liferay-ui:search-container-column-text property="tipo" />

			<liferay-ui:search-container-column-text name="Ir">
				<a href="<%=distribution.getUrl() %>">Ir</a>
			</liferay-ui:search-container-column-text>
			


		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />

	</liferay-ui:search-container>
</c:if>


