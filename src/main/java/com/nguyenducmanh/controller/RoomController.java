package com.nguyenducmanh.controller;

import com.nguyenducmanh.entity.Room;
import com.nguyenducmanh.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/roomByManager")
    public List<Room> getRoomsByManager(@RequestParam long id){
        return roomService.findRoomByManagerId(id);
    }
}
