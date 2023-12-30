package com.murilohenzo.travelapp.modules.fligth.infrastructure;

import com.murilohenzo.travelapp.modules.fligth.domain.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
