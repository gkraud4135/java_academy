package com.lec206.ex01_inheritance.overview;

public class Human {
	
	String name;
	String gender;
	int age;
	
	// Human() {}
	// Human(String name) {}
	
	void speak() {
		System.out.println("말을 한다.");
	}

	void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	void move() {
		System.out.println("움직인다.");
	}
	
	@Override
	public String toString() {
		return "이름=" + name + ", 성별=" + gender +
				", 나이=" + age;
	}	
}
