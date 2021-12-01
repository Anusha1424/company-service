package com.anusha.core;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.anusha.common.PrimaryKeyListener;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import lombok.Data;

@Data
@MappedSuperclass
@JsonIdentityInfo(generator=JSOGGenerator.class) 
@EntityListeners(PrimaryKeyListener.class)
public class BaseEntity {

	@Id
	@Column(name="id", unique=true, nullable=false)
	private String id;
}

