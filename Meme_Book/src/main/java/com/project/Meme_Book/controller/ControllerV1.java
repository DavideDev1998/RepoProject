package com.project.Meme_Book.controller;

import com.project.Meme_Book.model.UserLogin;
import com.project.Meme_Book.service.impl.UserLoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
public class ControllerV1 {

    @Autowired
    UserLoginServiceImpl repository;

    @GetMapping("/")
    public void insertDocument() {
        UserLogin user = new UserLogin();
        user.setId("1");
        user.setEmail("francescazannella91@gmail.com");
        user.setPassword("PincoPallino98!");
        user.setRoleName("Admin");

        repository.save(user);

        System.out.println("Documento inserito con successo.");
    }
}

