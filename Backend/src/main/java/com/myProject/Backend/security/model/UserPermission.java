package com.myProject.Backend.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_permission")
public class UserPermission {

    @Id
    private String id;

    @DBRef
    private User user;

    @DBRef
    private Role role;

    @DBRef
    private Set<Permission> userPermissions;

}
