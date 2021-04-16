package com.lec206.ex10_get_set;

public class Car1 {

	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getStop() {
		return stop;
	}
	
	public void setSpeed(int speed) {
		
		if (speed>300) {
			System.out.println("최고속도는 " + speed +" km를 넘을 수 없습니다.");
			this.speed = 0;
		} else {
			System.out.println("현재속도는 " + speed + " km입니다.");
			this.speed = speed;
		}
	}
	
	public void isStop(boolean stop) {
		
		if(speed == 0) {
			this.stop = true;
			System.out.println("자동차 운행중지");
		} else {
			this.stop = false;
			System.out.println("자동차 운행중!");
		}
	}
}
