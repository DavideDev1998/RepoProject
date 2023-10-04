package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Segnalazione;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegnalazioneRepository extends MongoRepository<Segnalazione, String> {
}
