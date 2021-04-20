package com.robot.v3;

public class SuperRobot extends Robot {

	public SuperRobot(String name) {
		this.name = name;
	}

	@Override
	public void actionFly() { System.out.println("날 수 있습니다!"); }
	
	@Override
	public void actionMissile() { System.out.println("미사일을 쏠 수 있습니다!"); }
	
	@Override
	public void actionSword() { System.out.println("레이저검이 있습니다!"); }	

}
