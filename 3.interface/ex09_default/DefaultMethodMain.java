package com.lec206.ex09_default;

public class DefaultMethodMain {

	public static void main(String[] args) {
		
		MyInterface mia = new MyClassA();
		mia.method1();
		mia.method2();
		mia.method3();
		System.out.println();
		
		MyInterface mib = new MyClassB();
		mib.method1();
		mib.method2();
		mib.method3();
		mib.method4();
	}

}
