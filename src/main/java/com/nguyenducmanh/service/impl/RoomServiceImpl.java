package com.nguyenducmanh.service.impl;


import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.model.request.RoomRequest;
import com.nguyenducmanh.repository.ManagerRepository;
import com.nguyenducmanh.repository.RoomRepository;
import com.nguyenducmanh.service.RoomService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;
    private ManagerRepository managerRepository;

    public RoomServiceImpl(RoomRepository roomRepository, ManagerRepository managerRepository) {
        this.roomRepository = roomRepository;
        this.managerRepository = managerRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void insert(RoomRequest roomRequest) {
        Room room = new Room();
        BeanUtils.copyProperties(roomRequest, room);
        room.setManager(managerRepository.getOne(roomRequest.getIdManager()));
        roomRepository.save(room);
    }

    @Override
    public void update(RoomRequest roomRequest, long id) {
        Room room = roomRepository.getOne(id);
        if (room == null) {
            return;
        }
        BeanUtils.copyProperties(roomRequest, room);
        roomRepository.save(room);

    }

    @Override
    public void delete(long id) {
        Room room = roomRepository.getOne(id);
        roomRepository.delete(room);
    }

    @Override
    public List<Room> findRoomByManagerId(long id) {
        return roomRepository.findRoomByManagerId(id);
    }
}
