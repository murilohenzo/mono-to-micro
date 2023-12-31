package com.murilohenzo.ordermanagement.domain.service;

import com.murilohenzo.flightbooking.domain.service.FlightService;
import com.murilohenzo.hotelbooking.domain.service.HotelService;
import com.murilohenzo.ordermanagement.domain.entity.Order;
import com.murilohenzo.ordermanagement.infrastructure.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final FlightService flightService;
    private final HotelService hotelService;

    public List<Order> getOrders() {
        return this.orderRepository.findAll();
    }

    public Optional<Order> getOrder(Long id) {
        return this.orderRepository.findById(id);
    }

    @Transactional
    public Order createNewOrder(Order order) {
        order.setId(null);
        var flight = flightService.createNewFlight(order.getFlight());
        var hotel = hotelService.createNewHotel(order.getHotel());

        order.getFlight().setId(flight.getId());
        order.getHotel().setId(hotel.getId());

        return this.orderRepository.save(order);
    }
}
