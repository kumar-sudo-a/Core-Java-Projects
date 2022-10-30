package com.bean;

public class Laptop extends Computer {
	private boolean touchpad;
	public Laptop(int pid, String pname, String mfd, Dimension dim, int ram, int hardisk, boolean touchpad) {
		super(pid, pname, mfd, dim, ram, hardisk);
		this.touchpad = touchpad;
	}
	
	public boolean isTouchpad() {
		return touchpad;
	}

}
