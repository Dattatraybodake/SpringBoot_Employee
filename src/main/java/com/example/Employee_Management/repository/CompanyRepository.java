package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee_Management.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
