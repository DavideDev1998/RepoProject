package com.project.Meme_Book.controller;

import com.project.Meme_Book.map.ConvertMapper;
import com.project.Meme_Book.model.*;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import com.project.Meme_Book.service.impl.*;
import jakarta.websocket.server.PathParam;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        List<Commento> commenti = new ArrayList<>();

        for(int i = 0; i < request.getCommentoList_Content().size(); i++){

            Commento commento = request.getCommentoList_Content().get(i);

            User user = commento.getCreatorCommento();

            commento.setCreatorCommento((User) userRepository.findById(user.getId()));

            commenti.add(commento);
        }

        contentRepository.save(Content.builder()
                .id(content.getId())
                .url(content.getUrl())
                .creator(content.getCreator())
                .creationDate(content.getCreationDate())
                .modifyDate(request.getModifyDate())
                .commento(commenti)
                .build());

        log.info("Inserimento avvenuto con successo");


    }

    @PostMapping("/IlikeIt")
    public void insertLikeToContent(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        List<Like> likes = new ArrayList<>();

        for(int i = 0; i < request.getLike_Content().size(); i++){

            Like like = request.getLike_Content().get(i);

            User user = like.getUser();

            like.setUser((User) userRepository.findById(user.getId()));

            likes.add(like);
        }

        contentRepository.save(Content.builder()
                .id(content.getId())
                .url(content.getUrl())
                .creator(content.getCreator())
                .creationDate(content.getCreationDate())
                .modifyDate(request.getModifyDate())
                .like(likes)
                .build());

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

