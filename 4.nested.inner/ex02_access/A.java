package com.lec206.ex02_access;

public class A {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스멤버클래스
	// 인스턴스멤버클래스는 모든 필드와 모든 메서드에 접근이 가능
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 200;
			method2();
		}
	}
	
	// 정적멤버클래스
	// 정적멤버클래스는 정적필드와 정적메서드만 접근이 가능
	static class C {
		
		void method() {
			
//			field1 = 10; (x)
//			method1(); (x)			

			field2 = 200;
			method2();
		}
	}

}
