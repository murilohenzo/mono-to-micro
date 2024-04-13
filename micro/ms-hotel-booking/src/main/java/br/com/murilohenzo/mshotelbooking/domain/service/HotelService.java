package br.com.murilohenzo.mshotelbooking.domain.service;

import br.com.murilohenzo.mshotelbooking.domain.entity.Hotel;
import br.com.murilohenzo.mshotelbooking.infrastructure.HotelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
    public Hotel createNewHotel(Hotel hotel) {
        return this.flightRepository.save(hotel);
    }
}
