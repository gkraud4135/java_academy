package com.lec206.ex10_abstract._class;

public abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드
	public void turnOn() {
		System.out.println("파워온!!!");
	}
	
	public void turnOff() {
		System.out.println("파워오프!!!");
	}
}
