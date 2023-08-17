package com.example.demo.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {
    @Query(value = "SELECT r.ROOM_ID FROM RESERVATION r", nativeQuery = true)
    List<Long> reservedRooms();
}
