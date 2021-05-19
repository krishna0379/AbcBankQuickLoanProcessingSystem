package com.capgemini.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capgemini.entites.CustomerLoanRequest;
import com.capgemini.service.ICustomerLoanRequestService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CustomerLoanRequestController.class)
class CustomerLoanRequestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ICustomerLoanRequestService customerLoanRequestService;

	@Test
	void findCustomerLoanRequesttest() throws Exception {

		CustomerLoanRequest clr = new CustomerLoanRequest();
		clr.setCustomerid(1);
		clr.setEmail("kittu@gmail.com");

		Mockito.when(customerLoanRequestService.findById(Mockito.anyInt())).thenReturn(clr);

		mockMvc.perform(get("/api/customerloanrequest/1")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.customerid").value("kittu"));

	}

}
