package com.lec206.ex07_instanceof;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
	}

}
