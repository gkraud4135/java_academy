package com.lec206.ex03_constructor.othercall;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car("911카레라");
		System.out.println("제조회사 = " + car1.company);
		System.out.println("모델     = " + car1.model);
		System.out.println("색상     = " + car1.color);
		System.out.println("속도     = " + car1.speed);

		Car car2 = new Car("911카레라", "핑크");
		Car car3 = new Car("911카레라", "파랑", 300);
		Car car4 = new Car(300, "911카레라", "파랑");
	}

}
