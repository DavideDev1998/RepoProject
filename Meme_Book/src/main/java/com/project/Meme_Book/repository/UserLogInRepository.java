package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.UserLogin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogInRepository extends MongoRepository<UserLogin,String> { }
