package com.project.Meme_Book.controller;

import com.project.Meme_Book.model.UserLogin;
import com.project.Meme_Book.service.impl.UserLoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerV1 {

    private final UserLoginServiceImpl repository;

    @GetMapping("/")
    public void insertDocument() {
        UserLogin user = new UserLogin();
        user.setId("value2");
        user.setEmail("value2");
        user.setPassword("Value2");
        user.setRoleName("USER");

        repository.save(user);

        System.out.println("Documento inserito con successo.");
    }
}

