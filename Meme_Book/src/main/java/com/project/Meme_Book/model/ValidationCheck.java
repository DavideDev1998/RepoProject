package com.project.Meme_Book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "validationCheck")
public class ValidationCheck {

    private String id;
    private String userName;
    private boolean check;
}
