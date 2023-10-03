package com.project.Meme_Book.service.impl;

import com.project.Meme_Book.model.UserLogin;
import com.project.Meme_Book.repository.UserLogInRepository;
import com.project.Meme_Book.service.GenericsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLoginServiceImpl implements GenericsService {
    @Autowired
    UserLogInRepository repository;
    @Override
    public <T> void save(T p) {
        repository.save((UserLogin) p);
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