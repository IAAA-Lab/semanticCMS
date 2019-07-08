<%@ include file="../init.jsp"%>


<p>
	<b><liferay-ui:message key="datosgob.caption" /></b>
</p>


<portlet:actionURL name="addData" var="addDataURL" />

<aui:button-row cssClass="guestbook-buttons">

	<aui:button onClick="<%=addDataURL%>" value="A�adir Info"></aui:button>

</aui:button-row>



<portlet:actionURL name="deleteAll" var="deleteAllURL" />

<aui:button-row cssClass="guestbook-buttons">

	<aui:button onClick="<%=deleteAllURL%>" value="deleteAll"></aui:button>

</aui:button-row>


<p>
A�adir ficher con los datos CSV
</p>

<portlet:actionURL var="uploadFile" name="uploadFileAction">

</portlet:actionURL>
<aui:form action="<%=uploadFile%>" method="post"
	enctype="multipart/form-data">
	<aui:input type="file" name="sampleFile" />
	<button type="submit" class="defaultButton" style="margin-left: 10px;">Upload</button>
</aui:form>
