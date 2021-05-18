package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entites.CustomerLoanRequest;
@Repository
public interface CustomerLoanRequestRepository extends JpaRepository<CustomerLoanRequest, Integer> {

}
