package com.robot.v3;

// 생성자, 추상클래스, 추상메서드
public class RobotMain {
	
	public static void main(String[] args) {
		
		CheapRobot cheapRobot = new CheapRobot("Cheap");
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println();		
		
		// 블럭선택키 alt + shift + a
		StandardRobot standardRobot = new StandardRobot("Standard");
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot("Super");
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println();		

	}

}
