package com.lec206.ex10_abstract.method;

public class AnimalMain {

	public static void main(String[] args) {

		// Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.breath();
		cat.breath();
		dog.sound();
		cat.sound();
		System.out.println();
		
		// 형변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println();
		
		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}
	
//	private static void animalSound(Dog dog) {
//		dog.sound();
//	}
//	private static void animalSound(Cat cat) {
//		cat.sound();
//	}
	
}
