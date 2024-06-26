package br.com.murilohenzo.msflightbooking.adapters.rest;

import br.com.murilohenzo.msflightbooking.domain.entity.Flight;
import br.com.murilohenzo.msflightbooking.domain.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("flights")
public class FlightApiDelegate {

    private final FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> findAllOrders() {
        return ResponseEntity.ok().body(this.flightService.getFlights());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> findOrder(@PathVariable("id") Long id) {
        var order = this.flightService.getFlight(id);
        return order.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        return ResponseEntity.status(201).body(this.flightService.createNewFlight(flight));
    }
}
