package com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzurePocController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Master branch is running on lambda, manual build : 01/11/2024";
	}

}
