package org.advrs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pp}/test")

public class MyResources {
	
	private int i =0;
	
	// for the following variables cannot have singletom class annotation @Singleton
	@PathParam("pp") private String atr1;
	@QueryParam("qp") private String atr2;
@GET
@Produces(MediaType.TEXT_PLAIN)
	public String testmth() {
		return "Archanas Rest app without web xml instance count =" +i++ +atr1 +atr2;
		
	}
	
}
