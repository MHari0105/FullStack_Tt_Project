package com.myProject.Backend.security.repository;

import com.myProject.Backend.security.model.RolePermission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends MongoRepository<RolePermission, String> {

}
