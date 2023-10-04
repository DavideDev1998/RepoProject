package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Preferito;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferitoRepository extends MongoRepository<Preferito, String> {
}
