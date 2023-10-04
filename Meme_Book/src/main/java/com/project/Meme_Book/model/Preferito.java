package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "preferito")
public class Preferito {
    @Id
    @NonNull
    private String id;
    @NonNull
    private User userName;
    @NonNull
    @NotEmpty
    private ArrayList<Content> contents;

}
