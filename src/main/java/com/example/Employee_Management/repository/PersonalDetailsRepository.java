package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_Management.entity.PersonalDetails;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long>{
}
