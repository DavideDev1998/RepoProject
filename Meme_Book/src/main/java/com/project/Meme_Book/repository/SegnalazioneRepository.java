package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Segnalazione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SegnalazioneRepository extends MongoRepository<Segnalazione, String> {
}
