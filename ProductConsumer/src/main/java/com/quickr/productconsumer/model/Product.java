package com.quickr.productconsumer.model;

import java.time.LocalDate;

public class Product {


	//make product id as your car number(TN5674)
	
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
