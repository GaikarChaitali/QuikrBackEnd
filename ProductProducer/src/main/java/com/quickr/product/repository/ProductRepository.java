package com.quickr.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quickr.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long> {

}
