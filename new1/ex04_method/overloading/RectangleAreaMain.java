package com.lec206.ex04_method.overloading;

public class RectangleAreaMain {

	public static void main(String[] args) {
		
		RectangleArea ra = new RectangleArea();
		
		// 1. 직사각형의 넓이
		System.out.println("직사각형의 넓이 = " + ra.areaRectangle(10.5, 12.5));
		
		// 2. 정사각형의 넓이
		System.out.println("정사각형의 넓이 = " + ra.areaRectangle(10.5));
	}

}
