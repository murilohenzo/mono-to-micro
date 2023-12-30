package com.murilohenzo.travelapp.modules.order.adapters.representation;

import com.murilohenzo.travelapp.modules.fligth.domain.entity.Flight;
import com.murilohenzo.travelapp.modules.hotel.domain.entity.Hotel;
import com.murilohenzo.travelapp.modules.order.domain.entity.Order;

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
