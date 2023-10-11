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
//questa annotation garantisce che in caso di NULL l'applicazione non invii eccezioni ma restituisca solo i campi valorizzati
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestData {
    private String id_Argomento;
    private String nameArgomento;
    private List<Content> contenutoList_Argomento;
    private List<Like> like_Commento;
    private String commento;
    private String id_Content;
    private String url_Content;
    private String didascalia_Content;
    private Date creationDate;
    private Date modifyDate;
    private String creatorCommento;
    private List<Commento> commentoList_Content ;
    private List<Like> like_Content;
    private Integer condivisioni_Content;
    private String creator_Content;
    private String argomento_Content;
    private String id_Preferito;
    private String userName;
    private ArrayList<Content> contents_Preferito;
    private String id_Profilizione;
    private String userName_Profilazione;
    private List<Like> like__Profilazione;
    private String nomeArgomento_Profilazione;
    private String id_Segnalazione;
    private String user_Segnalazione;
    private String creator_Segnalazione;
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
