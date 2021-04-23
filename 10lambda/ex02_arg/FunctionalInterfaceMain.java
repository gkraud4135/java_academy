package com.lec206.ex02_arg;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi = null;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(x + " * 5 = " + x*5);
		};
		fi.method(10);
		
		fi = (x) -> { System.out.println(x + " * 5 = " + x*5); };
		fi.method(30);
		
		fi = x -> System.out.println(x + " * 5 = " + x*5);
		fi.method(50);
	}

}

@FunctionalInterface
interface MyFunctionalInterface {
	void method(int x);
}