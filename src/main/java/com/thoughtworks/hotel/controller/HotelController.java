package com.thoughtworks.hotel.controller;

import com.thoughtworks.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hotel")
public class HotelController {

    @Autowired
    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(hotelRepository.findAll(), HttpStatus.OK);
    }
}
