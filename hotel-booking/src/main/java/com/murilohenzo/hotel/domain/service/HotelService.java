package com.murilohenzo.hotel.domain.service;

import com.murilohenzo.hotel.domain.entity.Hotel;
import com.murilohenzo.hotel.infrastructure.HotelRepository;
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
