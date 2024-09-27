package com.danielpsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielpsilva.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
