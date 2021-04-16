package com.lec206.ex04_mothod.declaration.overloading;

public class RectangleArea {
//사각형의 넓이 구하기
//메서드 오버로딩
	double areaRectangle(double width, double height){
		return width + height;
	}
	double areaRectangle(double width){
		return width + width;
	}
}
