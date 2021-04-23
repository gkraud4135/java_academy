package com.lec206.ex05_bounded;

public class Util {

	// 제네릭타입에 extends키워드를 사용하면 특정타입의 자손만 
	// 대입할 수 있도록 제한할 수 있다.
	
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); // -1, 0, 1
	}
}
