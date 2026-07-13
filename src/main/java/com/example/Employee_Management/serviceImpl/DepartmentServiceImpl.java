package com.example.Employee_Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employee_Management.entity.Department;
import com.example.Employee_Management.repository.DepartmentRepository;
import com.example.Employee_Management.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public boolean SaveDepartments(Department department) {
		return departmentRepository.save(department)!=null?true:false;
	}

	@Override
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}
}