package com.example.demo.DAO;

import com.example.demo.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
//    @Query("SELECT ROOM_ID FROM RESERVATION r WHERE r.RES_DATE = '2023-08-22'")
//    public Iterable<Reservation> findReservationsByRes_Date();
    public List<Reservation> findByResDate(Date date);
}
