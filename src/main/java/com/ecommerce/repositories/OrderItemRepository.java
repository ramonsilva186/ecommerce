package com.ecommerce.repositories;

import com.ecommerce.entities.OrderItem;
import com.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
