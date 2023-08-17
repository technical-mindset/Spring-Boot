package com.example.demo.Service;



import com.example.demo.Model.Room;
import com.example.demo.Model.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        Iterable rooms = this.roomRepository.findAll();
        List list = new ArrayList();
        rooms.forEach(list::add);
        return list;
    }
    public List<Long> unReservedRooms(){
        return this.roomRepository.reservedRooms();
    }





}
