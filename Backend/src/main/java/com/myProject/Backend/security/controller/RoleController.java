package com.myProject.Backend.security.controller;

import com.myProject.Backend.security.model.Role;
import com.myProject.Backend.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public ResponseEntity<String> createRole(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.addRole(role), HttpStatus.OK);
    }

    @DeleteMapping("/{roleId}")
    public  ResponseEntity<String> deleteRole(@PathVariable String roleId) {
        return new ResponseEntity<>(roleService.removeRole(roleId), HttpStatus.OK);
    }
}
