package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.Manager;
import com.nguyenducmanh.entity.Role;
import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.entity.User;
import com.nguyenducmanh.model.request.ManagerRequest;
import com.nguyenducmanh.model.request.UserRequest;
import com.nguyenducmanh.repository.ManagerRepository;
import com.nguyenducmanh.repository.RoomRepository;
import com.nguyenducmanh.repository.UserRepository;
import com.nguyenducmanh.service.ManagerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ManagerServiceImpl implements ManagerService {
    private ManagerRepository managerRepository;
    private UserRepository userRepository;
    private RoomRepository roomRepository;

    public ManagerServiceImpl(ManagerRepository managerRepository, UserRepository userRepository, RoomRepository roomRepository) {
        this.managerRepository = managerRepository;
        this.userRepository = userRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public Manager findManagerByUserId(long id) {
        return managerRepository.findManagerByUserId(id);
    }

    public void insert(ManagerRequest managerRequest) {
        Manager manager = new Manager();
        BeanUtils.copyProperties(managerRequest, manager);
        manager.setUser(userRepository.getOne(managerRequest.getIdUser()));
        managerRepository.save(manager);
    }

    @Override
    public void update(ManagerRequest managerRequest, long id) {
        Manager manager = managerRepository.getOne(id);
        if (manager == null){
            return;
        }
        BeanUtils.copyProperties(managerRequest,manager);
        managerRepository.save(manager);
    }

    @Override
    public void delete(long id) {
        Manager manager = managerRepository.getOne(id);
        User user = manager.getUser();
        for (Room room: manager.getRooms() ){
            roomRepository.delete(room);
        }
        userRepository.delete(user);
        managerRepository.delete(manager);
    }


}
