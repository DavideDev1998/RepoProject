package com.project.Meme_Book.controller;

import com.project.Meme_Book.map.ConvertMapper;
import com.project.Meme_Book.model.*;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import com.project.Meme_Book.service.impl.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<Content> findAllDocument() {
        return contentRepository.findAll();
    }

    //"/CreationContent/insert"//
    @PostMapping("/insertContent")
    public void insertContent(@RequestBody RequestData request) {

        contentRepository.save(Content.builder()
                .creator((User) userRepository.findById(request.getId_User()))
                .creationDate(request.getCreationDate())
                .url(request.getUrl_Content())
                .condivisioni(request.getCondivisioni_Content())
                .commento(request.getCommentoList_Content())
                .didascalia(request.getDidascalia_Content())
                .argomento((Argomento) argsRepository.findById(request.getId_Argomento()))
                .build());
        log.info("Inserimento avvenuto con successo");


    }

    @PostMapping("/insertComment")
    public void insertCommento(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        Commento commento = new Commento(null,request.getCommento(),(User)userRepository.findById(request.getId_User()),request.getCreationDate());

        if(content.getCommento() == null){

            List<Commento> commenti = new ArrayList<>();
            commenti.add(commento);
            content.setCommento(commenti);

        }else{

            content.getCommento().add(commento);

        }
        contentRepository.save(content);

        log.info("Inserimento avvenuto con successo");

    }

    @PostMapping("/IlikeIt")
    public void insertLikeToContent(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        Like like = new Like((User)userRepository.findById(request.getId_User()));

        if(content.getLike() == null){

            List<Like> likes = new ArrayList<>();
            likes.add(like);
            content.setLike(likes);

        }else{

            content.getLike().add(like);

        }

        contentRepository.save(content);

        log.info("Inserimento avvenuto con successo");


    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseData> getUserById(@PathVariable("id") String id) {
        return ResponseEntity.ok(mapper.convertToDTO((User) userRepository.findById(id)));
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
                        .build());
    }
}

