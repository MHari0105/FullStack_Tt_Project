package com.myProject.Backend.security.repository;

import com.myProject.Backend.security.model.UserPermission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPermissionRepository extends MongoRepository<UserPermission, String> {

}
