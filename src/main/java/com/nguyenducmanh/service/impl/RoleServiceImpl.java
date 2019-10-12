package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.Role;
import com.nguyenducmanh.repository.RoleRepository;
import com.nguyenducmanh.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
