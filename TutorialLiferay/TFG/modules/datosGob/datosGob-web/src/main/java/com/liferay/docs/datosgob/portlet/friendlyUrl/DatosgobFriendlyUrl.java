package com.liferay.docs.datosgob.portlet.friendlyUrl;


import com.liferay.docs.datosgob.portlet.constants.DatosGobPortletKeys;
import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author jorge
 */
@Component(
		property = {
		        "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
		        "javax.portlet.name=" + DatosGobPortletKeys.Dataset
		    },
		    service = FriendlyURLMapper.class
)
public class DatosgobFriendlyUrl extends DefaultFriendlyURLMapper {

    @Override
    public String getMapping() {
        return _MAPPING;
        
    }

    private static final String _MAPPING = "datosgob";

}