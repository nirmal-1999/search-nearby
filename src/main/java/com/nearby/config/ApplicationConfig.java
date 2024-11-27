package com.nearby.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.nearby.model.ApplicationMasterEntity;
import com.nearby.repository.ApplicationMasterRepository;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
public class ApplicationConfig {
	
	@Autowired
	private ApplicationMasterRepository masterRepository;
	
	private ApplicationMasterEntity mySql;
	
	@PostConstruct
	public void initilize() {
		
		setMySql(masterRepository.findByTargetName("Mongo").get());
	}
}
