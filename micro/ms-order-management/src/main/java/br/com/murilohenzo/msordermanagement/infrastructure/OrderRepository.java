package br.com.murilohenzo.msordermanagement.infrastructure;

import br.com.murilohenzo.msordermanagement.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
