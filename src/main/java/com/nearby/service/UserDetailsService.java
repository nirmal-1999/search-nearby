package com.nearby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.nearby.model.UserDetails;

@Service
public class UserDetailsService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	// save user details
	public UserDetails saveUserDetails(UserDetails user) {
		UserDetails userDetails = mongoTemplate.save(user);
		return userDetails;
	}
	
	// search by name
	public List<UserDetails> searchByNameOrBlockOrPostOrVillage(String searchText) {
		Query query = new Query();
		query.addCriteria(new Criteria().orOperator(
				Criteria.where("name").regex(".*"+searchText+".*", "i"),
				Criteria.where("block").regex(".*"+searchText+".*", "i"),
				Criteria.where("village").regex(".*"+searchText+".*", "i"),
				Criteria.where("post").regex(".*"+searchText+".*", "i"),
				Criteria.where("district").regex(".*"+searchText+".*", "i")
				));
		List<UserDetails> userDetails = mongoTemplate.find(query, UserDetails.class);
		return userDetails;
	}
	
	// update user details
}
