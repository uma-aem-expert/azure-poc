package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzurePocController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Develop branch is running on lambda : 01/12/2024---------";
	}

}
