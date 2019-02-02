package com.quickr.productconsumer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.quickr.productconsumer.model.Product;

@CrossOrigin(origins="http://localhost:2323")
@RestController
public class ProductConsumerController {

	
	@Autowired
	private EurekaClient client;
		
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	
	//Adding Product into the database
		@PostMapping("/quickr/product/sell")
		public Product sellProduct(@RequestBody Product product) {
			
			System.out.println(product);
			 HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);
		      RestTemplate restTemplate = restTemplateBuilder.build();
				String baseUrl = getProductBaseUrl();
		       restTemplate.exchange(
		    		  baseUrl +"/addproduct", HttpMethod.POST, entity, String.class).getBody();	
		       return product;
		}
		
		
		//getting all products from product producer
		@GetMapping("/quickr/product/view")
		public List<Product> viewProduct() {
			
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getProductBaseUrl();
			System.out.println(baseUrl);
			ResponseEntity<List<Product>> response =
			restTemplate.exchange(baseUrl+"/getallproducts", HttpMethod.GET, null,new ParameterizedTypeReference<List<Product>>() {});
			System.out.println(response.getBody());
			return response.getBody();
		}
		

	

		@GetMapping("/sample")
		public String sample() {
			return "product consumer is working fine";
		}
	
		
		@GetMapping("/showcons")
		public String showcons() {
			
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getProductBaseUrl();
			System.out.println(baseUrl);
			ResponseEntity<String> response =
			restTemplate.exchange(baseUrl+"/show", HttpMethod.GET, null,String.class);
			System.out.println(response.getBody());
			return response.getBody().toString();
		}
		
		
		//Getting url from product producer
		private String getProductBaseUrl() {
			
			InstanceInfo instanceInfo = client.getNextServerFromEureka("productproducer", false);
			String baseUrl = instanceInfo.getHomePageUrl();
			
			return baseUrl;
		} 
		
		
		
		
}
