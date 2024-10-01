package com.greet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PERSONAPI")
public interface PersonClient {
	
	@GetMapping("/")
	public String getPersonName();
}
