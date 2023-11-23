package com.project.Meme_Book.controller;

import com.project.Meme_Book.service.impl.ContentServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@Log4j2
@RestController
@RequestMapping("content")
public class HomePageController {

    @Autowired
    ContentServiceImpl contentService;


    @GetMapping("/findAll")
    private List<Object> findAll(){
        return contentService.findAll();
    }


}
