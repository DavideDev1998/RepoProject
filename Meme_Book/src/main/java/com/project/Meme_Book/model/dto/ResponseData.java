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
    private String id_Argomento;
    private String nameArgomento;
    private List<Content> contenutoList_Argomento;
    private String id_Commento;
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
    private User creator_Content;
    private Argomento argomento_Content;
    private String id_Like;
    private User user;
    private String id_Preferito;
    private User userName;
    private ArrayList<Content> contents_Preferito;
    private String id_Profilizione;
    private User userName_Profilazione;
    private List<Like> like__Profilazione;
    private Argomento nomeArgomento_Profilazione;
    private String id_Segnalazione;
    private Content content;
    private User user_Segnalazione;
    private User creator_Segnalazione;
    private String url_Segnalazione;
    private String id_User;
    private String firstName_User;
    private String lastName_User;
    private Integer age_User;
    private String sex_User;
    private String userName_User;
    private String email_User;
    private String password_User;
    private String roleName_User;
    private String id_ValidationCheck;
    private String userName_ValidationCheck;
    private Boolean check_ValidationCheck;
}
