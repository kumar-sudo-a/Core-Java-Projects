package com.bean;

public abstract class Software extends Product {

	private double version;
	private String releaseDate;
	private String vendor;

	public Software(String serialNumber, String brand, int price, String mfd, double version, String releaseDate,
			String vendor) {
		super(serialNumber, brand, price, mfd);
		this.releaseDate = releaseDate;
		this.vendor = vendor;

	}

	public double getVersion() {
		return version;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getVendor() {
		return vendor;
	}

}
