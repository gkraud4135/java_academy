package com.lec206.ex04_method.method2;

public class CompareMethodMain {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "소향");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "소향");

		// 1. 명시적으로 제네릭메서드를 호출
		boolean result = Util.<Integer, String>compare(p1, p2);
		if(result) {
			System.out.println("논리적으로 동등한 객체");
		} else {
			System.out.println("논리적으로 다른 객체");
		}
		
		// 2. 묵시적으로 제네릭메서드를 호출
		Pair<String, String> p3 = new Pair<String, String>("홍길동", "951118-1234567");
		Pair<String, String> p4 = new Pair<String, String>("홍길동", "880110-1234567");
		
		result = Util.compare(p3, p4);
		if(result) {
			System.out.println("논리적으로 동등한 객체");
		} else {
			System.out.println("논리적으로 다른 객체");
		}
		
		
	}

}
