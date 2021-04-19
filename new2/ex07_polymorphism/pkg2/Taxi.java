package com.lec206.ex07_polymorphism.pkg2;

public class Taxi extends Vehicle  {

	@Override
	public void run() {
		System.out.println("택시를 운전합니다!");
	}
}
