<%@ include file="../init.jsp"%>


<p>
	<b><liferay-ui:message key="datosgob.caption" /></b>
</p>


<portlet:actionURL name="addData" var="addDataURL" />

<aui:button-row cssClass="guestbook-buttons">

	<aui:button onClick="<%=addDataURL%>" value="Añadir Info"></aui:button>

</aui:button-row>



<portlet:actionURL name="deleteAll" var="deleteAllURL" />

<aui:button-row cssClass="guestbook-buttons">

	<aui:button onClick="<%=deleteAllURL%>" value="deleteAll"></aui:button>

</aui:button-row>
