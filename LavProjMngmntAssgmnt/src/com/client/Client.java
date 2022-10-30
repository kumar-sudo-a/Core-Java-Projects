package com.client;

import com.bean.CarDeck;
import com.bean.Desktop;
import com.bean.Dimension;
import com.bean.Hardware;
import com.bean.HomeTheater;
import com.bean.MSOffice;
import com.bean.MSProducts;
import com.bean.Product;
import com.bean.Software;

public class Client {

	public static void main(String[] args) {
		CarDeck carDeck = initializeCarDeckData("189123", "radio", 1200, "05/16/2020", 128, 138, 35, 110, 30, "on",
				"32");
		HomeTheater homeTheater = initializeHomeTheaterData("189125", "homeTheater", 1200, "05/16/2020", 128, 138, 35,
				114, 60, 4);
		MSOffice msOffice = initializeMSOfficeData("1111111", "Lenovo", 600, "01/01/2021", 1, "08/2020", "asus",
				MSProducts.WORD);

		// Desktop desktop = initializeDesktopData("1234567", "Lenovo", 500,
		// "02/12/2020", 338, 226, 38,4, 128, 138, 35,250, 7,37,8);

		Product[] prdArr = { carDeck, homeTheater, msOffice };

		displayingData(prdArr);

	}

	// Car Deck Initialization

	public static CarDeck initializeCarDeckData(String serialNumber, String brand, int price, String mfd, int length,
			int breadth, int height, int volts, int ohms, String start, String volumeButton) {

		Dimension d = new Dimension(length, breadth, height);
		CarDeck carDeck = new CarDeck(serialNumber, brand, price, mfd, d, volts, ohms, start, volumeButton);

		return carDeck;
	}

//  HomeTheater Initialization 
	public static HomeTheater initializeHomeTheaterData(String serialNumber, String brand, int price, String mfd,
			int length, int breadth, int height, int volts, int ohms, int noOfSpeakers) {

		Dimension d = new Dimension(length, breadth, height);
		HomeTheater homeTheater = new HomeTheater(serialNumber, brand, price, mfd, d, volts, ohms, noOfSpeakers);

		return homeTheater;
	}

	// MSOffice initialization

	public static MSOffice initializeMSOfficeData(String serialNumber, String brand, int price, String mfd,
			double version, String releaseDate, String vendor, MSProducts MSProducts) {
		MSOffice msOffice = new MSOffice(serialNumber, brand, price, mfd, version, releaseDate, vendor, MSProducts);
		return msOffice;

	}

	// Desktop initialization

	public static Desktop initializeDesktopData(String serialNumber, String brand, int price, String mfd, int length,
			int breadth, int height, String hardDisk, int ram, int cores, int screenSize, boolean webcam) {
		Dimension d = new Dimension(length, breadth, height);

		Desktop desktop = new Desktop(serialNumber, brand, price, mfd, d, hardDisk, ram, cores, screenSize, webcam);
		return desktop;
	}

//	  displaying all the methods.

	public static void displayingData(Product[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != null) {

				System.out.print(arr[i].getSerialNumber() + " " + arr[i].getBrand() + " " + arr[i].getPrice() + " "
						+ arr[i].getMfd() + " ");

				if  (arr[i] instanceof CarDeck) {

					CarDeck carDeck = (CarDeck) arr[i];

					System.out.println(carDeck.getDim().getLength() + " " + carDeck.getDim().getBreadth() + " "
							+ carDeck.getDim().getHeight() + " " + carDeck.getVolts() + " " + carDeck.getOhms() + " "
							+ carDeck.getStart() + " " + carDeck.getVolumeButton());

				} else if (arr[i] instanceof HomeTheater) {

					HomeTheater homeTheater = (HomeTheater) arr[i];
					System.out.println(homeTheater.getDim().getLength() + " " + homeTheater.getDim().getBreadth() + " "
							+ homeTheater.getDim().getHeight() + " " + homeTheater.getNoOfSpeakers());

				} else if (arr[i] instanceof MSOffice) {

					MSOffice msOffice = (MSOffice) arr[i];

					System.out.println(msOffice.getMSProducts());
				} else if (arr[i] instanceof Desktop) {
					Desktop desktop = (Desktop) arr[i];
					System.out.println(desktop.getHardDisk() + " " + desktop.getRam() + " " + desktop.getCores() + " "
							+ desktop.getScreenSize() + desktop.isWebcam());

				}

			}
		}
	}

}

//String hardDisk, int ram,
//int cores, int screenSize, boolean webcam

//public Product(String serialNumber, String brand, int price, String mfd)