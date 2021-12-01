package com.anusha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anusha.core.Company;

public interface CompanyDao extends JpaRepository<Company, String> {
	
	 Company findByCompanyCode(String companyCode);
	
}
