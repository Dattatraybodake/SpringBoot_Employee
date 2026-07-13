package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee_Management.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
