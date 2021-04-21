package com.lec206.ex03_clone.deep;

import java.util.Arrays;

public class Member implements Cloneable {

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int scores[] = {90,88,92};
	public Car car;
	
	public Member(String id, String name, String password, 
			int age, boolean adult, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.car = car;
	}
	
	public Member getMember() {
		
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cloned;	
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 1. 얕은 복제
		Member cloned = (Member) super.clone();
		
		// 2. 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
				
		return cloned;
	}
}

class Car {
	
	public String model;
	
	public Car(String model) {
		this.model = model;
	}
}






