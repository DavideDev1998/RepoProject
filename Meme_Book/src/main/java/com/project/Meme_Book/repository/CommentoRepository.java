package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Commento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentoRepository extends MongoRepository<Commento,String> {
}
