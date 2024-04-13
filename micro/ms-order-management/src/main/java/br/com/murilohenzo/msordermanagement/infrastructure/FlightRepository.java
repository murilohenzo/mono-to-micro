package br.com.murilohenzo.msordermanagement.infrastructure;

import br.com.murilohenzo.msordermanagement.representation.FlightRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.FlightResponseRepresentation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "FlightService", url = "${apis.ms-flight}/flights")
public interface FlightRepository {

    @PostMapping
    ResponseEntity<FlightResponseRepresentation> newFlight(@RequestBody FlightRequestRepresentation flightRepresentation);
}
