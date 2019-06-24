package com.liferay.docs.datosgob.portlet.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.datosGob.model.Dataset;
import com.liferay.docs.datosGob.service.ColeccionLocalService;
import com.liferay.docs.datosGob.service.DatasetLocalService;
import com.liferay.docs.datosGob.service.DescripcionLocalService;
import com.liferay.docs.datosGob.service.DistributionLocalService;
import com.liferay.docs.datosGob.service.TituloLocalService;
import com.liferay.docs.datosgob.portlet.constants.DatosGobPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.social",
		"com.liferay.portlet.instanceable=false", "com.liferay.portlet.scopeable=true",
		"javax.portlet.display-name=Dataset", "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/datasetPortlet/view.jsp",
		"javax.portlet.name=" + DatosGobPortletKeys.Dataset, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html" }, service = Portlet.class)
public class DatasetPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {

			String datasetId = ParamUtil.getString(renderRequest, "datasetId");

			if (datasetId == "") {

				datasetId = "Vacío";

			}
			System.out.println(datasetId);

			renderRequest.setAttribute("datasetId", datasetId);
		} catch (Exception e) {
			throw new PortletException(e);
		}

		super.render(renderRequest, renderResponse);
	}

	@Reference(unbind = "-")
	protected void setColeccionService(ColeccionLocalService coleccionLocalService) {
		_coleccionLocalService = coleccionLocalService;
	}

	@Reference(unbind = "-")
	protected void setDatasetService(DatasetLocalService datasetLocalService) {
		_datasetLocalService = datasetLocalService;
	}

	@Reference(unbind = "-")
	protected void setDescripcionService(DescripcionLocalService descripcionLocalService) {
		_descripcionLocalService = descripcionLocalService;
	}

	@Reference(unbind = "-")
	protected void setTituloService(TituloLocalService tituloLocalService) {
		_tituloLocalService = tituloLocalService;
	}

	@Reference(unbind = "-")
	protected void setDistribucionService(DistributionLocalService distributionLocalService) {
		_distributionLocalService = distributionLocalService;
	}

	private ColeccionLocalService _coleccionLocalService;
	private DatasetLocalService _datasetLocalService;
	private DescripcionLocalService _descripcionLocalService;
	private TituloLocalService _tituloLocalService;
	private DistributionLocalService _distributionLocalService;

}
