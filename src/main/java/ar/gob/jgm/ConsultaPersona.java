/**
 * 
 */
package ar.gob.jgm;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
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
	@Path("user/{username}")
	public Map<String, Object> getPersonaCuilJSON(@PathParam("username") String username){
		Map<String, Object> query = new HashMap<String, Object>();  
		query.put("username", username);
		return query; 
	}
}

