package com.nguyenducmanh.controller;

import com.nguyenducmanh.entity.Role;
import com.nguyenducmanh.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getAllRole() {
        return roleService.findAll();
    }
}
