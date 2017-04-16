package com.rg.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("api")
public class SampleResource {

	@Path("/echo/{stringToEcho}")
	@GET
	public Response getEcho(@PathParam("stringToEcho") String stringToEcho){
		return Response.ok(stringToEcho).build();
	}
	
}
