package com.example.Employee_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.Department;
import com.example.Employee_Management.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	@PostMapping
	public String saveDepartment(@RequestBody Department department)
	{
		System.out.println();
		boolean b = departmentservice.SaveDepartments(department);
		if(b)
		{
			return "Department Saved in Database";
		}
		else
		{
			return "Problem Occurs on Saved data";
		}	
	}
	
	@GetMapping
	public List<Department> getDepartments()
	{
		return departmentservice.getDepartment();
	}
}