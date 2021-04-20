package com.lec206.ex06_casting;

public class DriverMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		// vehicle.chekFare(); (x)
		
		Bus bus = (Bus) vehicle; // 강제형변환
		bus.run();
		bus.checkFare();
	}

}
