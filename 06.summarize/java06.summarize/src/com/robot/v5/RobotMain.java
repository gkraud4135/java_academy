package com.robot.v5;

import com.robot.v4.impl.*;

public class RobotMain {
	
	public static void main(String[] args) {
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap");
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyYes());
		robot.actionFly();
		robot.setMissile(new MissileNo());
		robot.actionMissile();
		robot.setSword(new SwordNo());
		robot.actionSword();
		System.out.println();
		
		robot = new StandardRobot("Standard");
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new SwordWood());
		robot.actionSword();
		System.out.println();
		
		robot = new SuperRobot("Super");
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyYes());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new SwordLaser());
		robot.actionSword();
		System.out.println();		
		
	}

}
