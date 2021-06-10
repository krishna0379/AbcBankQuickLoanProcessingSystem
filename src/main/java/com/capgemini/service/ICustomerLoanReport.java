package com.capgemini.service;

import java.util.List;

import com.capgemini.entites.LoanStatus;

public interface ICustomerLoanReport {
	public String lad(int id);
	public  List<LoanStatus> findallrecords();
	public String deleteById(int id);

}