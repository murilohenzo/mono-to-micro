package br.com.murilohenzo.msordermanagement.domain.service;

import br.com.murilohenzo.msordermanagement.infrastructure.HotelRepository;
import br.com.murilohenzo.msordermanagement.representation.HotelRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.HotelResponseRepresentation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelResponseRepresentation create(HotelRequestRepresentation hotelRequestRepresentation) {

        log.info("[I19] - Iniciando fluxo de cadastro de hotel");

         var flight = hotelRepository.newHotel(hotelRequestRepresentation);
         if (flight.getStatusCode().is2xxSuccessful()) {
             return flight.getBody();
         } else {
             throw new RuntimeException("Erro durante cadastrar hotel");
         }
    }
}
