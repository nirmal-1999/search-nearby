package com.nearby.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonDetailsDto {
	
	private String user_id;
	
	private String full_name;
	
	private String mobile_no;
	
	private String email_id;
	
	private String country;
	
	private String state;
	
	private String district;
	
	private String block_name;
	
	private String post_office;
	
	private String address;
	
	private String name_pic;
	
	private List<String> optional_pic;
}
