package com.capgemini.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class LoanStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	private double customerRefId;
	private String customerLoanType;
	private double loanAmount;
	private double emi;
}
