package com.murilohenzo.travelapp.modules.order.infrastructure;

import com.murilohenzo.travelapp.modules.order.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
