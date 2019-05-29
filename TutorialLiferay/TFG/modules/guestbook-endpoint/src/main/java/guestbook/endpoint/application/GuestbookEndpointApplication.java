package guestbook.endpoint.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import com.liferay.docs.guestbook.service.GuestbookLocalServiceUtil;

/**
 * @author jorge
 */
@Component(
	
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/gb",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Guestbooks"
	},
	service = Application.class
)
public class GuestbookEndpointApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	

	@GET
	@Produces("text/plain")
	public String working() {
		System.out.println("Llamada!");
		return "It works!";
	}
	
	@GET
	@Path("/{scopeGroupId}")
	@Produces("text/plain")
	public String morning(
		@PathParam("scopeGroupId") long scopeGroupId) {

		System.out.println("Llamada!"+scopeGroupId);
		String json=GuestbookLocalServiceUtil.toJSONLD(scopeGroupId);

		return json;
	}
	
	


}