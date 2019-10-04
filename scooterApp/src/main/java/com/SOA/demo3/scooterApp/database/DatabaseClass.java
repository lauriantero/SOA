package com.SOA.demo3.scooterApp.database;

import java.util.HashMap;
import java.util.Map;

import com.SOA.demo3.scooterApp.model.Scooter;
import com.SOA.demo3.scooterApp.model.User;

public class DatabaseClass {

	private static Map<Long, Scooter> scooters = new HashMap<>();
	private static Map<String, User> users = new HashMap<>();
	
	public static Map<Long, Scooter> getScooters() {
		return scooters;
	}
	
	public static Map<String, User> getUsers() {
		return users;
	}
}
