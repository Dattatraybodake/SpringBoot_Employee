package com.example.Employee_Management.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveemployee")
	public String AddEmployee(@RequestBody Employee employee)
	{
		System.out.println("-----------------------");
		boolean b = employeeService.AddEmployee(employee);
		if(b)
		{
			return "Employee Saved in database.";
		}
		else
		{
			return "Record Not Saved.";
		}		
	}
	
	@GetMapping(value="/findbyname/{n}")
	public Employee findByName(@PathVariable("n")String name)
	{
		Employee e = employeeService.SearchByname(name);
		return e;
	}
	@GetMapping("/searchbyid/{n}")
	public Optional<Employee> findById(@PathVariable("n") int employee_number)
	{
		Optional<Employee> e = employeeService.getEmployeeById(employee_number);
		return e;
	}
	
	@GetMapping(value="/findbysalary/{s}")
	public Employee findBySalary(@PathVariable("s") int salary)
	{
		Employee e = employeeService.SearchBySalary(salary);
		return e;
	}
	
    @GetMapping("/findsalarybetween/{min}/{max}")
	public Employee findsalaryBetween(@PathVariable("min") int min,@PathVariable("max") int max )
	{
		Employee e = employeeService.SalaryBetween(min, max);
		return e;
	}
    
    @PutMapping("/updateById/{employee_number}") // not worked
    public Optional<Employee> UpdateById(@PathVariable("employee_number") Integer employee_number)
    {
    	Optional<Employee> e = employeeService.getEmployeeById(employee_number);
    	if(e==null) 		
    	{
    		return e;
    	}
    	else
    	{
    		return null;
    	}
    }
    
    @DeleteMapping(value="/deletebyid/{employee_number}")
    public String deleteById(@PathVariable("employee_number") Integer employee_number)
    {
    	String msg = employeeService.deleteRecordById(employee_number);
		return msg;	
    }
}