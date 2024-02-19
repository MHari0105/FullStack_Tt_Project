package com.myProject.Backend.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "role_permission")
public class RolePermission {

    @Id
    private String id;

    @DBRef
    private Role role;

    @DBRef
    private List<Permission> permissions;

}
