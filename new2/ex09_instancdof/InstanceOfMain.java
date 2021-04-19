package com.lec206.ex09_instancdof;

public class InstanceOfMain {

	public static void main(String[] args) {

		// ClassCastException발생
		// Parent parentA = new Parent();
		// Child child = (Child) parentA;
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("Child로 강제형변환 성공");
		} else {
			System.out.println("Child로 강제형변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("Child로 강제형변환 성공");
		
	}
}
