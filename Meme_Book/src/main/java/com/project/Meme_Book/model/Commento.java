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

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "commento")
public class Commento {
    @Id
    private String id;
    private List<Like> like;
    @NonNull
    @NotEmpty
    private String commento;

    @NonNull
    @NotEmpty
    private User creatorCommento;

    @NonNull
    private Date creationDate;

}
