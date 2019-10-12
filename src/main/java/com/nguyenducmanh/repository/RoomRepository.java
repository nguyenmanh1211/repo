package com.nguyenducmanh.repository;

import com.nguyenducmanh.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findRoomByManagerId(long id);
}
