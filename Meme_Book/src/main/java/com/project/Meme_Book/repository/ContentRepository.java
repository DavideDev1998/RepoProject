package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Content;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends MongoRepository<Content,String> { }
