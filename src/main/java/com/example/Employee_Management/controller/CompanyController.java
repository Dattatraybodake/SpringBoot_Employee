package com.example.Employee_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management.entity.Company;
import com.example.Employee_Management.service.CompanyService;

@RestController

public class CompanyController {

	@Autowired
	CompanyService companyService;

	@PostMapping
	public String SaveCompany(@RequestBody Company company)
	{
		System.out.println("==========");
		boolean b = companyService.createCompany(company);
		if(b)
		{
			return "Company Saved Succesffuly";
		}
		else
		{
			return "Problem Occurs in saved data";
		}
	}

	@GetMapping
	public List<Company> getAllCompany()
	{
		return companyService.getAllCompanies();
	}
}