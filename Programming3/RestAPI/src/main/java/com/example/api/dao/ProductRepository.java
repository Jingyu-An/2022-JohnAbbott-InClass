package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
