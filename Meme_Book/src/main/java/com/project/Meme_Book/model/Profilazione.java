package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document(collection = "profilazione")
public class Profilazione {
    @Id

    private String id;
    @NonNull
    @NotEmpty
    private User userName;
    @NonNull
    @NotEmpty
    private List<Like> like;
    @NonNull
    @NotEmpty
    private Argomento nomeArgomento;
}
