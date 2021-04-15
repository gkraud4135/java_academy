package com.lec206.ex05_static;

public class CalculatorMain {

	public static void main(String[] args) {
		
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(10,10));
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		System.out.println(cal1.pi);
		
		cal1.pi = 100;
		System.out.println(cal1.pi);
		System.out.println(cal2.pi);
		System.out.println(Calculator.pi);
		
	}
	
}
