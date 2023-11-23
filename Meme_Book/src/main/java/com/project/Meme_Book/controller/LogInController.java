package com.project.Meme_Book.controller;

import com.project.Meme_Book.model.User;
import com.project.Meme_Book.model.dto.RequestData;
import com.project.Meme_Book.service.impl.UserServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@Log4j2
@RestController
@RequestMapping("logIn")
public class LogInController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping("/checkUser")
    public Boolean checkUser(@RequestBody RequestData request) {
        log.info(request);
        for (User user : userService.findAll()) {
            log.info(user);
            if (user.getUserName().equalsIgnoreCase(request.getUserName_User()) && user.getPassword().equalsIgnoreCase(request.getPassword_User())) {
                log.info(user);
                return true;
            } else {
                return false;
            }
        }
        return null;
    }
}
