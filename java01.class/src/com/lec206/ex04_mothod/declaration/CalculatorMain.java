package com.lec206.ex04_mothod.declaration;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator car1 = new Calculator();
		car1.powerOn();
		car1.powerOff();
		System.out.println(car1.plus(1, 2));
		System.out.println(car1.divide(5, 4));  //받는 매개변수가 둘다 int면 return도 int로
		car1.oo(4, 15);
		
		int x = 10;
		int y = 9;
		int value = car1.plus(x, y);
		System.out.println(value);
		
		
		
		
	}

}
