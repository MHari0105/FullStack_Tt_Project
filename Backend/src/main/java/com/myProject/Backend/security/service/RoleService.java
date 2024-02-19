package com.myProject.Backend.security.service;

import com.myProject.Backend.security.model.Role;

import java.util.List;

public interface RoleService {

    public String addRole(Role role);
    public String removeRole(String roleId);
}
