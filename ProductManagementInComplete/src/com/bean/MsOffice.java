package com.bean;

public class MsOffice extends Software {

	private MsStack app;
	private String licensekey;
	private String expiry;
	
	public MsOffice(int pid, String pname, String mfd, String licensekey, String expiry, MsStack app) {
		super(pid, pname, mfd);
		this.licensekey =licensekey;
		this.expiry = expiry;
		this.app = app;
	}
	
	public MsStack getApp() {
		return app;
	}
	
	public String getLicensekey() {
		return licensekey;
	}
	
	public String getExpiry() {
		return expiry;
	}
}