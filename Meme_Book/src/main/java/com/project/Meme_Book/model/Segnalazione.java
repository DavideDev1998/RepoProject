package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "segnalazione")
public class Segnalazione {
    @Id

    private String id;
    @NonNull
    @NotEmpty
    private Content content;
    @NonNull
    @NotEmpty
    private User user;
    @NonNull
    @NotEmpty
    private User creator;
    @NonNull
    @NotEmpty
    private String url;
}
