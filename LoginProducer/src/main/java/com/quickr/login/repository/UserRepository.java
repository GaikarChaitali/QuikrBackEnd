package com.quickr.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quickr.login.model.UserRegistrationAccount;

public interface UserRepository extends MongoRepository<UserRegistrationAccount, String>{
	
}
