package com.example.Employee_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		System.out.println("Hello User");

//		PasswordEncoder encoder=new BCryptPasswordEncoder();
//
//		System.out.println(encoder.encode("user"));
//		System.out.println(encoder.encode("admin"));

	}
}