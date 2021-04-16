package com.lec206.ex01_inheritance.overview;

public class Eve extends Human {

	public Eve() {
		
		// super();
		
		name = "이브";
		gender = "여자";
		age = 9000;
	}
	
	Eve(String name, String gender, int age) {
		
		// super();
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	void move() {
		System.out.println("음식을 만든다.");
	}
	
	void makeBaby() {
		System.out.println("아이를 갖는다!");
	}
	
}
