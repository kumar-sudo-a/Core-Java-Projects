package com.bean;

public class CarDeck extends Deck {
	private String start;
	private String volumeButton;

	public CarDeck(String serialNumber, String brand, int price, String mfd, Dimension dim, int volts, int ohms, String start, String volumeButton) {
		super(serialNumber, brand, price, mfd, dim, volts, ohms);
		this.start = start;
		this.volumeButton= volumeButton;
	}

	public String getStart() {
		return start;
	}

	public String getVolumeButton() {
		return volumeButton;
	}

	
}
