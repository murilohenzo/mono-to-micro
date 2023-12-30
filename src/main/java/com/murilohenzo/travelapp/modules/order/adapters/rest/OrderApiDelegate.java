package com.murilohenzo.travelapp.modules.order.adapters.rest;

import com.murilohenzo.travelapp.modules.order.adapters.representation.OrderRepresentation;
import com.murilohenzo.travelapp.modules.order.domain.entity.Order;
import com.murilohenzo.travelapp.modules.order.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderApiDelegate {

    private final OrderService orderService;

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
    public ResponseEntity<Order> newOrder(@RequestBody OrderRepresentation order) {
        return ResponseEntity.status(201).body(this.orderService.createNewOrder(OrderRepresentation.toEntity(order)));
    }
}
