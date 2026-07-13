package com.example.Employee_Management.service;

import java.util.List;
import com.example.Employee_Management.entity.Department;
public interface DepartmentService {
	
	public boolean SaveDepartments(Department department);
	public List<Department> getDepartment();

}
