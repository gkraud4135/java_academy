package com.lec206.ex05_protected.package2;

public class C {

	public void method() {
		// 접근제한자가 protected일 경우 다른 패키지에서는
		// 접근이 불가능하다.
		// A a = new A(); (x)
		// a.field = "접근불가능";
		// a.method();
	}
}
