package com.example.Employee_Management.service;

import java.util.List;
import java.util.Optional;

import com.example.Employee_Management.entity.Employee;

public interface EmployeeService {
	public boolean AddEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Optional<Employee> getEmployeeById(Integer employee_number);
	public Employee SearchByname(String name);
	public Employee SearchBySalary(int salary);
	public Employee SalaryBetween(int minsalary, int Maxsalary);
	public String deleteRecordById(Integer employee_number);
}
