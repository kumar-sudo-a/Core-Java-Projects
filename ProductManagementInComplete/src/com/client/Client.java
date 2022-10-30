package com.client;

import com.bean.Computer;
import com.bean.Desktop;
import com.bean.Dimension;
import com.bean.Hardware;
import com.bean.Laptop;
import com.bean.MsOffice;
import com.bean.MsStack;
import com.bean.Product;
import com.bean.Software;

public class Client {

	public static void main(String[] args) {

		MsOffice msoffice = initializeMsOffice(111, "Excel", "01-01-2022", "abcdefgh", "01-01-2023", MsStack.EXCEL);
		Desktop desktop = initializeDesktop(222, "HP", "02-01-2022", 5, 6, 8, 16, 1);
		Laptop laptop = initializeLaptop(333, "Lenovo", "03-01-2022", 5, 5, 5, 16, 1, true);
		Computer computer = initializeComputer(444, "Alienware", "04-01-2022", 8, 9, 10, 32, 1000);

		// initialize 5 products
		Product[] productsArray = {msoffice, desktop, laptop, computer};
		displaydata(productsArray);
	}

	private static MsOffice initializeMsOffice(int pid, String pname, String mfd, String licensekey, String expiry, MsStack app) {
		MsOffice office = new MsOffice(pid, pname, mfd, licensekey, expiry, app);
		return office;
	}

	private static Desktop initializeDesktop(int pid, String pname, String mfd, int length, int breadth, int heigth, int ram, int hardisk) {
		Dimension dim = new Dimension(length, breadth, heigth);
		Desktop desktop = new Desktop(pid, pname, mfd, dim, ram, hardisk);
		return desktop;
	}

	private static Laptop initializeLaptop(int pid, String pname, String mfd, int length, int breadth, int height, int ram, int hardisk,
			boolean touchpad) {
		Dimension dim = new Dimension(length, breadth, height);
		Laptop laptop= new Laptop(pid, pname, mfd, dim, ram, hardisk, touchpad);
		return laptop;
	}
	
	private static Computer initializeComputer(int pid, String pname, String mfd, int length, int breadth, int height, int ram, int hardisk) {
		Dimension dim = new Dimension(length, breadth, height);
		Computer computer= new Computer(pid, pname, mfd, dim, ram, hardisk);
		return computer;
	}


	public static void displaydata(Product[] productsArray) {
		for (int i = 0; i < productsArray.length; i++) {
			if (productsArray[i]!= null) {
				System.out.println("Product Details:" + "\n" + "ProductID:	" +productsArray[i].getPid() + " " + "\n" + "Product Name:  " + productsArray[i].getPname()+ "\n" + "Manifacturing Date:	" +productsArray[i].getMfd() + " " + "\n" + "License Key:	" +productsArray[i].getLicensekey());
				
				if(productsArray[i] instanceof MsOffice) {
					MsOffice obj = (MsOffice)productsArray[i];		
					System.out.println("MsStack App Name: " +obj.getApp() + "\n");
					
				} else if(productsArray[i] instanceof Desktop) {
					Desktop obj = (Desktop)productsArray[i];
					System.out.println("\n");
					
				} else if(productsArray[i] instanceof Laptop) {
					Laptop obj = (Laptop)productsArray[i];
					System.out.println("\n");
					
				} else if(productsArray[i] instanceof Computer) {
					Computer obj = (Computer)productsArray[i];
					System.out.println("CPU Details: "  + "\n" + "Hard Disk Size in GB: " +obj.getHarddisk() + "\n" + "RAM Size in GB: " +obj.getRam() + "\n" +obj.getDim());
					
				} else if(productsArray[i] instanceof Hardware) {
					Hardware obj = (Hardware)productsArray[i];
					System.out.println("Dimensions of Hardware are: " + "\n" + "Length: " +obj.getDim().getLength() + " inches," );
				}
			}

		}
	}
}

// put them in array of Products
// print the array

//  Array
//	Product array[] = {e1, e2, e3};
