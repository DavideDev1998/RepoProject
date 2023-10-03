package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Commento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentoRepository extends MongoRepository<Commento,String> {
}
