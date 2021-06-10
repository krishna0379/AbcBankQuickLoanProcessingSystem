package com.capgemini.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CustomerLoanRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double age;
	private double annualIncome;
	private String loanType;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String gender;
	private String city;
	private String stateName;
	private String panNumber;
	private String nationality;
	
	

}
