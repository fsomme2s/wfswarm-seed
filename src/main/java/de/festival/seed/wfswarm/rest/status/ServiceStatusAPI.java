package de.festival.seed.wfswarm.rest.status;

//import org.slf4j.Logger;


import org.slf4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("/hello")
@RequestScoped
public class ServiceStatusAPI {

    @Inject
    private Logger logger;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGreeting() throws URISyntaxException {
	    logger.info("Hello World!");
		logger.debug("Debug World!");
	    return Response.ok(new ServiceStatusDTO("UP")).build();
	}

	@GET
	@Path("/{id}")
	public ServiceStatusDTO getWhoop(@PathParam("id") int id) {
		return new ServiceStatusDTO("UP");
	}

}