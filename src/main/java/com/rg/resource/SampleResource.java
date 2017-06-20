package com.rg.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.ignite.IgniteCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rg.bo.HackerBo;

@Component
@Path("api")
public class SampleResource {

	@Autowired
	IgniteCache<Integer, HackerBo> hackerCache;
	
	
	@Path("/echo/{stringToEcho}")
	@GET
	public Response getEcho(@PathParam("stringToEcho") String stringToEcho){
		return Response.ok(stringToEcho).build();
	}
	
	@Path("/putHacker/{hackerName}/{hackerNumber}")
	@GET
	public Response putHacker(
				@PathParam("hackerName") String hackerName, 
				@PathParam("hackerNumber") Integer hackerNumber){
		hackerCache.put(hackerNumber, new HackerBo(hackerNumber, hackerName, false));
		return Response.ok("Added").build();
	}
	
	@Path("/getHacker/{hackerNumber}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getHacker(@PathParam("hackerNumber") Integer hackerNumber){
		HackerBo hacker = hackerCache.get(hackerNumber);
		if(hacker == null){
			return Response.ok("No hacker: " + hackerNumber).build();
		}
		return Response.ok(hacker).build();
	}
	
}
