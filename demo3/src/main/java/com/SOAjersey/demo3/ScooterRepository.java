package com.SOAjersey.demo3;

import java.util.ArrayList;
import java.util.List;

public class ScooterRepository {

	List<Scooter> scooters;

	public ScooterRepository() {

		scooters = new ArrayList<>();

		Scooter sctr1 = new Scooter();
		sctr1.setScooterId("SCTR001001");
		sctr1.setBatteryLvl(90);


		Scooter sctr2 = new Scooter();
		sctr2.setScooterId("SCTR001002");
		sctr2.setBatteryLvl(60);


		Scooter sctr3 = new Scooter();
		sctr3.setScooterId("SCTR001003");
		sctr3.setBatteryLvl(0);


		Scooter sctr4 = new Scooter();
		sctr4.setScooterId("SCTR001004");
		sctr4.setBatteryLvl(82);

		scooters.add(sctr1);
		scooters.add(sctr2);
		scooters.add(sctr3);
		scooters.add(sctr4);

	}

	public List<Scooter> getScooters() {
		return scooters;
	}

	public Scooter getScooter(String scooterId) {


		for(Scooter sctr : scooters) {
			if(sctr.getScooterId() == scooterId)
				return sctr;
		}

		return null;
	}

	public void create(Scooter sctr1) {
		// TODO Auto-generated method stub
		scooters.add(sctr1);
	}



}
