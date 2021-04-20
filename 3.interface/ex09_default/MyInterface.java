package com.lec206.ex09_default;

public interface MyInterface {
	
	void method1();
	default void method2() {
		System.out.println("1년후에 새로운 업무가 추가!!!");
	}
	
	default void method3() {
		System.out.println("MyInterface.method3가 실행!!");
	}
	default void method4() {
		System.out.println("MyInterface.method4가 실행!!");
	}
	
}
