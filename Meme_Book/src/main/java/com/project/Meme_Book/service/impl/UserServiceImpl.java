package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.User;
import com.project.Meme_Book.repository.UserRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements GenericsService {
    @Autowired
    UserRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((User) p);
    }

    @Override
    public  List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public <T> Object findById(String id) {
        return repository.findById(id).get();
    }
}
