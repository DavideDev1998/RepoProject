package com.project.Meme_Book.controller;

import com.project.Meme_Book.map.ConvertMapper;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import com.project.Meme_Book.service.impl.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    ConvertMapper mapper;

    //"/CreationContent/f"//
    @GetMapping("/f")
    public List<Content> findAllDocument() {return contentRepository.findAll();}
    //"/CreationContent/insert"//
    @GetMapping("/insert")
    public void insertContent(@RequestBody RequestData request) {

        //Annotation @SuperBuilder
        contentRepository.save(Content.builder().creator(request.getCreator_Content()).creationDate(request.getCreationDate_Content())
                               .url(request.getUrl_Content()).condivisioni(request.getCondivisioni_Content()).
                               didascalia(request.getDidascalia_Content()).argomento(request.getArgomento_Content()).build());

        System.out.println("Inserimento avvenuto con successo");

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseData> getUserById(@PathVariable Integer id) {
        User user = (User) userRepository.findById(id);
        ResponseData response = mapper.convertToDTO(user);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/s")
    public void testProvaSuperCostructor() {
     userRepository.save(
             User.builder().age(18).
    email("www.prova@email.it")
                     .sex("Male")
                        .firstName("Lollo")
                        .lastName("il Pop")
                        .password("Password")
                        .roleName("User")
                        .userName("13sempre")
                     .build());}
}

