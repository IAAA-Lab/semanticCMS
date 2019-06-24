package com.liferay.docs.datosGob.application.list;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.docs.datosgob.portlet.constants.DatosGobPortletKeys;
import com.liferay.portal.kernel.model.Portlet;

@Component(
	    immediate = true,
	    property = {
	        "panel.app.order:Integer=301",
	        "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
	    },
	    service = PanelApp.class
	)
public class DatosgobAdminPanelApp extends BasePanelApp {

	@Override
    public String getPortletId() {
        return DatosGobPortletKeys.DatosGob_ADMIN;
    }

    @Override
    @Reference(
        target = "(javax.portlet.name=" + DatosGobPortletKeys.DatosGob_ADMIN + ")",
        unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }

}
