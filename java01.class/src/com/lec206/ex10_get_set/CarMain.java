package com.lec206.ex10_get_set;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setSpeed(30);
		car.isStop(true);
		car.setSpeed(100);
		car.isStop(false);
		
		int aaa = car.getSpeed();
		boolean bbb = car.getStop();
		
		System.out.println("현재속도 = " + aaa + " km/h");
		System.out.println("운행여부 = " + bbb);
	}

}
