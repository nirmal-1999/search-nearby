package com.nearby.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document(collection = "persion_details")
public class UserDetails {
	
	@Id
	private String user_id;
	
	private String name;
	
	private String mobile;
	
	private String email;
	
	private String country;
	
	private String state;
	
	private String district;
	
	private String block;
	
	private String post;
	
	private String village;
	
	private String address;
	
	private String name_pic;
	
	private List<String> optional_pic;
}
