package com.nguyenducmanh.service;

import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.model.request.RoomRequest;

import java.util.List;

public interface RoomService {
    List<Room> findAll();

    void insert(RoomRequest roomRequest);

    void update(RoomRequest roomRequest,long id);

    void delete(long id);

    List<Room> findRoomByManagerId(long id);

}
