package com.example.demo.Service;

import com.example.demo.Model.Reservation;
import com.example.demo.DAO.ReservationRepository;
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
        List<Reservation> list = new ArrayList<>();
        Iterable<Reservation> itr = this.reservationRepository.findAll();
        itr.forEach(list::add);

        return list;
    }
    public List<Reservation> getResByDate(Date date){
        return this.reservationRepository.findByResDate(date);
    }



}
