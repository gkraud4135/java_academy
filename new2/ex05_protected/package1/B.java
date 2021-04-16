package com.lec206.ex05_protected.package1;

public class B {

	public void method() {
		
		A a = new A();
		a.field = "동일 패키지에서 protected 필드 접근가능하다.";
		a.method();
	}
}
