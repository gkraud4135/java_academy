package com.lec206.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		String str3 = "홍길동";
		String str4 = "홍길동";
		
	
		Human adam = new Human();
		adam.name = "아담";
		adam.gender = "Male";
		adam.age = 10000;
		System.out.println(adam.name);
		adam.speak();
		adam.move();
		
		Human eve = new Human();
		eve.name = "이브";
		eve.gender = "Female";
		eve.age = 9000;
		System.out.println(eve.name);
		eve.speak();
		eve.move();
		System.out.println();
		
		Human kor = new Human();
		Human usa = new Human();
		
		kor.speak("한국");
		usa.speak("미국");
		adam.speak("천국");
		
		Car car = new Car();
		Tire tire = new Tire();
		
		
	}

}










