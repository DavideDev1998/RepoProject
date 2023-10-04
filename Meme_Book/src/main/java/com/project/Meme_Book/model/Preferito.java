package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "preferito")
public class Preferito {
    @Id
    private String id;
    private UserLogin userName;
    private ArrayList<Content> contents;

}
