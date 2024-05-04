package com.example.ExamenProgra.dao;

import com.example.ExamenProgra.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
