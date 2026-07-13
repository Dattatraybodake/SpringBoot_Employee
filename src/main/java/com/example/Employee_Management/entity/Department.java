package com.example.Employee_Management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="department")
public class Department 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long department_id;
	private String department_name;
	private String job_title;
	private String manager_name;
	private String team_leader;	
}