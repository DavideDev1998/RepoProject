package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Commento;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ContentRepository extends MongoRepository<Content,String> {
    @Query("{ 'creator' : ?0 }")
    <T> Object findByUser(User user);

}


