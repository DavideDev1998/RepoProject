package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "argomento")
public class Argomento {
    @Id
    @NonNull
    private String id;
    @NonNull
    private String nameArgomento;

    private List<Content> contenutoList;
}
