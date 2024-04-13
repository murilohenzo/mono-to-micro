package br.com.murilohenzo.msflightbooking.domain.service;

import br.com.murilohenzo.msflightbooking.domain.entity.Flight;
import br.com.murilohenzo.msflightbooking.infrastructure.FlightRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
