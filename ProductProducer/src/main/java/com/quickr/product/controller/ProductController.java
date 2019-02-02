package com.quickr.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quickr.product.model.Product;
import com.quickr.product.service.ProductService;

import io.swagger.annotations.Api;

@RestController
@Api
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product product) {
		System.out.println(product);
		service.addProduct(product);
		return "product added successfully";
	}
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
		
	}
	
	@GetMapping("/product/{productId}")
	public Optional<Product> getProductById(@PathVariable Long productId) {
		return service.getProductById(productId);
		
	}
	
	@DeleteMapping("/product/deleteall")
	public String deleteAllProducts() {	
		service.deleteAllProducts();
		return "deleted successfully";
	}
	
	@DeleteMapping("/product/delete/{id}")
	public String deleteProductById(@PathVariable long id) {
		service.deleteProductById(id);
		return "deleted successfully";
	}
	
	@GetMapping("/show")
	public String show() {
		return "Product Producer is working fine!";
	}
	
	/*@PostMapping("/addproduct")
	public AddProduct createProduct(@RequestBody AddProduct addProduct) {
		return service.createUser(addProduct);
	
			
	}*/
}
