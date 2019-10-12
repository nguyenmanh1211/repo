package com.nguyenducmanh.service;

import com.nguyenducmanh.entity.Manager;
import com.nguyenducmanh.model.request.ManagerRequest;

import java.util.List;

public interface ManagerService {
    List<Manager> findAll();

    Manager findManagerByUserId(long id);

    void insert(ManagerRequest managerRequest);

    void update(ManagerRequest managerRequest,long id);
//
    void delete(long id);

}
