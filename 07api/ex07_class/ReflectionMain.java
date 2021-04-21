package com.lec206.ex07_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
	Reflection(getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods())
	
	Class객체를 이용하면 클래스의 필드, 생성자, 메서드정보를 알 수가 있다.
*/
public class ReflectionMain {

	public static void main(String[] args) throws Exception {
		
//		Class cls = Class.forName("com.lec206.ex07_class.Car");
		Class cls = Class.forName("java.lang.String");
		
		// 1. 클래스의 정보
		System.out.println("[1. 클래스이름 ]");
		System.out.println(cls.getName());
		System.out.println();
		
		// 2. 필드 정보
		System.out.println("[2. 필드 정보 ]");
		Field[] fields = cls.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		// 3. 생성자 정보
		System.out.println("[3. 생성자 정보 ]");
		Constructor[] constructors = cls.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 4. 메서드 정보
		System.out.println("[4. 메서드 정보 ]");
		Method[] methods = cls.getDeclaredMethods();
		for(Method method:methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
	}

	private static void printParameter(Class[] parameters) {
		for(int i=0;i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) System.out.print(", ");
		}
		
	}

}

class Car {
	
	private String model;
	private String owner;
	
	public Car() {}
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
