package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.ValidationCheck;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ValidationCheckRepository extends MongoRepository<ValidationCheck, String> {
}
