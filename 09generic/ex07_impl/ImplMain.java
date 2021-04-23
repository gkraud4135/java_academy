package com.lec206.ex07_impl;

/*
	제네릭타입의 상속과 구현
	
	제네릭타입도 다른 타입과 마찬가지로 부모클래스가 될 수 있다. 부모클래스에서
	상속받은 자식클래스는 부모클래스에 정의된 타입을 정의해야 한다.
	또한, 자식클래스는 타입파라미터를 추가할 수 있으며 제네릭 인터페이스를 구현한
	클래스도 제네릭타입으로 정의되어야 한다.
*/
public class ImplMain {

	public static void main(String[] args) {
		
		// 1. 클래스
		ChildProduct<TV, String, String> product = new ChildProduct<>();
		product.setKind(new TV());
		product.setModel("스마트TV");
		product.setCompany("LG전자");
		
		ChildProduct<Car, String, String> car = new ChildProduct<>();
		car.setKind(new Car());
		car.setModel("911카레라");
		car.setCompany("포르쉐");
		
		// 2. 인터페이스
		Storage<TV> 창고1 = new StorageImpl<>(10);
		창고1.add(new TV(), 0);
		창고1.add(new TV(), 1);
		TV tv = 창고1.get(0);
		System.out.println(tv);
		
		Storage<Car> 창고2 = new StorageImpl<>(10);
		창고2.add(new Car(), 0);
		Car car1 = 창고2.get(0);
		System.out.println(car1);
	}

}

interface Storage<T> {
	void add(T item, int index);
	T get(int index);
}

class StorageImpl<T> implements Storage<T> {
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}