package com.projetospringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringbootjpa.entities.User;

//opcional usar o @Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
