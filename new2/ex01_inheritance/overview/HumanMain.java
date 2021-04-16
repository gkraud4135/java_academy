package com.lec206.ex01_inheritance.overview;

public class HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.move();
		System.out.println();
		
		Adam adam = new Adam();
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		adam.move();
		System.out.println(adam.toString());
		System.out.println();
		
		// Eve eve = new Eve();
		Eve eve = new Eve("이브", "여자", 9000);
		eve.move();
		eve.makeBaby();
		System.out.println(eve.toString());
		System.out.println();
		
		Korean kor = new Korean();
		kor.speak();
	}

}
