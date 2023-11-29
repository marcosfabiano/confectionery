package com.fabianoapp.confectionery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabianoapp.confectionery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
