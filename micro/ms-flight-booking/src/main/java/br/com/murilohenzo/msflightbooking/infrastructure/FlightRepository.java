package br.com.murilohenzo.msflightbooking.infrastructure;

import br.com.murilohenzo.msflightbooking.domain.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
