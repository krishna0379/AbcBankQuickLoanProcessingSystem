package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entites.LoanProgram;
@Repository
public interface LoanProgramRepository extends JpaRepository<LoanProgram, Integer> {

}
