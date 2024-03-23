package com.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.entities.OrderItem;
import com.projetospringbootjpa.entities.pk.OrderItemPK;

//opcional usar o @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
