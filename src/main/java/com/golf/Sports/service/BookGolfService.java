package com.golf.Sports.service;

import com.golf.Sports.entity.BookGolf;
import com.golf.Sports.repository.BookGolfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookGolfService {

    @Autowired
    BookGolfRepository bookGolfRepository;

    public void addBooking(BookGolf bookGolf, Map<Long, BookGolf> bookGolfMap){
        boolean exists = bookGolfMap.values().stream()
                .anyMatch(bf ->
                        bf.getName().equalsIgnoreCase(bookGolf.getName()) &&
                        bf.getEmailId().equalsIgnoreCase(bookGolf.getEmailId()));
        if(exists){
            throw new RuntimeException("Duplicate entry");
        }
        bookGolfMap.put(bookGolf.getId(), bookGolf);
    }
    @Cacheable(value = "golf", key = "#id")
    public BookGolf getBooking(Long id){
        return bookGolfRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not present"));
    }

}
