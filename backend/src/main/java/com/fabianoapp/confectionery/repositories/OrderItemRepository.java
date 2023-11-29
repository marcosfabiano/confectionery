package com.fabianoapp.confectionery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabianoapp.confectionery.entities.OrderItem;
import com.fabianoapp.confectionery.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
