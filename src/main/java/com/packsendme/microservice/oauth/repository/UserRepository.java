package com.packsendme.microservice.oauth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<UserModel, String> {
	
	public UserModel findUserByUsername(String username);
	
	
}
