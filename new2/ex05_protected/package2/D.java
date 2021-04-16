package com.lec206.ex05_protected.package2;

import com.lec206.ex05_protected.package1.A;

public class D extends A {

	public D() {
		super();
		this.field = "다른 패키지에서 상속관계일 경우 접근 가능";
		this.method();
	}
}
