package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Preferito;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PreferitoRepository extends MongoRepository<Preferito, String> {
}
