package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee_Management.entity.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
