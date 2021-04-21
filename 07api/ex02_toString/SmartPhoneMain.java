package com.lec206.ex02_toString;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone("애플", "iOS");
		System.out.println(phone.toString());
		
		phone = new SmartPhone("LGE", "안드로이드");
		System.out.println(phone.toString());

	}

}
