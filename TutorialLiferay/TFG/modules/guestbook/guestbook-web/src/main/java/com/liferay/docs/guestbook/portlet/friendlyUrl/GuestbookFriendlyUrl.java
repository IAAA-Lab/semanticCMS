package com.liferay.docs.guestbook.portlet.friendlyUrl;


import com.liferay.docs.guestbook.constants.GuestbookPortletKeys;
import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author jorge
 */
@Component(
		property = {
		        "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
		        "javax.portlet.name=" + GuestbookPortletKeys.Guestbook
		    },
		    service = FriendlyURLMapper.class
)
public class GuestbookFriendlyUrl extends DefaultFriendlyURLMapper {

    @Override
    public String getMapping() {
        return _MAPPING;
        
    }

    private static final String _MAPPING = "guestbooks";

}