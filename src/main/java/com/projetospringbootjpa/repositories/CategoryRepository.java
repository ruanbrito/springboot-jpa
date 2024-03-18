package com.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
