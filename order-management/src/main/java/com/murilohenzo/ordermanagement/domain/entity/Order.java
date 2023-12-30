package com.murilohenzo.ordermanagement.domain.entity;

import com.murilohenzo.flightbooking.domain.entity.Flight;
import com.murilohenzo.hotelbooking.domain.entity.Hotel;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tb_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}
