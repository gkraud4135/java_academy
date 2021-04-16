package com.lec206.ex10_get_set;

public class Car1Main {

	public static void main(String[] args) {
		
		Car1 car = new Car1();
		
		car.setSpeed(250);
		car.isStop(false);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getStop());
		
		car.setSpeed(0);
		System.out.println(car.getSpeed());
		System.out.println(car.getStop());
	}

}
