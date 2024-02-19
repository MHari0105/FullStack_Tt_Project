package com.myProject.Backend.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String userId;

    private String username;

    private String firstName;

    private String lastName;

    private String gender;

    private String email;

    private String password;

    @DBRef
    private Role role;

    @DBRef
    private List<Permission> permissions;

}

