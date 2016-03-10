
package org.learn;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public class Service {

	private static final String text = "status :Server is running " + "\ntime : %s";

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	public Response getText() {
		String response = String.format(text, new Date());
		return Response.status(Response.Status.OK).entity(response).type(MediaType.TEXT_PLAIN).build();
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeeModel getJson() {

		// ...........db operation..
		// suppose we get these value from database
		// ............
		String randomName = "Random Name " + UUID.randomUUID().toString().substring(0, 4);
		int randomSalary = new Random().nextInt((10000-6000) + 1) + 6000;

		// returns the value received from database
		return new EmployeeModel(randomName, randomSalary, new Date());
	}	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public EmployeeModel getXml() {
		
		// ...........db operation..
		// suppose we get these value from database
		// ............
		String randomName = "Random Name " + UUID.randomUUID().toString().substring(0, 4);
		int randomSalary = new Random().nextInt((10000-6000) + 1) + 6000;

		// returns the value received from database
		return new EmployeeModel(randomName, randomSalary, new Date());	
	}
}
