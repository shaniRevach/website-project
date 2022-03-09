package com.example.StudentCrud.repositories;

import com.example.StudentCrud.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


/**
 * Repository for search exist product by keyword.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword%")
    List<Product> findAll(String keyword);

}

