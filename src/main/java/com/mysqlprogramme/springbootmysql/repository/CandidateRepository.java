package com.mysqlprogramme.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqlprogramme.springbootmysql.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {

}
