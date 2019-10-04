package com.SOA.demo3.scooterApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.SOA.demo3.scooterApp.database.DatabaseClass;
import com.SOA.demo3.scooterApp.model.User;

public class UserService {

	private Map<String, User> users = DatabaseClass.getUsers();
	
	public UserService() {
		users.put("Pertsa", new User(1L, "Pertsa", "Pertti", "Salonen"));
	}

	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

	public User getUser(String userName) {
		return users.get(userName);
	}

	public User addUser(User user) {
		user.setId(users.size() + 1);
		users.put(user.getUsername(), user);
		return user;
	}

	public User updateUser(User user) {
		if(user.getUsername().isEmpty()) {
			return null;
		}
		users.put(user.getUsername(), user);
		return user;
	}

	public User removeUser(String userName) {
		return users.remove(userName);
	}
}
