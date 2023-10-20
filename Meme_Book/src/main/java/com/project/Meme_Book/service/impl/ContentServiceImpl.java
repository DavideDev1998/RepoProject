package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.Commento;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import com.project.Meme_Book.repository.ContentRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class ContentServiceImpl implements GenericsService {
    @Autowired
    ContentRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((Content) p);
    }

    @Override
    public <T> List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public <T> Object findById(String id) {
        return repository.findById(id).get();
    }

    public <T> Object findByUser(User user){
        return repository.findByUser(user);
    }

}
