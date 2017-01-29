package de.festival.seed.wfswarm.rest.status;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGreeting() {
	    return Response.ok(new ServiceStatusDTO()).build();
	}

	@GET
	@Path("/{id}")
	public ServiceStatusDTO getWhoop(@PathParam("id") int id) {
		return new ServiceStatusDTO();
	}

}