package com.greet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greet.client.PersonClient;

@RestController
public class GreetController {
	
	@Autowired
	private PersonClient personClient;
	
	@GetMapping("/")
	public String getGreetMsg() {
		String person= personClient.getPersonName();
		return "Hello ! "+person;
	}
}
