package com.liferay.docs.datosgob.portlet.portlet;

import com.liferay.docs.datosGob.model.Coleccion;
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

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jorge
 */
@Component(
	immediate = true,
			property = {
					"com.liferay.portlet.display-category=category.social",
					"com.liferay.portlet.instanceable=false",
					"com.liferay.portlet.scopeable=true",
					"javax.portlet.display-name=DatosGob",
					"javax.portlet.expiration-cache=0",
					"javax.portlet.init-param.template-path=/",
					"javax.portlet.init-param.view-template=/coleccionPortlet/view.jsp",
					"javax.portlet.name=" + DatosGobPortletKeys.DatosGob,
					"javax.portlet.resource-bundle=content.Language",
					"javax.portlet.security-role-ref=power-user,user",
				    "javax.portlet.supports.mime-type=text/html"
				},
	service = Portlet.class
)
public class DatosGobPortlet extends MVCPortlet {
	
	
	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Coleccion.class.getName(), renderRequest);

			long groupId = serviceContext.getScopeGroupId();

			String coleccionId = ParamUtil.getString(renderRequest, "coleccionId");

			List<Coleccion> colecciones = _coleccionLocalService.getColecciones(groupId);


			if (coleccionId == "") {
				if(colecciones.isEmpty()) {
					coleccionId="Vacío";
				}
				else {
					coleccionId = colecciones.get(0).getHomepage();
				}
				
			}
			System.out.println(coleccionId);

			renderRequest.setAttribute("coleccionId", coleccionId);
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