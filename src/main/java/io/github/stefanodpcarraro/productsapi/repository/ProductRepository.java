package io.github.stefanodpcarraro.productsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.stefanodpcarraro.productsapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByName(String name);
}