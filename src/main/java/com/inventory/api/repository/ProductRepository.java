package com.inventory.api.repository;

import com.inventory.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryIgnoreCase(String category);

List<Product> findByNameContainingIgnoreCase(String name);

@Query("SELECT p FROM Product p WHERE p.stockQuantity <= p.reorderLevel")
List<Product> findLowStockProducts();
}