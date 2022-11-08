package com.mysqlprogramme.springbootmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mysqlprogramme.springbootmysql.repository")
public class SpringbootmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmysqlApplication.class, args);
	}

}
