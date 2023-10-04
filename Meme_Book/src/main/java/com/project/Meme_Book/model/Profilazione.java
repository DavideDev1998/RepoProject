package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "profilazione")
public class Profilazione {

    private String id;
    private UserLogin userName;
    private Like[] like;
    private Argomento nomeArgomento;
}
