package com.murilohenzo.travelapp.modules.fligth.domain.service;

import com.murilohenzo.travelapp.modules.fligth.domain.entity.Flight;
import com.murilohenzo.travelapp.modules.fligth.infrastructure.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public List<Flight> getFlights() {
        return this.flightRepository.findAll();
    }

    public Optional<Flight> getFlight(Long id) {
        return this.flightRepository.findById(id);
    }

    @Transactional
    public Flight createNewFlight(Flight flight) {
        return this.flightRepository.save(flight);
    }
}
