package com.rahul.healthcare;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
class HealthcareApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	void testPatients() throws Exception{
		RequestBuilder requestBuilder = null;
		requestBuilder = MockMvcRequestBuilders.get("/patient/details").accept(MediaType.APPLICATION_JSON);
		mockMvc.perform(requestBuilder);
	}

}
