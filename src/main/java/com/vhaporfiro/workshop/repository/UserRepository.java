package com.vhaporfiro.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vhaporfiro.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
