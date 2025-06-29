package com.example.Employee_Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD.entity.Register;
import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository emprepo;

	public boolean AddEmployee(Employee employee)
	{
		return emprepo.save(employee)!=null?true:false;
	}
	
	public List<Employee> getAllEmployee()
	{
		return emprepo.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Integer employee_number)
	{
		return emprepo.findById(employee_number);
		
	}
	
	public Employee SearchByname(String name)
	{
		Employee e = emprepo.findByName(name);
		return e;
	}
	
	public Employee SearchBySalary(int salary)
	{
		Employee e = emprepo.findBySalaryLessThan(salary);
		return e;
	}
	
	public Employee SalaryBetween(int minsalary, int Maxsalary)
	{
		Employee e = emprepo.findBySalaryBetween(minsalary, Maxsalary);
		return e;
	}
	
	public String deleteRecordById(Integer employee_number)
	{
		Optional<Employee> o = emprepo.findById(employee_number);
		if(o.isPresent())
		{	
			emprepo.deleteById(employee_number);
			return "Employee Delete Successfully";	
		}
		else
		{
			return "Employee Not Found";
		}
	}
}