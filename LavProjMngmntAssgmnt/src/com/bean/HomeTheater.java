package com.bean;

public class HomeTheater extends Deck {

	private int noOfSpeakers;


	public HomeTheater(String serialNumber, String brand, int price, String mfd, Dimension dim, int volts, int ohms, int noOfSpeakers) {
		super(serialNumber, brand, price, mfd, dim, volts, ohms);
		this.noOfSpeakers =noOfSpeakers;
	}
	
	public int getNoOfSpeakers() {
		return noOfSpeakers;
	}

}
