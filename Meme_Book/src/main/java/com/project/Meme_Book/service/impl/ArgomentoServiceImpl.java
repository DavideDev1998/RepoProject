package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.Argomento;
import com.project.Meme_Book.repository.ArgomentoRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArgomentoServiceImpl implements GenericsService {
    @Autowired
    ArgomentoRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((Argomento) p);
    }

    @Override
    public <T> List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public <T> Object findById(String id) {
        return repository.findById(id).get();
    }
}
