package com.bean;

public class Product {
	private int pid;
	private String pname;
	private String mfd;
	
	public Product(int pid, String pname, String mfd) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mfd = mfd;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getMfd() {
		return mfd;
	}
}
