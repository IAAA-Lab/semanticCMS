<%@ include file="../init.jsp"%>


<%
	String datasetId = String.valueOf((String) renderRequest.getAttribute("datasetId"));
%>

<c:if test="<%=datasetId != "Vac�o"%>">
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
			className="com.liferay.docs.datosGob.model.Titulo" modelVar="T�tulo">


			<liferay-ui:search-container-column-text name="T�tulos" property="titulo" />



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

			<liferay-ui:search-container-column-text name="Descripciones" property="descripcion" />



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



			<liferay-ui:search-container-column-text name="Distribuciones" property="tipo" />

			<liferay-ui:search-container-column-text name="Ir">
				<a href="<%=distribution.getUrl() %>">Ir</a>
			</liferay-ui:search-container-column-text>
			


		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />

	</liferay-ui:search-container>
</c:if>
<c:if test="<%=datasetId == "Vac�o"%>">
<%
	out.print("Este portlet muestra informaci�n de los datasets.");
%>
</c:if>


