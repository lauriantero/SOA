package com.SOA.demo3.scooterApp.resources;

import com.SOA.demo3.scooterApp.service.AuthenticationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("token")
public class TokenResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getToken() {
        return AuthenticationService.getJwt();
    }
}
