package com.bean;

public class Laptop extends Computer {

	private boolean touchpad;

	public Laptop(String serialNumber, String brand, int price, String mfd, Dimension dim, String hardDisk, int ram,
			int cores) {
		super(serialNumber, brand, price, mfd, dim, hardDisk, ram, cores);
		// TODO Auto-generated constructor stub
	}

	public boolean isTouchpad() {
		return touchpad;
	}

}
