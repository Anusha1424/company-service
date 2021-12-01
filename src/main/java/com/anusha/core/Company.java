package com.anusha.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class Company extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

		
	@Column(name="company_code")
	private String companyCode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ceo")
	private String ceo;
	
	@Column(name="turnover")
	private String turnover;
	
	@Column(name="website")
	private String website;
	
	@Column(name="stockExchange")
	private String stockExchange;
	
	
}
