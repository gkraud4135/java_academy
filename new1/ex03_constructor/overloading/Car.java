package com.lec206.ex03_constructor.overloading;

public class Car {

	// 필드
	String company = "포르쉐";
	String model;
	String color;
	int speed;
	
	// 생성자
	Car() {}

	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	Car(int speed, String model, String color) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}	
	
}
