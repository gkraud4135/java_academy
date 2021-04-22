package com.lec206.ex01_nongeneric;

public class BoxMain {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setObject("망치");
		// box.setObject(new String("망치"));
		
		String hammer = (String) box.getObject();
		System.out.println(hammer);
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
		String str = (String) box.getObject();
		System.out.println(apple);
	}

}
