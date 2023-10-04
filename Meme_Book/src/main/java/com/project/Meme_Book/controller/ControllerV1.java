package com.project.Meme_Book.controller;

import com.project.Meme_Book.model.Argomento;
import com.project.Meme_Book.model.Content;
import com.project.Meme_Book.model.User;
import com.project.Meme_Book.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
//@RequiredArgsConstructor
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



    @GetMapping("/")
    public void insertDocument() {

        Date date = new Date();

        User user1 = new User("1", "Francesca", "Zannella", 25, "Female", "Coco", "francescazan@live.com", "CocoBandicoot97!", "Admin");
        User user2 = new User("2", "Davide", "Tafuri", 26, "Male", "Puzzone", "davidello98@hotmail.it", "CocoBandicoot97!", "Admin");
        User user3 = new User("3", "Tizio", "Caio", 25, "Male", "TizioCaio", "tizioecaio@gmail.com", "OkIlPrezzoeGiusto002!", "User");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        Argomento argomento1 = new Argomento("1", "Argomento_1",null);
        Argomento argomento2 = new Argomento("2", "Argomento_2", null);
        Argomento argomento3 = new Argomento("3", "Argomento_3", null);

        argsRepository.save(argomento1);
        argsRepository.save(argomento2);
        argsRepository.save(argomento3);

        Content content1 = new Content("1", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.milanotoday.it%2Fattualita%2Ftramonto-infuocato-rosso-3-settembre-2023.html&psig=AOvVaw0icNVmD6RqGPlOkT_RLilM&ust=1696508841702000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIDsx4iy3IEDFQAAAAAdAAAAABAE",
                                       "Tramonto",date,date,null,null,50, user1,argomento1);
        Content content2 = new Content("2", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.milanotoday.it%2Fattualita%2Ftramonto-infuocato-rosso-3-settembre-2023.html&psig=AOvVaw0icNVmD6RqGPlOkT_RLilM&ust=1696508841702000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIDsx4iy3IEDFQAAAAAdAAAAABAE",
                "Tramonto",date,date,null,null,50, user2,argomento2);
        Content content3 = new Content("3", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.milanotoday.it%2Fattualita%2Ftramonto-infuocato-rosso-3-settembre-2023.html&psig=AOvVaw0icNVmD6RqGPlOkT_RLilM&ust=1696508841702000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIDsx4iy3IEDFQAAAAAdAAAAABAE",
                "Tramonto",date,date,null,null,50, user3,argomento3);

        contentRepository.save(content1);
        contentRepository.save(content2);
        contentRepository.save(content3);

        List<Content> contenutoList1 = new ArrayList<>();
        contenutoList1.add(content1);
        contenutoList1.add(content2);

        List<Content> contenutoList2 = new ArrayList<>();
        contenutoList2.add(content2);
        contenutoList2.add(content3);

        System.out.println("Documents inserito con successo.");
    }
}

