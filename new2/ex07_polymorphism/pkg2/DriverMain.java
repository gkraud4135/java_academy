package com.lec206.ex07_polymorphism.pkg2;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new 자전거());
		driver.drive(new AutoBi());
	}

}
