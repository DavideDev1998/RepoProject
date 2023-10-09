package com.project.Meme_Book.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.project.Meme_Book.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {
    private String nameArgomento;
    private List<Content> contenutoList_Argomento;
    private List<Like> like_Commento;
    private String commento;
    private String id_Content;
    private String url_Content;
    private String didascalia_Content;
    private Date creationDate_Content;
    private Date modifyDate_Content;
    private List<Commento> commentoList_Content;
    private List<Like> like_Content;
    private Integer condivisioni_Content;
    private String creator_Content;
    private String argomento_Content;
    private String userName;
    private List<Content> contents_Preferito;
    private String userName_Profilazione;
    private List<Like> like__Profilazione;
    private String nomeArgomento_Profilazione;
    private String user_Segnalazione;
    private String creator_Segnalazione;
    private String url_Segnalazione;
    private String firstName_User;
    private String lastName_User;
    private Integer age_User;
    private String sex_User;
    private String userName_User;
    private String email_User;
    private String roleName_User;
}