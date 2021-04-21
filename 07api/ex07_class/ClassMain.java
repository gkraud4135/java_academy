package com.lec206.ex07_class;

public class ClassMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Class cls = car.getClass();
		
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage());
		System.out.println(cls.getPackage().getName());
		System.out.println();
		
		// forName()
		try {
			Class _cls = Class.forName("com.lec206.ex07_class.Carxxx");
			System.out.println(_cls.getName());
			System.out.println(_cls.getSimpleName());
			System.out.println(_cls.getPackage());
			System.out.println(_cls.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}