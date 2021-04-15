package com.lec206.ex03_constructor.othercall;

public class Car {
	
	// 필드
	String company = "포르쉐";
	String model;
	String color;
	int speed;
	
	// 생성자 : 생성자에서 다른 생성자 호출
	Car() {}
	Car(String model) {
		// this.model = model;
		// this();
		this(model, null, 10);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public Car(int speed, String model, String color) {
		this.model = model;
		this.color = color;
		this.speed = speed;	
	}
}
