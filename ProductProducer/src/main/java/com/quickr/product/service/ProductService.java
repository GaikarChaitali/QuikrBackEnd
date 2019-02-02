package com.quickr.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.quickr.product.model.Product;
import com.quickr.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public void addProduct(@RequestBody Product product) {
		productRepository.save(product);
	}
	
	
	public Optional<Product> getProductById(Long productId) {
		return productRepository.findById(productId);
		
	}
	
	
	public List<Product> getAllProducts() {
	
		return productRepository.findAll();
	}
	
	
	public void deleteAllProducts() {
		
		productRepository.deleteAll();
	}
	
	
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
		
	}

}
