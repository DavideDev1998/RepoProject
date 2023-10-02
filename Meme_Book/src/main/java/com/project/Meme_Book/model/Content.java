package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    private String id;
    private String url;
    private String didascalia;
    private Date creationDate;
    private Date modifyDate;
    private List<Commento> commento;
    private Integer like;
    private Integer condivisioni;
    private UserLogin creator;
    private Argomento argomento;
}
