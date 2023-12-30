package com.murilohenzo.travelapp.modules.hotel.infrastructure;

import com.murilohenzo.travelapp.modules.hotel.domain.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
