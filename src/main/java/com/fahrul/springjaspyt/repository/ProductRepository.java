package com.fahrul.springjaspyt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springjaspyt.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);

}
