package com.lec206.ex09_access.field_method.package1;

public class A {

	public int field1;
	int field2;
	private int field3;
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	public A() {
		// 필드
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		// 메서드
		method1();
		method2();
		method3();
	}
}
