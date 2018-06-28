package com.example.helloworld.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/random")
public class RandomResource {
    private Integer randomInt;

    public RandomResource(Integer num) {
        this.randomInt = num;
    }

    @GET
    public String printStuff() {
        System.out.println("HEYO");
        return "What";
    }

}
