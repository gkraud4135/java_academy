package com.lec206.ex02_generic;

public class BoxMain {

	public static void main(String[] args) {
		
		Box<Apple> box = new Box<>();
		box.setObject(new Apple());
		// box.setObject(1);
		// box.setObject("망치");
		
		Apple apple = box.getObject();
		// String str = (String) box.getObject(); // 컴파일단계에서 에러
		System.out.println(apple);
		
		Box<String> toolBox = new Box<>();
		toolBox.setObject("망치");
		String hammer = toolBox.getObject();
		System.out.println(hammer);		
	}

}
