package com.example.Corsa.Cavalli.repository;

import com.example.Corsa.Cavalli.model.Cavallo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CavalloRepository extends JpaRepository<Cavallo,Integer> {


}
