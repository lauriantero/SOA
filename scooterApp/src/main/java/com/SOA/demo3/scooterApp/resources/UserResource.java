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
import javax.ws.rs.core.MediaType;

import com.SOA.demo3.scooterApp.model.User;
import com.SOA.demo3.scooterApp.service.UserService;


@Path("/users")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class UserResource {

	private UserService userService = new UserService();
	
	
	@GET
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@POST
	public User addUser(User user) {
		return userService.addUser(user);
	}
	
	@PUT
	@Path("/{username}")
	public User updateUser(@PathParam("username") String username, User user) {
		user.setUsername(username);
		return userService.updateUser(user);
	}
	
	@DELETE
	@Path("/{username}")
	public void deleteUser(@PathParam("username") String username) {
		userService.removeUser(username);
	}
	
	@GET
	@Path("/{username}")
	public User getUser(@PathParam("username") String username) {
		return userService.getUser(username);
	}
}
