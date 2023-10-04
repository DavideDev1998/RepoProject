package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.Preferito;
import com.project.Meme_Book.model.User;
import com.project.Meme_Book.repository.PreferitoRepository;
import com.project.Meme_Book.repository.UserRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PreferitoServiceImpl implements GenericsService {
    @Autowired
    PreferitoRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((Preferito) p);
    }

    @Override
    public <T> List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public <T> Object findById(Integer id) {
        return repository.findById(String.valueOf(id));
    }
}
