package com.example.Employee_Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employee_Management.entity.Education;
import com.example.Employee_Management.repository.EducationRepository;
import com.example.Employee_Management.service.EducationService;

public class EducationServiceImpl implements EducationService{

	@Autowired
	EducationRepository educationRepository;
	
	@Override
	public boolean addEducation(Education education) {
	return educationRepository.save(education)!=null?true:false;
	}

	@Override
	public List<Education> showEducation() {
		return educationRepository.findAll();
	}
}