package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Argomento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArgomentoRepository extends MongoRepository<Argomento,String> { }
