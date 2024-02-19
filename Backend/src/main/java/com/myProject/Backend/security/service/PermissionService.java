package com.myProject.Backend.security.service;

import com.myProject.Backend.security.model.Permission;

import java.util.List;

public interface PermissionService {

    public String addPermission(Permission permission);
    public List<Permission> getAllPermissions();

}
