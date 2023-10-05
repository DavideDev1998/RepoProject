package com.project.Meme_Book.controller;

import com.project.Meme_Book.model.Argomento;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.service.impl.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Log
@RestController
@RequestMapping("/CreationContent")
public class ControllerV1 {

    @Autowired
    ArgomentoServiceImpl argsRepository;

    @Autowired
    ContentServiceImpl contentRepository;

    @Autowired
    PreferitoServiceImpl preferitoRepository;

    @Autowired
    ValidationCheckServiceImpl validationRepository;

    @Autowired
    UserServiceImpl userRepository;

    @Autowired
    SegnalazioneServiceRepository segnalazioneRepository;

    @Autowired
    ProfilazioneServiceImpl profilazioneRepository;

    @GetMapping("/f")
    public List<Content> findAllDocument() {return contentRepository.findAll();}

    @GetMapping("/insert")
    public void insertContent(@RequestBody RequestData request ) {


        }
        }

