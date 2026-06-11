package com.example.Employee_Management.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_number")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Column(name="name", nullable=false)
	private String employee_name;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="mobile_number", nullable=false)
	private String mobile_number;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender", nullable=false)
	private String gender;
}