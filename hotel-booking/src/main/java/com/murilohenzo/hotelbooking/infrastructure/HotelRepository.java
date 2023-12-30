package com.murilohenzo.hotelbooking.infrastructure;

import com.murilohenzo.hotelbooking.domain.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
