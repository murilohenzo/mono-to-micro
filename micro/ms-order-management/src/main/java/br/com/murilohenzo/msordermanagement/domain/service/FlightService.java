package br.com.murilohenzo.msordermanagement.domain.service;

import br.com.murilohenzo.msordermanagement.infrastructure.FlightRepository;
import br.com.murilohenzo.msordermanagement.representation.FlightRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.FlightResponseRepresentation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightResponseRepresentation create(FlightRequestRepresentation flightRequestRepresentation) {

        log.info("[I19] - Iniciando fluxo de cadastro de voo");

        var flight = flightRepository.newFlight(flightRequestRepresentation);
         if (flight.getStatusCode().is2xxSuccessful()) {
             return flight.getBody();
         } else {
             throw new RuntimeException("Erro durante cadastrar voo");
         }
    }
}
