package com.projetospringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringbootjpa.entities.Product;
import com.projetospringbootjpa.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product fidnById(Long id) {
		
		Optional<Product> product = repository.findById(id);
		return product.get();
	}

}
