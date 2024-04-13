package br.com.murilohenzo.msordermanagement.adapters.rest;

import br.com.murilohenzo.msordermanagement.domain.entity.Order;
import br.com.murilohenzo.msordermanagement.domain.service.FlightService;
import br.com.murilohenzo.msordermanagement.domain.service.HotelService;
import br.com.murilohenzo.msordermanagement.domain.service.OrderService;
import br.com.murilohenzo.msordermanagement.representation.FlightRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.HotelRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.OrderRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.OrderResponseRepresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderApiDelegate {

    private final OrderService orderService;
    private final FlightService flightService;
    private final HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders() {
        return ResponseEntity.ok().body(this.orderService.getOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findOrder(@PathVariable("id") Long id) {
        var order = this.orderService.getOrder(id);
        return order.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<OrderResponseRepresentation> newOrder(@RequestBody OrderRequestRepresentation orderRequestRepresentation) {

        // fluxo de cadastro sem undo
        var flight = flightService.create(new FlightRequestRepresentation(orderRequestRepresentation.fromAirport(), orderRequestRepresentation.toAirport()));
        var hotel = hotelService.create(new HotelRequestRepresentation(orderRequestRepresentation.nights()));
        var order = orderService.createNewOrder(flight.id(), hotel.id());

        var orderRepresentationResponse = new OrderResponseRepresentation(order.getId(), flight.fromAirport(), flight.toAirport(), hotel.nights());

        return ResponseEntity.status(HttpStatus.CREATED).body(orderRepresentationResponse);
    }
}
