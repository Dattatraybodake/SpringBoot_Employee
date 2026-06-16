package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_Management.entity.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee findByName(String name);


	public Employee findBySalaryLessThan(int salary);


	public Employee findBySalaryBetween(int minsalary, int Maxsalary);

	Optional<Employee> findByUserName(String userName);

	boolean existsByUserName(String name);
}
