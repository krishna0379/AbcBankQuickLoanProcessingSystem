package com.capgemini.service;

import java.util.List;

import com.capgemini.entites.LoanProgram;

public interface ILoanService {
	public String addLoanDetails(LoanProgram loanprogram);

	public String updateLoanDetails(int loanid, LoanProgram loanprogram);

	public String deleteLoanDetails(int loanid);
	
	public LoanProgram findById(int id);
	public List<LoanProgram> findAll();

}
