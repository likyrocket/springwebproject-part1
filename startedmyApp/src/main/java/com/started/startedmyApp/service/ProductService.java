package com.started.startedmyApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.started.startedmyApp.model.Product;

@Service
public class ProductService {
    

    List<Product> products = Arrays.asList(
        new Product(101,"Iphone",50000),
        new Product(102,"Canon",70000),
        new Product(103,"shure mic",10000));

    public List<Product> getProducts(){

        return products;
        
    }
    
}
