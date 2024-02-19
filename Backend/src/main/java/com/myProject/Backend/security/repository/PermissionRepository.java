package com.myProject.Backend.security.repository;

import com.myProject.Backend.security.model.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionRepository extends MongoRepository<Permission, String> {

    Optional<Permission> findByPermission(String permission);
}
