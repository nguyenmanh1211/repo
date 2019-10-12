package com.nguyenducmanh.service;

import com.nguyenducmanh.entity.User;
import com.nguyenducmanh.model.request.UserRequest;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void insert(UserRequest userRequest);

    void update(UserRequest userRequest, long id);

    void delete(Long id);

    User findUserByUserNameAndPassword(String userName, String password);

    User findUserByUserName(String userName);

    User findUserById(Long id);

    List<User> findManagerUser();

    User findOne(Long id);


}
