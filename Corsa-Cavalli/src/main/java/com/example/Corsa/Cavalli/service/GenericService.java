package com.example.Corsa.Cavalli.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenericService {

        public <T> void save(T p);

        public <T> List<T> findAll();

        public <T> Object findById(Integer id);



}
