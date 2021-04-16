package com.lec206.ex10_get_set;

public class Car {

	// 필드
	private int speed = 100;
	private boolean stop = false;
	
	// 메서드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void isStop(boolean stop) {
		this.stop = stop;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getStop() {
		return stop;
	}
	
}
