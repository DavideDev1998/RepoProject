package com.project.Meme_Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.project.Meme_Book.map")
public class MemeBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemeBookApplication.class, args);
    }
}
