package com.lec206.ex09_default;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB.method1이 실행!!!");
	}

	@Override
	public void method2() {
		System.out.println("MyClassB.method2가 실행!!!");		
	}
	@Override
	public void method4() {
		
		System.out.println("변경");
	}
}
