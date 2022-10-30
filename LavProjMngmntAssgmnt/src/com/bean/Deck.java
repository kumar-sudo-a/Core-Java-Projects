package com.bean;

public abstract class Deck extends Hardware {
	private int volts;
	private int ohms;

	public Deck(String serialNumber, String brand, int price, String mfd, Dimension dim, int volts, int ohms) {
		super(serialNumber, brand, price, mfd, dim);
		this.volts = volts;
		this.ohms = ohms;
	}

	public int getVolts() {
		return volts;
	}

	public int getOhms() {
		return ohms;
	}

}
