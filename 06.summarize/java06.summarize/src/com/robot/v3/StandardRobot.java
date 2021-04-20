package com.robot.v3;

public class StandardRobot extends Robot {

	public StandardRobot(String name) {
		this.name = name;
	}

	@Override
	public void actionFly() { System.out.println("날 수 없습니다!"); }
	
	@Override
	public void actionMissile() { System.out.println("미사일을 쏠 수 있습니다!"); }
	
	@Override
	public void actionSword() { System.out.println("목검이 있습니다!"); }	

}
