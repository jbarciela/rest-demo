package com.barciela.restdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RestDemoCtrl {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
