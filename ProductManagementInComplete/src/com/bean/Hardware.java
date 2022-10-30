package com.bean;

public class Hardware extends Product {

	private Dimension dim;

	public Hardware(int pid, String pname, String mfd, Dimension dim) {
		super(pid, pname, mfd);
		this.dim = dim;
	}

	public Dimension getDim() {
		return dim;
	}
}
