package com.example.Employee_Management.service;

import java.util.List;
import com.example.Employee_Management.entity.Education;

public interface EducationService{
	public boolean addEducation(Education eductaion);
	public List<Education> showEducation();
}