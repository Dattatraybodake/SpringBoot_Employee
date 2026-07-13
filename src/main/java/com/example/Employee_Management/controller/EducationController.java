package com.example.Employee_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.Education;
import com.example.Employee_Management.service.EducationService;

@RestController
public class EducationController {
	
	@Autowired
	EducationService educationService;
	
	@PostMapping
	public String saveEducation(@RequestBody Education education)
	{
		boolean b = educationService.addEducation(education);
		if(b)
		{
			return "Company Saved Successfully";
		}
		else
		{
			return"problem Occurs in saved Data";
		}
	}
	
	@GetMapping
	public List<Education> displayEducation()
	{
		return educationService.showEducation();
	}
}