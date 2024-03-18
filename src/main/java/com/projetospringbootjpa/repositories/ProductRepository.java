package com.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
