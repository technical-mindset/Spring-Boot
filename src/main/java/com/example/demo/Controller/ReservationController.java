package com.example.demo.Controller;

import com.example.demo.Model.Reservation;
import com.example.demo.Model.Room;
import com.example.demo.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping
    public List<Reservation> getReservations(){
        return this.reservationService.getReservations();
    }
}
