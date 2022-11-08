package com.mysqlprogramme.springbootmysql.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqlprogramme.springbootmysql.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findById(int id);
}