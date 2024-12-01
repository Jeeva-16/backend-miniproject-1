package com.example.Emp_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {" com.example.Emp_manage"})
public class EmpManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManageApplication.class, args);
	}

}
