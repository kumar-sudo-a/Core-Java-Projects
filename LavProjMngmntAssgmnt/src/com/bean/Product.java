package com.bean;

public class Product {
	
	private String serialNumber;
	private String brand;
	private int price;
	private String mfd;
	
	
	public Product(String serialNumber, String brand, int price, String mfd) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
		this.mfd = mfd;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public String getBrand() {
		return brand;
	}


	public int getPrice() {
		return price;
	}


	public String getMfd() {
		return mfd;
	}
	


}
