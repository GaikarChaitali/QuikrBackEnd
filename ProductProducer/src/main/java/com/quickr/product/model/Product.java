package com.quickr.product.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "productDetails")
public class Product {


	//make product id as your car number(TN5674)
	@Id
	private long productId;
	private String category;
	private String productBrand;
	private String productModel;
	private String color;
	private String image;
	private String fuelType;
	private LocalDate yearOfRegistration;
	private long kmsDriven;
	private String location;
	private String description;
	private double expectedSellingPrice;
	private String sellerName;
	private long sellerPhoneNumber;
	private String sellerEmail;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(Long productId,String category,String productBrand, String productModel,String color,String image,
			String fuelType,LocalDate yearOfRegistration,long kmsDriven,String location,String description,
			double expectedSellingPrice, String sellerName, long sellerPhoneNumber, String sellerEmail) {
		super();
		this.productId=productId;
		this.category=category;
		this.productBrand = productBrand;
		this.productModel = productModel;
		this.color=color;
		this.image=image;
		this.fuelType=fuelType;
		this.yearOfRegistration = yearOfRegistration;
		this.kmsDriven = kmsDriven;
		this.location = location;
		this.description=description;
		this.expectedSellingPrice = expectedSellingPrice;
		this.sellerName = sellerName;
		this.sellerPhoneNumber = sellerPhoneNumber;
		this.sellerEmail = sellerEmail;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public LocalDate getYearOfRegistration() {
		return yearOfRegistration;
	}

	public void setYearOfRegistration(LocalDate yearOfRegistration) {
		this.yearOfRegistration = yearOfRegistration;
	}

	public long getKmsDriven() {
		return kmsDriven;
	}

	public void setKmsDriven(long kmsDriven) {
		this.kmsDriven = kmsDriven;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getExpectedSellingPrice() {
		return expectedSellingPrice;
	}

	public void setExpectedSellingPrice(double expectedSellingPrice) {
		this.expectedSellingPrice = expectedSellingPrice;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public long getSellerPhoneNumber() {
		return sellerPhoneNumber;
	}

	public void setSellerPhoneNumber(long sellerPhoneNumber) {
		this.sellerPhoneNumber = sellerPhoneNumber;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", productBrand=" + productBrand
				+ ", productModel=" + productModel + ", color=" + color + ", image=" + image + ", fuelType=" + fuelType
				+ ", yearOfRegistration=" + yearOfRegistration + ", kmsDriven=" + kmsDriven + ", location=" + location
				+ ", description=" + description + ", expectedSellingPrice=" + expectedSellingPrice + ", sellerName="
				+ sellerName + ", sellerPhoneNumber=" + sellerPhoneNumber + ", sellerEmail=" + sellerEmail + "]";
	}



	

}



/*[
 {
     "productId": 100,
     "category": "car",
     "productBrand": "hyundai",
     "productModel": "verna",
     "color":"white",
     "image": "hyundai verna image",
     "fuelType": "diesel",
     "yearOfRegistration": "2019-01-28",
     "kmsDriven": 40000,
     "location": "tamilnadu",
     "description": "smooth driving",
     "expectedSellingPrice": 75000,
     "sellerName": "priya",
     "sellerPhoneNumber": 9566940124,
     "sellerEmail": "priya@gmail.com"
 },
 {
     "productId": 101,
     "category": "car",
     "productBrand": "honda",
     "productModel": "city",
     "color":"grey",
     "image": "honda city image",
     "fuelType": "petrol",
     "yearOfRegistration": "2012-11-05",
     "kmsDriven": 33000,
     "location": "delhi",
     "description": "good looking",
     "expectedSellingPrice": 200000,
     "sellerName": "sudha",
     "sellerPhoneNumber": 9876543211,
     "sellerEmail": "sudha@gmail.com"
 },
 {
     "productId": 103,
     "category": "car",
     "productBrand": "bmw",
     "productModel": "bmw x1",
     "color":"royal blue",
     "image": "bmw x1 image",
     "fuelType": "diesel",
     "yearOfRegistration": "2016-08-24",
     "kmsDriven": 24000,
     "location": "mumbai",
     "description": "high speed",
     "expectedSellingPrice": 2500000,
     "sellerName": "harini",
     "sellerPhoneNumber": 887762541,
     "sellerEmail": "harini@gmail.com"
 },
 {
     "productId": 104,
     "category": "car",
     "productBrand": "Mercedes-Benz.",
     "productModel": "Mercedes-Benz E-Class",
     "color":"diamond white",
     "image": "Mercedes-Benz E-Class image",
     "fuelType": "diesel",
     "yearOfRegistration": "2015-07-27",
     "kmsDriven": 74000,
     "location": "pune",
     "description": "more comfortable",
     "expectedSellingPrice": 1000000,
     "sellerName": "sandhya",
     "sellerPhoneNumber": 8712340952,
     "sellerEmail": "sandhya@gmail.com"
 },
 {
     "productId": 102,
     "category": "car",
     "productBrand": "audi",
     "productModel": "a3 seden",
     "color":"white",
     "image": "audi a3 seden image",
     "fuelType": "petrol",
     "yearOfRegistration": "2013-06-10",
     "kmsDriven": 60000,
     "location": "tamilnadu",
     "description": "second hand",
     "expectedSellingPrice": 5500000,
     "sellerName": "divya",
     "sellerPhoneNumber": 9876543211,
     "sellerEmail": "divya@gmail.com"
 },
 {
     "productId": 105,
     "category": "car",
     "productBrand": "rolls royce",
     "productModel": "ghost",
     "color":"black",
     "image": "rolls royce image",
     "fuelType": "petrol",
     "yearOfRegistration": "2015-04-10",
     "kmsDriven": 45000,
     "location": "bangalore",
     "description": "first hand",
     "expectedSellingPrice": 96000,
     "sellerName": "vidhya",
     "sellerPhoneNumber": 9566940124,
     "sellerEmail": "vidhya@gmail.com"
 },
 {
     "productId": 106,
     "category": "car",
     "productBrand": "tata",
     "productModel": "indica",
     "color":"blue",
     "image": "Tata Indica image",
     "fuelType": "petrol",
     "yearOfRegistration": "2010-02-15",
     "kmsDriven": 14000,
     "location": "cochin",
     "description": null,
     "expectedSellingPrice": 90000,
     "sellerName": "ganesh",
     "sellerPhoneNumber": 9824326782,
     "sellerEmail": "ganesh@gmail.com"
 }
]*/