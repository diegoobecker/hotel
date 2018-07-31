package com.thoughtworks.hotel.controller;

import com.thoughtworks.hotel.model.Hotel;
import com.thoughtworks.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @GetMapping("/{id}")
    public ResponseEntity<?> getHotelById(@PathVariable("id") Long id) {
        Hotel hotel = hotelRepository.findById(id).get();
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Hotel hotel) {
        return new ResponseEntity<>(hotelRepository.save(hotel), HttpStatus.CREATED);
    }
}
