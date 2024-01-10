package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzurePocController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "This is the poc project";
	}

}
