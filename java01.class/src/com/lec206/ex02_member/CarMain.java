package com.lec206.ex02_member;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car car = new Car("benz","s","black",200);
	car.str();
	Car.str1(1, 2);	   //static 메서드는 클래스 자체에 사용
	car.powerOn();
	car.powerOn("홍길동");
	}
	
}
