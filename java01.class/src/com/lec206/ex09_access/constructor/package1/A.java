package com.lec206.ex09_access.constructor.package1;

public class A {
	
	// 필드
	A a1 = new A(true);
	A a2 = new A(1000);
	A a3 = new A("AA");
	
	// 생성자
	public A(boolean x) {}
	A(int x) {}
	private A(String x) {}
}
