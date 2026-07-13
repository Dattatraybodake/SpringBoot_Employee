package com.example.Employee_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.PersonalDetails;
import com.example.Employee_Management.service.PersonalDetailsService;

@RestController
public class PersonalDetailsController {

	@Autowired
	PersonalDetailsService personaldetailservice;
	
	@PostMapping
	public String savePersonalDetails(@RequestBody PersonalDetails personaldetails)
	{
		boolean b = personaldetailservice.saveDetails(personaldetails);
		if(b)
		{
			return "Personal Details Saved";
			
		}
		else
		{
			return "Problem Occurs in saved data";
		}
	}
	@GetMapping
	public List<PersonalDetails> getAllDetails()
		{
			return personaldetailservice.viewDetails();
		}
}
