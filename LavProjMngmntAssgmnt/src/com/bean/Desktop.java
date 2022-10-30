package com.bean;

public class Desktop extends Computer {
	private int screenSize;
	private boolean webcam;
	
	public Desktop(String serialNumber, String brand, int price, String mfd, Dimension dim, String hardDisk, int ram,
			int cores, int screenSize, boolean webcam) {
		super(serialNumber, brand, price, mfd, dim, hardDisk, ram, cores);
		this.screenSize= screenSize;
		this.webcam= webcam;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public boolean isWebcam() {
		return webcam;
	}
	

	
}
