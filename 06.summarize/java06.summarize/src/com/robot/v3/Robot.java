package com.robot.v3;

public abstract class Robot {
	
	String name;
	
	// 생성자
	public Robot() {}
	public Robot(String name) {
		this.name = name;
	}
	
	// 공통기능
	public void shape() { System.out.println(this.name + "Robot입니다! 팔,다리,머리,몸통이 있습니다."); }
	public void actionWalk() { System.out.println("걸을 수 있습니다!"); }
	public void actionRun() { System.out.println("달릴 수 있습니다!"); }	
	
	// 반드시 구현할 메서드(추상)
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
}
