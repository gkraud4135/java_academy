package com.lec206.ex07_polymorphism.pkg1;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
