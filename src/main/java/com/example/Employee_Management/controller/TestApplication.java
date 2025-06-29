package com.example.Employee_Management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.exception.EmployeeNotFoundException;
import com.example.Employee_Management.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000")	// path of React Server
public class TestApplication {
	@Autowired
	EmployeeService empService;

	@PostMapping("/saveemployee")
	public String AddEmployee(@RequestBody Employee employee)
	{
		System.out.println("-----------------------");
		boolean b = empService.AddEmployee(employee);
		if(b)
		{
			return "User Saved in database";
		}
		else
		{
			return "Record Not Saved";
		}		
	}
	
	@GetMapping(value="/viewdata")
	public List<Employee> getAllEmp() throws Exception
	{
		List<Employee> list = empService.getAllEmployee();
		if(list.size() !=0)
		{
			return list;
		}
		else
		{
			throw new EmployeeNotFoundException("There is No data In Database");
		}
	}
	
	@GetMapping(value="/findbyname/{n}")
	public Employee findByName(@PathVariable("n")String name)
	{
		Employee e = empService.SearchByname(name);
		return e;
	}
	@GetMapping("/searchbyid/{n}")
	public Optional<Employee> findById(@PathVariable("n") int employee_number)
	{
		Optional<Employee> e = empService.getEmployeeById(employee_number);
		return e;
	}
	
	@GetMapping(value="/findbysalary/{s}")
	public Employee findBySalary(@PathVariable("s") int salary)
	{
		Employee e = empService.SearchBySalary(salary);
		return e;
	}
	
    @GetMapping("/findsalarybetween/{min}/{max}")
	public Employee findsalaryBetween(@PathVariable("min") int min,@PathVariable("max") int max )
	{
		Employee e = empService.SalaryBetween(min, max);
		return e;
	}
    
    @PutMapping("/updateById/{employee_number}")
    public Optional<Employee> UpdateById(@PathVariable("employee_number") Integer employee_number)
    {
    	Optional<Employee> e = empService.getEmployeeById(employee_number);
    	if(e!=null) 		
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
    	String msg = empService.deleteRecordById(employee_number);
		return msg;	
    }
}