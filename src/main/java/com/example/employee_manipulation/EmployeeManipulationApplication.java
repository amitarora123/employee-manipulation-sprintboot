package com.example.employee_manipulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.ems.controller, com.ems.service, com.ems.repository")
@EntityScan("com.ems.entities")
@EnableJpaRepositories("com.ems.repository")
public class EmployeeManipulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManipulationApplication.class, args);
	}

}
