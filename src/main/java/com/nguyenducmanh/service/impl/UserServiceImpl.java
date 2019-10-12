package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.Role;
import com.nguyenducmanh.entity.User;
import com.nguyenducmanh.model.request.UserRequest;
import com.nguyenducmanh.repository.ManagerRepository;
import com.nguyenducmanh.repository.RoleRepository;
import com.nguyenducmanh.repository.UserRepository;
import com.nguyenducmanh.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private ManagerRepository managerRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, ManagerRepository managerRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.managerRepository = managerRepository;
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void insert(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);

        Set<Role> roles = new HashSet<>();
        for (Long id : userRequest.getIds()) {
            Role role = roleRepository.getOne(id);
            roles.add(role);
        }
        user.setRoles(roles);
        user.setCreatedDate(new Date());
        user.setStatus("active");
        userRepository.save(user);


    }

    @Override
    public void update(UserRequest userRequest, long id) {
        User user = userRepository.getOne(id);
        if (user == null) return;
        BeanUtils.copyProperties(userRequest, user);
        user.setCreatedDate(userRepository.findUserNameById(user.getId()).getCreatedDate());
        Set<Role> roles = new HashSet<>();
        for (Long ids : userRequest.getIds()) {
            Role role = roleRepository.getOne(ids);
            roles.add(role);
        }
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.getOne(id);
        for (Role role : user.getRoles()) {
            role.getUsers().remove(user);
        }
        userRepository.delete(user);
    }

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
        return userRepository.findUserByUserNameAndPassword(userName, password);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findManagerUser() {
        List<User> users = userRepository.findAll();
        List<User> managers = new ArrayList<>();
        for (User user : users) {
            for (Role role : user.getRoles()) {
                if (role.getId() == 2)
                    managers.add(user);
            }
        }
        return managers;
    }

    @Override
    public User findOne(Long id) {
        User user = userRepository.getOne(id);
        return user;
    }
}
