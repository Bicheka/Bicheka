package com.bicheka.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bicheka.POJO.User;


public interface UserRepository extends MongoRepository<User, String> {
	Optional<User> findByUsername(String username);
}