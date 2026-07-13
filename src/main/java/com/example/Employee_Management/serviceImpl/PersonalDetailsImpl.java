package com.example.Employee_Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employee_Management.entity.PersonalDetails;
import com.example.Employee_Management.repository.PersonalDetailsRepository;
import com.example.Employee_Management.service.PersonalDetailsService;

public class PersonalDetailsImpl implements PersonalDetailsService  {

	@Autowired
	PersonalDetailsRepository personalDetailsRepository;
	@Override
	public boolean saveDetails(PersonalDetails personaldetails) {
		return personalDetailsRepository.save(personaldetails)!=null?true:false;
	}

	@Override
	public List<PersonalDetails> viewDetails() {
		// TODO Auto-generated method stub
		return personalDetailsRepository.findAll();
	}
}