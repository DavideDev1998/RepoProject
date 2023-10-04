package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.ValidationCheck;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationCheckRepository extends MongoRepository<ValidationCheck, String> {
}
