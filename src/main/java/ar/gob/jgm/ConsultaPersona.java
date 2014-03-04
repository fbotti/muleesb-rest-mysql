/**
 * 
 */
package ar.gob.jgm;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author fbotti
 *
 */
@Path("/")
public class ConsultaPersona {
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("users")
	public String getPersonaCuilJSON(){
		return ""; 
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("users")
	public String deletePersonaCuilJSON(){
		return ""; 
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("users")
	public String postPersonaCuilJSON(){
		return ""; 
	}
}

