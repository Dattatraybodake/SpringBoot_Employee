package com.example.Employee_Management.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.repository.EmployeeRepository;
import com.example.Employee_Management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public boolean SaveEmployee(Employee employee) {
		return employeeRepository.save(employee)!=null?true:false;
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee SearchByName(String employee_name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}