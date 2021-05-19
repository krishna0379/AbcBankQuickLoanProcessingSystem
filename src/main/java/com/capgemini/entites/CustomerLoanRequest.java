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
	private int customerid;
	private double age;
	private double annualincome;
	private String loantype;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String city;
	private String state;
	private String pannumber;
	private String nationality;
	
	

}
