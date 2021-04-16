package com.lec206.ex05_static;

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(10,10));
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		System.out.println(cal1.pi);     //객체로 static값을 변경도 하기에 final로 상수처리 해주는것이 좋음
		
		cal1.pi = 100;
		System.out.println(cal1.pi);
		System.out.println(cal2.pi);
		System.out.println(Calculator.pi);
	}

}
