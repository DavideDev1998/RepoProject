package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "validationCheck")
public class ValidationCheck {
    @Id
    @NonNull
    private String id;
    @NonNull
    @NotEmpty
    private String userName;
    @NonNull
    @NotEmpty
    private Boolean check;
}
