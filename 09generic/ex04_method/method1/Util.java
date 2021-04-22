package com.lec206.ex04_method.method1;

public class Util {

	// 1. 일반메서드
	public static Box1 boxing1(String t) {
		Box1 box1 = new Box1();
		box1.set(t);
		return box1;
	}
	
	// 2. 제네릭메서드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box();
		box.set(t);
		return box;		
	}
}

class Box1 {
	
	private String t;
	public String get() { return t; }
	public void set(String t) { this.t = t; }
}