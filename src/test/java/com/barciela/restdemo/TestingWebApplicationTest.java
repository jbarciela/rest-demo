package com.barciela.restdemo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/*
Another useful approach is to not start the server at all but to test only
the layer below that, where Spring handles the incoming HTTP request and hands
it off to your controller. That way, almost of the full stack is used,
and your code will be called in exactly the same way as if it were processing
a real HTTP request but without the cost of starting the server

https://spring.io/guides/gs/testing-web/
*/
@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(
      get("/"))
      .andDo(print())
      .andExpect(status().isOk())
			.andExpect(content().string(containsString("Greetings from Spring Boot!")));
	}
}
