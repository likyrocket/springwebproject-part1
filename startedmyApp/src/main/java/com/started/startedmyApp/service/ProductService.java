package com.started.startedmyApp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.started.startedmyApp.model.Product;
import com.started.startedmyApp.repository.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;
    

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(101,"Iphone",50000),
    //     new Product(102,"Canon",70000),
    //     new Product(103,"shure mic",10000)));

    public List<Product> getProducts(){

        return repo.findAll();
        
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);   
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
        
    }

    
    
}
