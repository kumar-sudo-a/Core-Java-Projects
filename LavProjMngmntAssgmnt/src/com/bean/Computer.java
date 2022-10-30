package com.bean;

public abstract class Computer extends Hardware {
	private String hardDisk;
	private int ram;
	private int cores;

	public Computer(String serialNumber, String brand, int price, String mfd, Dimension dim, String hardDisk, int ram,
			int cores) {
		super(serialNumber, brand, price, mfd, dim);
		this.hardDisk = hardDisk;
		this.ram = ram;
		this.cores = cores;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public int getRam() {
		return ram;
	}

	public int getCores() {
		return cores;
	}

}
