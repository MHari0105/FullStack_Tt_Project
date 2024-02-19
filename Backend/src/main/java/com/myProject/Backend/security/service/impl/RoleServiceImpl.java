package com.myProject.Backend.security.service.impl;

import com.myProject.Backend.security.model.Role;
import com.myProject.Backend.security.repository.RoleRepository;
import com.myProject.Backend.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepo;

    @Override
    public String addRole(Role role) {
        Optional<Role> existingRole = roleRepo.findByRole(role.getRole());

        if (existingRole.isPresent())
            return "Role " + role.getRole() +  " already available";

        else {
            roleRepo.save(role);
            return "New role added " + role.getRole();
        }
    }

    @Override
    public String removeRole(String roleId) {
        boolean deleted = false;

        if (roleRepo.existsById(roleId)) {
            roleRepo.deleteById(roleId);
            deleted = true;
        }

        return "Role " + roleId + " deleted " + deleted;
    }
}
