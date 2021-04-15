package com.lec206.ex02_member;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("문자열");
		Car car3 = new Car(10000);
		Car car4 = new Car("문자열", 10000);
		Car car5 = new Car(10000, "문자열");
		Car car6 = new Car("문자열", "문자열");
		Car car7 = new Car(10000, 10000);
		System.out.println();
			
		
		Car myCar = new Car("E300", "핑크", 100);
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.speed);
		System.out.println();
		
		Car yourCar = new Car("911", "노랑", 199);
		yourCar.company = "포르쉐";
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		
		
		myCar.powerOn();
		myCar.powerOn("홍길동");
	}

}
