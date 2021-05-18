package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entites.CustomerLoanRequest;
import com.capgemini.exception.CustomerLoanRequestNotFoundException;
import com.capgemini.service.ICustomerLoanRequestService;

@RestController
@RequestMapping("/api/customerloanrequest/")
public class CustomerLoanRequestController {

	@Autowired
	ICustomerLoanRequestService customerLoanRequestService;

	@PostMapping("/addloandetails")
	public ResponseEntity<String> createloandetails(@RequestBody CustomerLoanRequest customerLoanRequest) {
		customerLoanRequestService.addCustomerLoanRequest(customerLoanRequest);
		return new ResponseEntity<>("Added", HttpStatus.OK);
	}

	@PutMapping("/{customerid}")
	public ResponseEntity<String> updateloandetails(@PathVariable int customerid,
			@RequestBody CustomerLoanRequest customerLoanRequest) throws CustomerLoanRequestNotFoundException {
		customerLoanRequestService.updateCustomerLoanRequest(customerid, customerLoanRequest);
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}

	@DeleteMapping("/{customerid}")
	public ResponseEntity<String> deleteLoandetails(@PathVariable int customerid) {
		customerLoanRequestService.deleteCustomerLoanRequest(customerid);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);
	}

	@GetMapping("/{customerid}")
	public ResponseEntity<CustomerLoanRequest> findById(@PathVariable int customerid) {
		CustomerLoanRequest clr = customerLoanRequestService.findById(customerid);
		return new ResponseEntity<CustomerLoanRequest>(clr, HttpStatus.OK);
	}

}
