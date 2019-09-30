package com.SOAjersey.demo3;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("scooters")
public class ScooterResource {


	ScooterRepository repo = new ScooterRepository();


	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Scooter> getScooter() {

		System.out.println("getScooter called...");


		return repo.getScooters();

	}


	@POST
	@Path("scooter")
	public Scooter createScooter(Scooter sctr1) {

		System.out.println(sctr1);
		repo.create(sctr1);
		return sctr1;
	}
}
