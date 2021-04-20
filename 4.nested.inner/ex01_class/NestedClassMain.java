package com.lec206.ex01_class;

public class NestedClassMain {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println();
		
		A.B b = a.new B(); // new A.B();
		b.filed1 = 100;
		b.method1();
		System.out.println();
		
		// A.C.field1 = 100; (x)
		// A.C.method1(); (x)
		A.C.field2 = 200;
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 100;
		c.method1();
		System.out.println();
				
		a.method();

	}

}
