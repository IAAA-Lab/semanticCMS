package com.liferay.docs.datosgob.portlet.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.datosGob.model.Coleccion;
import com.liferay.docs.datosGob.model.Dataset;
import com.liferay.docs.datosGob.model.Descripcion;
import com.liferay.docs.datosGob.model.Distribution;
import com.liferay.docs.datosGob.model.Titulo;
import com.liferay.docs.datosGob.service.ColeccionLocalService;
import com.liferay.docs.datosGob.service.DatasetLocalService;
import com.liferay.docs.datosGob.service.DescripcionLocalService;
import com.liferay.docs.datosGob.service.DistributionLocalService;
import com.liferay.docs.datosGob.service.TituloLocalService;
import com.liferay.docs.datosgob.portlet.constants.DatosGobPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;


@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.scopeable=true", "javax.portlet.display-name=DatosGob", "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.portlet-title-based-navigation=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/adminPortlet/view.jsp",
		"javax.portlet.name=" + DatosGobPortletKeys.DatosGob_ADMIN, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator", "javax.portlet.supports.mime-type=text/html",
		"com.liferay.portlet.add-default-resource=true" }, service = Portlet.class)
public class adminDatosgobPortlet extends MVCPortlet {

	public void addData(ActionRequest request, ActionResponse response) {
		System.out.println("Meto 2 datasets");
		

		try {
			_coleccionLocalService.deleteColeccion("http://datos.gob.es");
			
			
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Coleccion.class.getName(), request);

			long groupId = serviceContext.getScopeGroupId();
			System.out.println("intento meter coleccion");
			
			Coleccion c=_coleccionLocalService.createColeccion("http://datos.gob.es");
			c.setTitulo("Datos gobierno");
			c.setGroupId(groupId);
			_coleccionLocalService.addColeccion(c);
			
			
			Dataset d1=_datasetLocalService.createDataset("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			d1.setHomepage(c.getHomepage());
			d1.setGroupId(groupId);
			
			Dataset d2=_datasetLocalService.createDataset("e5948fd5-8b21-4aa8-b7b0-c2e827e27de8");
			d2.setHomepage(c.getHomepage());
			d2.setGroupId(groupId);
			
			
			Dataset d3=_datasetLocalService.createDataset("3");
			d3.setHomepage(c.getHomepage());
			d3.setGroupId(groupId);
			
			Dataset d4=_datasetLocalService.createDataset("4");
			d4.setHomepage(c.getHomepage());
			d4.setGroupId(groupId);
			
			Dataset d5=_datasetLocalService.createDataset("5");
			d5.setHomepage(c.getHomepage());
			d5.setGroupId(groupId);
			
			Dataset d6=_datasetLocalService.createDataset("6");
			d6.setHomepage(c.getHomepage());
			d6.setGroupId(groupId);
			
			Dataset d7=_datasetLocalService.createDataset("7");
			d7.setHomepage(c.getHomepage());
			d7.setGroupId(groupId);
			
			Dataset d8=_datasetLocalService.createDataset("8");
			d8.setHomepage(c.getHomepage());
			d8.setGroupId(groupId);
			
			
			
			Titulo t1=_tituloLocalService.createTitulo(1);
			t1.setGroupId(groupId);
			t1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			t1.setTitulo("Título1 del ds1");
			
			Titulo t2=_tituloLocalService.createTitulo(2);
			t2.setGroupId(groupId);
			t2.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			t2.setTitulo("Título2 del ds1");
			
			Titulo t3=_tituloLocalService.createTitulo(3);
			t3.setGroupId(groupId);
			t3.setDatasetId("4");
			t3.setTitulo("Título del ds4");
			
			
			
			Descripcion ds1=_descripcionLocalService.createDescripcion(1);
			ds1.setGroupId(groupId);
			ds1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds1.setDescripcion("Descripcion del primer dato.");
			
			Descripcion ds2=_descripcionLocalService.createDescripcion(2);
			ds2.setGroupId(groupId);
			ds2.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds2.setDescripcion("Descripcion2 del primer dato.");
			
			Descripcion ds3=_descripcionLocalService.createDescripcion(3);
			ds3.setGroupId(groupId);
			ds3.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds3.setDescripcion("Descripcion3 del primer dato.");
			
			Descripcion ds4=_descripcionLocalService.createDescripcion(4);
			ds4.setGroupId(groupId);
			ds4.setDatasetId("3");
			ds4.setDescripcion("Descripcion del dato 3.");
			
			
			
			Distribution di1=_distributionLocalService.createDistribution("http://www.agenciatributaria.es/static_files/AEAT/Estudios/Estadisticas/Informes_Estadisticos/Informe_de_Ventas__Empleo_y_Salarios_en_las_Grandes_Empresas/2013/Series.xls");
			di1.setTipo("XLS");
			di1.setGroupId(groupId);
			di1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			

			Distribution di2=_distributionLocalService.createDistribution("http://www.agenciatributaria.es/AEAT.internet/datosabiertos/catalogo/hacienda/Ventas_Empleo_Salarios_Grandes_Empresas/Calendario_difusion.shtml");
			di2.setTipo("HTML");
			di2.setGroupId(groupId);
			di2.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			
			
			
			_datasetLocalService.addDataset(d1);
			_datasetLocalService.addDataset(d2);
			_datasetLocalService.addDataset(d3);
			_datasetLocalService.addDataset(d4);
			_datasetLocalService.addDataset(d5);
			_datasetLocalService.addDataset(d6);
			_datasetLocalService.addDataset(d7);
			_datasetLocalService.addDataset(d8);
			
			
			_tituloLocalService.addTitulo(t1);
			_tituloLocalService.addTitulo(t2);
			_tituloLocalService.addTitulo(t3);
			
			
			_descripcionLocalService.addDescripcion(ds1);
			_descripcionLocalService.addDescripcion(ds2);
			_descripcionLocalService.addDescripcion(ds3);
			_descripcionLocalService.addDescripcion(ds4);
			
			_distributionLocalService.addDistribution(di1);
			_distributionLocalService.addDistribution(di2);
			
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void deleteAll(ActionRequest request, ActionResponse response) throws PortalException {
		System.out.println("Borro los 2 datasets");
		
		_datasetLocalService.deleteDataset("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
		_datasetLocalService.deleteDataset("e5948fd5-8b21-4aa8-b7b0-c2e827e27de8");
		_datasetLocalService.deleteDataset("3");
		_datasetLocalService.deleteDataset("4");
		_datasetLocalService.deleteDataset("5");
		_datasetLocalService.deleteDataset("6");
		_datasetLocalService.deleteDataset("7");
		_datasetLocalService.deleteDataset("8");
		
		_tituloLocalService.deleteTitulo(1);
		_tituloLocalService.deleteTitulo(2);
		_tituloLocalService.deleteTitulo(3);
		
		_descripcionLocalService.deleteDescripcion(1);
		_descripcionLocalService.deleteDescripcion(2);
		_descripcionLocalService.deleteDescripcion(3);
		_descripcionLocalService.deleteDescripcion(4);
		
		_distributionLocalService.deleteDistribution("http://www.agenciatributaria.es/static_files/AEAT/Estudios/Estadisticas/Informes_Estadisticos/Informe_de_Ventas__Empleo_y_Salarios_en_las_Grandes_Empresas/2013/Series.xls");
		_distributionLocalService.deleteDistribution("http://www.agenciatributaria.es/AEAT.internet/datosabiertos/catalogo/hacienda/Ventas_Empleo_Salarios_Grandes_Empresas/Calendario_difusion.shtml");
		
		
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
