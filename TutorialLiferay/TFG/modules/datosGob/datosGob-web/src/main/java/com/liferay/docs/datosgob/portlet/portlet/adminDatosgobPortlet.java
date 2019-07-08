package com.liferay.docs.datosgob.portlet.portlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
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
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.ByteArrayFileInputStream;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StreamUtil;

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

			ServiceContext serviceContext = ServiceContextFactory.getInstance(Coleccion.class.getName(), request);

			long groupId = serviceContext.getScopeGroupId();
			System.out.println("intento meter coleccion");

			_coleccionLocalService.deleteColeccion("http://datos.gob.es");

			Coleccion c = _coleccionLocalService.createColeccion("http://datos.gob.es");
			c.setTitulo("Datos gobierno");
			c.setGroupId(groupId);
			_coleccionLocalService.addColeccion(c);

			Dataset d1 = _datasetLocalService.createDataset("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			d1.setHomepage(c.getHomepage());
			d1.setGroupId(groupId);

			Dataset d2 = _datasetLocalService.createDataset("e5948fd5-8b21-4aa8-b7b0-c2e827e27de8");
			d2.setHomepage(c.getHomepage());
			d2.setGroupId(groupId);

			Dataset d3 = _datasetLocalService.createDataset("3");
			d3.setHomepage(c.getHomepage());
			d3.setGroupId(groupId);

			Dataset d4 = _datasetLocalService.createDataset("4");
			d4.setHomepage(c.getHomepage());
			d4.setGroupId(groupId);

			Dataset d5 = _datasetLocalService.createDataset("5");
			d5.setHomepage(c.getHomepage());
			d5.setGroupId(groupId);

			Dataset d6 = _datasetLocalService.createDataset("6");
			d6.setHomepage(c.getHomepage());
			d6.setGroupId(groupId);

			Dataset d7 = _datasetLocalService.createDataset("7");
			d7.setHomepage(c.getHomepage());
			d7.setGroupId(groupId);

			Dataset d8 = _datasetLocalService.createDataset("8");
			d8.setHomepage(c.getHomepage());
			d8.setGroupId(groupId);

			Titulo t1 = _tituloLocalService.createTitulo(1);
			t1.setGroupId(groupId);
			t1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			t1.setTitulo("Título1 del ds1");

			Titulo t2 = _tituloLocalService.createTitulo(2);
			t2.setGroupId(groupId);
			t2.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			t2.setTitulo("Título2 del ds1");

			Titulo t3 = _tituloLocalService.createTitulo(3);
			t3.setGroupId(groupId);
			t3.setDatasetId("4");
			t3.setTitulo("Título del ds4");

			Descripcion ds1 = _descripcionLocalService.createDescripcion(1);
			ds1.setGroupId(groupId);
			ds1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds1.setDescripcion("Descripcion del primer dato.");

			Descripcion ds2 = _descripcionLocalService.createDescripcion(2);
			ds2.setGroupId(groupId);
			ds2.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds2.setDescripcion("Descripcion2 del primer dato.");

			Descripcion ds3 = _descripcionLocalService.createDescripcion(3);
			ds3.setGroupId(groupId);
			ds3.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");
			ds3.setDescripcion("Descripcion3 del primer dato.");

			Descripcion ds4 = _descripcionLocalService.createDescripcion(4);
			ds4.setGroupId(groupId);
			ds4.setDatasetId("3");
			ds4.setDescripcion("Descripcion del dato 3.");

			Distribution di1 = _distributionLocalService.createDistribution(
					"http://www.agenciatributaria.es/static_files/AEAT/Estudios/Estadisticas/Informes_Estadisticos/Informe_de_Ventas__Empleo_y_Salarios_en_las_Grandes_Empresas/2013/Series.xls");
			di1.setTipo("XLS");
			di1.setGroupId(groupId);
			di1.setDatasetId("8435c8c3-61d3-4e03-9f0c-bdf085f87494");

			Distribution di2 = _distributionLocalService.createDistribution(
					"http://www.agenciatributaria.es/AEAT.internet/datosabiertos/catalogo/hacienda/Ventas_Empleo_Salarios_Grandes_Empresas/Calendario_difusion.shtml");
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

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Coleccion.class.getName(), request);

		long groupId = serviceContext.getScopeGroupId();
		List<Dataset> list = _datasetLocalService.getDatasets(groupId, "http://datos.gob.es");

		for (Dataset data : list) {
			String datasetId = data.getDatasetId();

			List<Titulo> titulos = _tituloLocalService.getTitulos(groupId, datasetId);
			for (Titulo titu : titulos) {
				_tituloLocalService.deleteTitulo(titu.getTituloId());
			}

			List<Descripcion> descripciones = _descripcionLocalService.getDescripcions(groupId, datasetId);
			for (Descripcion titu : descripciones) {
				_descripcionLocalService.deleteDescripcion(titu.getDescripcionId());
			}

			List<Distribution> distribuciones = _distributionLocalService.getDistributions(groupId, datasetId);
			for (Distribution titu : distribuciones) {
				_distributionLocalService.deleteDistribution(titu.getPrimaryKey());
			}

			_datasetLocalService.deleteDataset(datasetId);
		}

	}

	private void addData(List<String> datos, long groupId, ServiceContext ServiceContext) {
		System.out.println(datos.size());

		try {
			_coleccionLocalService.deleteColeccion("http://datos.gob.es");
			Coleccion c = _coleccionLocalService.createColeccion("http://datos.gob.es");
			c.setTitulo("Datos gobierno");
			c.setGroupId(groupId);
			_coleccionLocalService.addColeccion(c);

			for (String item : datos) {
				List<String> linea = new ArrayList<String>(Arrays.asList(item.split(";")));
				String datasetId = linea.get(0).substring(29);

				// AÑADO DATASET
				Dataset d1 = _datasetLocalService.createDataset(datasetId);
				d1.setHomepage(c.getHomepage());
				d1.setGroupId(groupId);
				_datasetLocalService.addDataset(d1);

				// AÑADO TITULOS

				String titulosS = linea.get(2);
				titulosS = titulosS.replaceAll("\\[", "//[");
				// System.out.println(titulosS);

				List<String> titulos = new ArrayList<String>(Arrays.asList(titulosS.split("//")));
				int i = 0;
				for (String titulo : titulos) {
					if (i != 0) {
						_tituloLocalService.addDescripcion(datasetId, titulo, ServiceContext);

					}
					i++;
				}

				// AÑADO DESCRIPCIONES
				String descripcionesS = linea.get(3);
				descripcionesS = descripcionesS.replaceAll("\\[", "//[");
				// System.out.println(titulosS);

				List<String> descripciones = new ArrayList<String>(Arrays.asList(descripcionesS.split("//")));
				i = 0;
				for (String descrip : descripciones) {
					if (i != 0) {

						_descripcionLocalService.addDescripcion(datasetId, descrip, ServiceContext);
					}
					i++;
				}

				// AÑADO DISTRIBUCIONES
				String distribucionesS = linea.get(17);
				List<String> distribuciones = new ArrayList<String>(Arrays.asList(distribucionesS.split("//\\[")));
				i = 0;
				for (String distri : distribuciones) {
					System.out.println(distri);

					String[] splitString = (distri.split("\\["));
					String url="";
					String tipo="";
					for(int u=0;u<splitString.length;u++) {
						System.out.println(splitString[u]);
						if(splitString[u].contains("ACCESS_URL]")) {
							url=splitString[u].substring(11);
						}
						else if(splitString[u].contains("MEDIA_TYPE]")) {
							tipo=splitString[u].substring(11);
						}
						
					}
					
					Distribution di2 = _distributionLocalService.createDistribution(url);
					di2.setTipo(tipo);
					di2.setGroupId(groupId);
					di2.setDatasetId(datasetId);
					
					System.out.println("--------");
					
					_distributionLocalService.addDistribution(di2);

					i++;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void uploadFileAction(ActionRequest actionRequest, ActionResponse actionResponse) {

		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		ByteArrayFileInputStream inputStream = null;

		try {

			File file = uploadPortletRequest.getFile("sampleFile");
			if (!file.exists()) {
				System.out.println("Empty File");
			}
			if ((file != null) && file.exists()) {
				inputStream = new ByteArrayFileInputStream(file, 1024);
				byte[] data;
				try {
					data = FileUtil.getBytes(inputStream);
					String datos = new String(data);
					List<String> list = new ArrayList<String>(Arrays.asList(datos.split("\n")));

					try {
						ServiceContext serviceContext = ServiceContextFactory.getInstance(Coleccion.class.getName(),
								actionRequest);
						long groupId = serviceContext.getScopeGroupId();
						this.addData(list, groupId, serviceContext);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			StreamUtil.cleanUp(inputStream);
		}
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
