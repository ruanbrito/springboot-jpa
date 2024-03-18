package com.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringbootjpa.entities.Order;
import com.projetospringbootjpa.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order fidnById(Long id) {
		Optional<Order> order = orderRepository.findById(id);
		return order.get();
	}
}
