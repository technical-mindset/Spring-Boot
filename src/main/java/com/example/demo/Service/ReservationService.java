package com.example.demo.Service;

import com.example.demo.Model.Reservation;
import com.example.demo.Model.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getReservations(){
        return this.reservationRepository.findAll();
    }
    public List<Reservation> getReservation(){
        List<Reservation> list = new ArrayList<>();
        Iterable<Reservation> itr = this.reservationRepository.findReservationByRes_Date(new Date());
        itr.forEach(list::add);
        return list;
    }

}
