package com.lec206.ex09_access.field_method.package1;

public class B {
	
	public B() {

		A a = new A();
		
		a.field1 = 10;
		a.field2 = 10;
		// a.field3 = 10;	(x)
		
		a.method1();
		a.method2();
		// a.method3(); (x)
		
	}

}
