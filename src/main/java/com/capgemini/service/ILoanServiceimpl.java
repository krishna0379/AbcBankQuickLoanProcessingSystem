package com.capgemini.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.capgemini.entites.LoanProgram;
import com.capgemini.exception.LoanNotFoundException;
import com.capgemini.repository.LoanProgramRepository;

@Service
public class ILoanServiceimpl implements ILoanService {

	@Autowired
	LoanProgramRepository loanprogramrepository;

	@Override
	public String addLoanDetails(LoanProgram loanprogram) {
		loanprogramrepository.save(loanprogram);
		return "Loan Details added !!";
	}

	@Override
	public String updateLoanDetails(int loanid, LoanProgram loanprogram) {
		if (!loanprogramrepository.existsById(loanid)) {
			throw new LoanNotFoundException("Check the id and Try again");
		}
		LoanProgram ld = loanprogramrepository.findById(loanid).get();
		ld.setLoanType(loanprogram.getLoanType());
		ld.setMaximumAge(loanprogram.getMaximumAge());
		ld.setMinimumAge(loanprogram.getMinimumAge());
		loanprogramrepository.save(ld);

		return "Loan details updated";

	}

	@Override
	public String deleteLoanDetails(int loanid) {
		if (!loanprogramrepository.existsById(loanid)) {
			throw new LoanNotFoundException("The id is not available ");
		}
		loanprogramrepository.deleteById(loanid);
		return "Record deleted";
	}

	@Override
	public LoanProgram findById(int id) {
		if (!loanprogramrepository.existsById(id)) {
			throw new LoanNotFoundException(" Loan program Not Found");
		}
		LoanProgram ls = loanprogramrepository.findById(id).get();
		return ls;
	}

	@Override
	public List<LoanProgram> findAll() {
		//return loanprogramrepository.findAll();
		return loanprogramrepository.findAll(Sort.by(Sort.Direction.ASC, "loanId"));
	}

}
