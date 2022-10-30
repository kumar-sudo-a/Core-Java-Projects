package com.bean;

public class MSOffice extends Software {

	private MSProducts MSProducts;

	public MSOffice(String serialNumber, String brand, int price, String mfd, double version, String releaseDate,
			String vendor, MSProducts MSProducts) {
		super(serialNumber, brand, price, mfd, version, releaseDate, vendor);
		this.MSProducts = MSProducts;

	}

	public MSProducts getMSProducts() {
		return MSProducts;
	}

}
