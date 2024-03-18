package com.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
