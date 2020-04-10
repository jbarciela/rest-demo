package com.barciela.restdemo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


//
// just a smoke test, indeed the controller was created
//
@SpringBootTest
class RestDemoApplicationTests {

	@Autowired
	private RestDemoCtrl controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
