package com.murilohenzo.ordermanagement.representation;

import com.murilohenzo.flightbooking.domain.entity.Flight;
import com.murilohenzo.hotelbooking.domain.entity.Hotel;
import com.murilohenzo.ordermanagement.domain.entity.Order;

public record OrderRepresentation(String fromAirport, String toAirport, Integer nights) {
    public static Order toEntity(OrderRepresentation orderRepresentation) {
        Order order = new Order();
        Flight flight = new Flight();
        Hotel hotel = new Hotel();

        flight.setFromAirport(orderRepresentation.fromAirport());
        flight.setToAirport(orderRepresentation.toAirport());
        hotel.setNights(orderRepresentation.nights());

        order.setFlight(flight);
        order.setHotel(hotel);

        return order;
    }
}
