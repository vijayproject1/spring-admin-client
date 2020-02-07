package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	

	@GetMapping("/test/{message}")
	public String test(@PathVariable("message")String message) {
		
		return  message;
	}

}
