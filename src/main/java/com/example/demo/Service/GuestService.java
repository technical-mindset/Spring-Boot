package com.example.demo.Service;

import com.example.demo.Model.Guest;
import com.example.demo.DAO.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;
    public List<Guest> getAllGuests(){
        Iterable<Guest> iterable = this.guestRepository.findAll();
        List<Guest> list = new ArrayList<>();
        iterable.forEach(list::add);
       return list;
    }
    public Guest getGuest(long id){
        return this.guestRepository.findById(id).get();
    }
    public String updateGuest(Guest guest, long id){
        if (this.guestRepository.findById(id).isPresent()) {
            Guest newGuest = this.guestRepository.findById(id).get();
            newGuest.setFirstName(guest.getFirstName());
            newGuest.setLastName(guest.getLastName());
            newGuest.setEmailAddress(guest.getEmailAddress());
            newGuest.setAddress(guest.getAddress());
            newGuest.setCountry(guest.getCountry());
            newGuest.setState(guest.getState());
            newGuest.setPhoneNumber(guest.getPhoneNumber());
        return "Updated Guest!!";
        }
        return "Doesn't exists!!";
    }
}
