package com.lec206.ex04_method.declaration;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int value = cal.plus(10, 10);
		System.out.println("10 + 10 = " + value);
		
		double value1 = cal.divide(10, 3);
		System.out.println("10.0 / 3 = " + value1);
		
		double 결과 = cal.divide(10, 3);
		System.out.println(결과);
		
		cal.powerOff();

	}

}
