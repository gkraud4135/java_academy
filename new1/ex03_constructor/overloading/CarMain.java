package com.lec206.ex03_constructor.overloading;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("911포르쉐");
		Car car3 = new Car("911포르쉐", "핑크");
		Car car4 = new Car("911포르쉐", "핑크", 300);
		Car car5 = new Car(300, "911포르쉐", "핑크");
		
		System.out.println("제조회사 = " + car1.company + 
				", 모델     = " + car1.model + 
		        ", 색상     = " + car1.color + 
		        ", 속도     = " + car1.speed);
		System.out.println("제조회사 = " + car2.company + 
				", 모델     = " + car2.model + 
				", 색상     = " + car2.color + 
				", 속도     = " + car2.speed);
		System.out.println("제조회사 = " + car3.company + 
				", 모델     = " + car3.model + 
				", 색상     = " + car3.color + 
				", 속도     = " + car3.speed);
		System.out.println("제조회사 = " + car4.company + 
				", 모델     = " + car4.model + 
				", 색상     = " + car4.color + 
				", 속도     = " + car4.speed);
		System.out.println("제조회사 = " + car5.company + 
				", 모델     = " + car5.model + 
				", 색상     = " + car5.color + 
				", 속도     = " + car5.speed);

	}

}
