package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "like")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Like {

    private String id;
    private UserLogin user;
}
