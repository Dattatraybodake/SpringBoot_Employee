package com.example.Employee_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public String SaveEmployee(@RequestBody Employee employee)
	{
		System.out.println("----------");
		boolean b= employeeService.SaveEmployee(employee);
		if(b)
		{
			return"Employee Saved in Database";
		}
		else
		{
			return"Problem Occur in Saved Data";
		}		
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping(value="/findByName/{n}")
	public Employee findByName(@PathVariable("n") String employee_name)
	{
		Employee e = employeeService.SearchByName(employee_name);
		return e;
	}
}