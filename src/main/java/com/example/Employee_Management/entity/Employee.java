package com.example.Employee_Management.entity;
import com.example.Employee_Management.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_number")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long employee_id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile_number")
	private String mobile_number;
	
	@Column(name="password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
}