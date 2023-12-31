package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "like")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Like {
    @Id
    @NonNull
    private String id;
    @NonNull
    @NotEmpty
    private User user;
}
