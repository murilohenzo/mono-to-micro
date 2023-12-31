package com.murilohenzo.hotelbooking.domain.service;

import com.murilohenzo.hotelbooking.domain.entity.Hotel;
import com.murilohenzo.hotelbooking.infrastructure.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository flightRepository;

    public List<Hotel> getHotels() {
        return this.flightRepository.findAll();
    }

    public Optional<Hotel> getHotel(Long id) {
        return this.flightRepository.findById(id);
    }

    @Transactional
    public Hotel createNewHotel(Hotel flight) {
        return this.flightRepository.save(flight);
    }
}
