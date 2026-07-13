package com.example.Employee_Management.service;

import java.util.List;

import com.example.Employee_Management.entity.Company;

public interface CompanyService {
	public boolean createCompany(Company company);
	public List<Company> getAllCompanies();
}
