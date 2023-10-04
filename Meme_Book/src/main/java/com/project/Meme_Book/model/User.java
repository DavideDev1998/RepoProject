package com.project.Meme_Book.model;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @NonNull
    private String id;
    @NonNull
    @NotEmpty
    private String firstName;
    @NonNull
    @NotEmpty
    private String lastName;
    @NonNull
    @NotEmpty
    private Integer age;
    @NonNull
    @NotEmpty
    private String sex;
    @NonNull
    @NotEmpty
    private String userName;
    @NonNull
    @NotEmpty
    private String email;
    @NonNull
    @NotEmpty
    private String password;
    @NonNull
    @NotEmpty
    private String roleName;

}
