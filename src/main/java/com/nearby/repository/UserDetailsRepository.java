package com.nearby.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nearby.model.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {

}
