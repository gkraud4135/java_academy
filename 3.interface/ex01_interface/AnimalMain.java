package com.lec206.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.breath();
		animal.sound();
	}

}
