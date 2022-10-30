package com.bean;

public class Computer extends Hardware {
	private int ram;
	private int harddisk;
	
	public Computer(int pid, String pname, String mfd, Dimension dim, int ram, int harddisk) {
		super(pid, pname, mfd, dim);
		this.ram = ram;
		this.harddisk = harddisk;
	}

	public int getHarddisk() {
		return harddisk;
	}

	public int getRam() {
		return ram;
	}
		
}
