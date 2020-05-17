package com.barciela.restdemo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.*;

/*
 * This test creates a web server
 * "...you could start the application and listen for a connection
 * (as it would do in production) and then send an HTTP request and assert the response..."
 *
 * https://spring.io/guides/gs/testing-web/
 * 
 * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.html
 * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.WebEnvironment.html
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	//
	// https://www.tutorialspoint.com/spring_boot/spring_boot_rest_template.htm1
	//
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate
      .getForObject("http://localhost:" + port + "/",String.class))
      .contains("Greetings from Spring Boot!");
	}
}
