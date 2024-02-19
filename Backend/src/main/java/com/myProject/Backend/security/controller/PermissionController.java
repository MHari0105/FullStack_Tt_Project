package com.myProject.Backend.security.controller;

import com.myProject.Backend.security.model.Permission;
import com.myProject.Backend.security.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping
    public ResponseEntity<String> createPermission(@RequestBody Permission permission) {
        return new ResponseEntity<>(permissionService.addPermission(permission), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Permission>> listAllPermissions() {
        return new ResponseEntity<>(permissionService.getAllPermissions(), HttpStatus.OK);
    }

}
