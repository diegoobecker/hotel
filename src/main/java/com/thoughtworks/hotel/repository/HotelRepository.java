package com.thoughtworks.hotel.repository;

import com.thoughtworks.hotel.model.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
}
