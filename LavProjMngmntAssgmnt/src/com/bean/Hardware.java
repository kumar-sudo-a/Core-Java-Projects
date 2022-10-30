package com.bean;

public class Hardware extends Product {

	private Dimension dim;

	public Hardware(String serialNumber, String brand, int price, String mfd, Dimension dim) {
		super(serialNumber, brand, price, mfd);
		this.dim = dim;
	}

	public Dimension getDim() {
		return dim;
	}


}
