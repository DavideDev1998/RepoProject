package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.User;
import com.project.Meme_Book.repository.UserRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements GenericsService {
    @Autowired
    UserRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((User) p);
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
