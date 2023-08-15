package com.example.demo.Controller;

import com.example.demo.Model.Guest;
import com.example.demo.Service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    @GetMapping
    public List<Guest> getAllGuests(){
        return this.guestService.getAllGuests();
    }
    @GetMapping("/{id}")
    public String updateGuest(@RequestBody Guest guest, @PathVariable("/id") long id) {
        return this.guestService.updateGuest(guest, id);
    }
}
