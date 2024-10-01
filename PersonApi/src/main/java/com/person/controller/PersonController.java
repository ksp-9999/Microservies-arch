package com.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String getPersonName() {
		String port=env.getProperty("server.port");
		return "Sai prasad"+" port:"+port;
	}
}
