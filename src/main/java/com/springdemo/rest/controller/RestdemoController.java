package com.springdemo.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/demo")
public class RestdemoController {

	@GET
	@Path("/username")
	public String getUserName(){
		return "Pirate";
	}
}
