package com.example.Corsa.Cavalli.repository;

import com.example.Corsa.Cavalli.model.Cavallo;
import com.example.Corsa.Cavalli.model.Classifica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassificaRepository extends JpaRepository<Classifica, Integer> {
    @Query(value = "Update Classifica SET punteggio = :punteggio  where id = :id", nativeQuery = true)
    public void setPunteggio(@Param("punteggio") Integer punteggio, @Param("id") Integer id);


    //    @Query(value = "SELECT * FROM classifica ORDER BY punteggio DESC", nativeQuery = true)
//    public List<Classifica> classificaByDesc();

    @Query(value = "DELETE FROM classifica", nativeQuery = true)
    public void delete();
}