package com.golf.Sports.controller;

import com.golf.Sports.entity.BookGolf;
import com.golf.Sports.repository.BookGolfRepository;
import com.golf.Sports.service.BookGolfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookGolfController {

    @Autowired
    BookGolfService bookGolfService;
    @Autowired
    BookGolfRepository bookGolfRepository;

    @GetMapping("/allBookings")
    public List<BookGolf> getAllBookings(){
        return bookGolfRepository.findAll();
    }

    @GetMapping("/bookingById/{id}")
    public BookGolf getBookingById(@PathVariable Long id){
        return bookGolfService.getBooking(id);
    }
}
