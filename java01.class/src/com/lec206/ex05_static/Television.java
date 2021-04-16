package com.lec206.ex05_static;

public class Television {

	static String company = "LGE";
	static String model = "OLED";
	static String info;
	static void info(){
		System.out.println(company+","+ model);
	};
	// 정적(초기화)블럭
	// 정적블럭은 클래스가 메모리에 로딩될 때 자동으로 실행되는 블럭이다.
	// 정적블럭은 클래스 내부에 여러개 선언되도 상관없다. 클래스가 메모리로
	// 로딩될 때 선언된 순서로 실행된다.
	static {  // 정적 초기화 블럭 info 변수를 초기화시키는 블록
		 info = model + "," + company;
	}
	
	
}
