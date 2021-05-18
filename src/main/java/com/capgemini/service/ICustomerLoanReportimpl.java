package com.capgemini.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entites.CustomerLoanRequest;
import com.capgemini.exception.CustomerLoanRequestNotFoundException;
import com.capgemini.repository.CustomerLoanRequestRepository;
@Service
public class ICustomerLoanReportimpl implements ICustomerLoanReport {
	@Autowired
	CustomerLoanRequestRepository customerLoanRequestRepository;

	@Override
	public String hello(int id) {
		if (!customerLoanRequestRepository.existsById(id)) {
			throw new CustomerLoanRequestNotFoundException("Check the id and Try again");
		}

		CustomerLoanRequest ld = customerLoanRequestRepository.findById(id).get();
		if(ld.getAge()==20) {
			return "this is ok";
			
		}
		else {
			return "this is not ok";
		}
		
	}

}
