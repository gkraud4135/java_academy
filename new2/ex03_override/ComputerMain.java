package com.lec206.ex03_override;

public class ComputerMain {

	int radius = 10;
	Calculator cal = new Calculator();
	Computer com = new Computer();
	
	public static void main(String args[]) {
		int radius = 10;
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 면적 = " + calculator.areaCircle(radius));
		System.out.println(Math.PI);
		System.out.println("원의 면적 = " + computer.areaCircle(radius));
	}
	
}
