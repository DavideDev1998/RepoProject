package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository  extends MongoRepository<Like, String> {
}
