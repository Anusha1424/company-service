package com.anusha.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.anusha.core.Company;
import com.anusha.service.CompanyService;

@RestController
@RequestMapping("/api/v1.0/market/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/info/{companyCode}",method = RequestMethod.GET)
	public Company echoStudentName(@PathVariable(name = "companyCode") String companyCode) {
		Company company = new Company();
		try {
			
		company = companyService.getCompanyByCompanyCode(companyCode);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return company;
	}

	@RequestMapping(value = "/getall",method = RequestMethod.GET)
	public List<Company> getAllCompanies() {
		List<Company> companyList = new ArrayList<Company>();
		try {
			companyList = companyService.getAllCompanies();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return companyList;
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public void register(Company company) {
		try {
			if(StringUtils.isNotBlank(company.getCompanyCode())) {
				companyService.registerCompany(company);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@RequestMapping(value = "/delete/{companyCode}",method = RequestMethod.DELETE)
	public void delete(@PathVariable(name = "companyCode") String companyCode) {
		try {
			if(StringUtils.isNotBlank(companyCode)) {
				companyService.deleteCompany(companyCode);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
