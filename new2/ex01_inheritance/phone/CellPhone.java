package com.lec206.ex01_inheritance.phone;

public class CellPhone {
	
	// 필드
	String model;
	String color;
	
	// 생성자
	// public CellPhone() {}
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메서드
	void powerOn() {
		System.out.println("파원온!!");
	}
	
	void powerOff() {
		System.out.println("파워오프!!");
	}
	
	void bell() {
		System.out.println("따르릉~~");
	}
	
	void sendCVoice(String message) {
		System.out.println("나:" + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("너:" + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다!");
	}
}
