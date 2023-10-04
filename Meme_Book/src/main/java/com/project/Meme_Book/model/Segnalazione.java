package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "segnalazione")
public class Segnalazione {
    @Id
    private String id;
    private Content content;
    private UserLogin user;
    private UserLogin creator;
    private String url;
}
