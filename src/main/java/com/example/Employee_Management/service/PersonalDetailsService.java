package com.example.Employee_Management.service;

import java.util.List;

import com.example.Employee_Management.entity.PersonalDetails;

public interface PersonalDetailsService {
	public boolean saveDetails(PersonalDetails personaldetails);
	public List<PersonalDetails> viewDetails();
}