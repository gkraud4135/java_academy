package com.lec206.ex01_interface;

public interface Animal {

	String KIND = "";
	
	void sound();
	
	default void breath() {
		System.out.println("동물이 숨을 쉰다!");
	}

}
