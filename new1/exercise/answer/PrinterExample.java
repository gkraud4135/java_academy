package com.lec206.exercise.answer;

public class PrinterExample {

	
	
	
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.println(1, false, 0, null);
	}

}

class Printer{
	
	void println(int a, boolean b, double c, String d){
		System.out.println("??");
	};
//  17
//	static void println(int a, boolean b, double c, String d){
//	System.out.println("??");
//	};

}