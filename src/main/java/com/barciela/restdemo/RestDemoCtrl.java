package com.barciela.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Friendly REST Controller
 */
@RestController
public class RestDemoCtrl {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
