package com.arthurnovaisdev.workshopmongo.repository;

import com.arthurnovaisdev.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
