package com.myProject.Backend.security.service.impl;

import com.myProject.Backend.security.model.Permission;
import com.myProject.Backend.security.repository.PermissionRepository;
import com.myProject.Backend.security.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepo;

    @Override
    public String addPermission(Permission permission) {
        Optional<Permission> existing = permissionRepo.findByPermission(permission.getPermission());

        if (existing.isEmpty()) {
            permissionRepo.save(permission);
            return "New permission added " + permission.getPermission();
        }

        else return "Permission present";
    }

    @Override
    public List<Permission> getAllPermissions() {
        return permissionRepo.findAll();
    }
}
