package com.started.startedmyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.started.startedmyApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{


}
