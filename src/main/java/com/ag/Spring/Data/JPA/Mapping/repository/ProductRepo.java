package com.ag.Spring.Data.JPA.Mapping.repository;

import com.ag.Spring.Data.JPA.Mapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
