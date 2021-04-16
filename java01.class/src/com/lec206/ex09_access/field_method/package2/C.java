package com.lec206.ex09_access.field_method.package2;

import com.lec206.ex09_access.field_method.package1.A;

public class C {

	public C() {
		
		A a = new A();

		a.field1 = 20;
		// a.field2 = 20; (x)
		// a.field3 = 20; (x)
		
		a.method1();
		// a.method2(); (x)
		// a.method3(); (x)
		
	}
}
