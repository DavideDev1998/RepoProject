package com.project.Meme_Book.controller;

import com.project.Meme_Book.map.ConvertMapper;
import com.project.Meme_Book.model.*;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.model.dto.ResponseData;
import com.project.Meme_Book.service.impl.*;
import com.project.Meme_Book.utils.MethodsUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Log
@RestController
@RequestMapping("/CreationContent")
public class ControllerV1 {

    @Autowired
    ArgomentoServiceImpl argsRepository;
    @Autowired
    ContentServiceImpl contentRepository;
    @Autowired
    UserServiceImpl userRepository;
    @Autowired
    ConvertMapper mapper;
    @Autowired
    MethodsUtils utils;

    @GetMapping("/f")
    public List<Content> findAllDocument() {
        return contentRepository.findAll();
    }
    @PostMapping("/insertContent")
    public void insertContent(@RequestBody RequestData request) {
        contentRepository.save(Content.builder()
                .creator((User) userRepository.findById(request.getId_User()))
                .creationDate(request.getCreationDate())
                .url(request.getUrl_Content())
                .condivisioni(request.getCondivisioni_Content())
                .didascalia(request.getDidascalia_Content())
                .argomento((Argomento) argsRepository.findById(request.getId_Argomento()))
                .build());
        log.info("Inserimento avvenuto con successo");


    }
    @GetMapping("/findContent")
    public List <Content> findAll(){
        return contentRepository.findAll();
    }

    @PostMapping("/insertComment")
    public void insertCommento(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        utils.createCommentMap(content, utils.generateUniqueString(), new Commento(null, request.getCommento(), (User) userRepository.findById(request.getId_User()), request.getCreationDate()));

        contentRepository.save(content);

        log.info("Inserimento avvenuto con successo");

    }

    @PostMapping("/IlikeIt")
    public void insertLikeToContent(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        User user = (User) userRepository.findById(request.getId_User());

        utils.createLikeMap(content, user.getId(), user.getUserName());

        contentRepository.save(content);

        log.info("Inserimento avvenuto con successo");

    }

    @PostMapping("/IlikeComment")
    public void insertLikeToComment(@RequestBody RequestData request) {

        Content content = (Content) contentRepository.findById(request.getId_Content());

        Commento commento = content.getCommento().get(request.getId_commento());

        User user = (User) userRepository.findById(request.getId_User());


        utils.createLikeCommentMap(commento, user.getId(), user.getUserName());

        utils.createCommentMap(content, request.getId_commento(), commento);

        contentRepository.save(content);

        log.info("Inserimento avvenuto con successo");

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseData> getUserById(@PathVariable("id") String id) {
        return ResponseEntity.ok(mapper.convertToDTO(userRepository.findById(id)));
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseData> getContentrByUser(@PathVariable("id") String id) {
//        List<Content> contentList = null;
//
//
//        return ResponseEntity.ok(mapper.convertToDTO((User) userRepository.findById(id)));
//    }

    @GetMapping("/ContentUser/{userName}")
    public ResponseEntity<List<ResponseData>> getContentByUserId(@PathVariable("userName") String userName) {
        return ResponseEntity.ok(mapper.convertToDTOList(contentRepository.findByUser(userName)));
    }

    @GetMapping("/Comments/{contentId}")
    public ResponseEntity<ResponseData> getComments(@PathVariable("contentId") String id) {
        return ResponseEntity.ok(mapper.convertToDTO((Content) contentRepository.findById(id)));
    }


}

