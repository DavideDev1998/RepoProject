package com.project.Meme_Book.repository;

import com.project.Meme_Book.model.Profilazione;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilazioneRepository extends MongoRepository<Profilazione, String> {
}
