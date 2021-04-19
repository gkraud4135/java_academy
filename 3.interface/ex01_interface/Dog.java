package com.lec206.ex01_interface;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍~~");
	}

	@Override
	public void breath() {
		System.out.println("강아지가 숨을 쉰다!!");
	}	
}
