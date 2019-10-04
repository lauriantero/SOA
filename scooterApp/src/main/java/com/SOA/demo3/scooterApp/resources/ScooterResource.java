package com.SOA.demo3.scooterApp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.SOA.demo3.scooterApp.model.Scooter;
import com.SOA.demo3.scooterApp.service.ScooterService;


@Path("/scooters")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class ScooterResource {

	ScooterService scooterService = new ScooterService();

	@GET
	public List<Scooter> getScooters(@QueryParam("year") int year,
									 @QueryParam("start") int start,
									 @QueryParam("size") int size) {
		if(year > 0) {
			return scooterService.getAllScootersForYear(year);
		}
		if(start > 0 || size > 0) {
			return scooterService.getAllMessagesPaginated(start, size);
		}
		return scooterService.getAllScooters();
	}

	@POST
	public Scooter addScooter(Scooter scooter) {
		return scooterService.addScooter(scooter);
	}

	@PUT
	@Path("/{scooterId}")
	public Scooter updateScooter(@PathParam("scooterId") long id, Scooter scooter) {
		scooter.setId(id);
		return scooterService.updateScooter(scooter);
	}

	@DELETE
	@Path("/{scooterId}")
	public void deleteScooter(@PathParam("scooterId") long id) {
		scooterService.removeScooter(id);
	}

	@GET
	@Path("/{scooterId}")
	public Scooter getScooter(@PathParam("scooterId") long id) {
		return scooterService.getScooter(id);
	}


}
