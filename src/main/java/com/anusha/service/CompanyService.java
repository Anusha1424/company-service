package com.anusha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusha.core.Company;
import com.anusha.dao.CompanyDao;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyDao companyDao;
	
	public Company getCompanyByCompanyCode(String companyCode) throws Exception{
		Company company = new Company();
		try {
			company = companyDao.findByCompanyCode(companyCode);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return company;
	}

	public List<Company> getAllCompanies() throws Exception{
		List<Company> companyList = new ArrayList<Company>();
		try {
			companyList = companyDao.findAll();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return companyList;
	}
	

	public void registerCompany(Company company) throws Exception{
		try {
			companyDao.save(company);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public void deleteCompany(String companyCode) throws Exception{
		Company company = new Company();
		try {
			company = companyDao.findByCompanyCode(companyCode);
			companyDao.delete(company);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
