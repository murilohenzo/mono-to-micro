package com.murilohenzo.order.adapters.representation;

import com.murilohenzo.fligth.domain.entity.Flight;
import com.murilohenzo.hotel.domain.entity.Hotel;
import com.murilohenzo.order.domain.entity.Order;

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
