package com.lec206.ex01_runtime;

public class ClassCastingExceptionMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		changeDog(dog);
		changeDog(cat);

	}

	private static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
		System.out.println(dog.toString());
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
