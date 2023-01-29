package com.quarkus.first.example;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class Geeting {
    GreedingConfig config;

    @Inject
    public Geeting(GreedingConfig config) {
        this.config = config;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeding() {
        return "Hello " + config.getRecipient();
    }
}
