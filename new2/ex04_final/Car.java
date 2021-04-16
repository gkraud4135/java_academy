package com.lec206.ex04_final;

public class Car {

	int speed;
	
	void speedUp() { speed += 1; }
	final void stop() { speed = 0; }
	
}
