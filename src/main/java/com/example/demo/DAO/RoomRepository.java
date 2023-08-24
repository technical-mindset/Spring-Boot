package com.example.demo.DAO;

import com.example.demo.Model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    @Query(value = "SELECT r.ROOM_ID FROM RESERVATION r", nativeQuery = true)
    List<Long> reservedRooms();
}
