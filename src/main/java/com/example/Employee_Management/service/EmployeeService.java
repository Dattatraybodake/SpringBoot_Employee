package com.example.Employee_Management.service;
import java.util.List;

import com.example.Employee_Management.entity.Employee;
public interface EmployeeService
{
	public boolean SaveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee SearchByName(String employee_name);
}
