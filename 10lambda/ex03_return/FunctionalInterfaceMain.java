package com.lec206.ex03_return;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(10, 20));
		int result = fi.method(10, 30);
		System.out.println(result);
		
		fi = (x,y) -> { return x - y; };
		System.out.println(fi.method(50, 20));
		
		fi = (x,y) -> x * y;
		System.out.println(fi.method(5, 5));
		
		fi = (x,y) -> divide(10, 5);
		System.out.println(fi.method(20, 2));
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	int method(int x, int y);
}