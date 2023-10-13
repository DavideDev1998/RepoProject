package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Document(collection = "content")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Content {
    @Id

    private String id;

    @NonNull
    @NotEmpty
    private String url;

    private String didascalia;

    @NonNull
    private Date creationDate;

    private Date modifyDate;

    private List<Commento> commento;

    private List<Like> like;

    private Integer condivisioni;

    @NonNull
    private User creator;

    @NonNull
    @NotEmpty
    private Argomento argomento;
}
