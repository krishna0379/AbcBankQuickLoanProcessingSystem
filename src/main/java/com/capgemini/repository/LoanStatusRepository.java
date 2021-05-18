package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entites.LoanStatus;
@Repository
public interface LoanStatusRepository extends JpaRepository<LoanStatus, Integer> {

}
