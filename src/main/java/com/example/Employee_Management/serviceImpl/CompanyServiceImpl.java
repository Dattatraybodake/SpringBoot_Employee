package com.example.Employee_Management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Employee_Management.entity.Company;
import com.example.Employee_Management.repository.CompanyRepository;
import com.example.Employee_Management.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public boolean createCompany(Company company) {
		// TODO Auto-generated method stub
		return companyRepository.save(company)!=null?true:false;
	}

	@Override
	public List<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}
}
