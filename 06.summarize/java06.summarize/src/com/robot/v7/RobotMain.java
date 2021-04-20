package com.robot.v7;

import com.robot.v4.impl.*;
import com.robot.v4.inter.*;

public class RobotMain {

	public static void main(String[] args) {
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap");
		makeRobot(robot, new FlyNo(), new MissileNo(), new SwordNo());

		robot = new StandardRobot("Standard");
		makeRobot(robot, new FlyYes(), new MissileNo(), new SwordWood());
		
		robot = new SuperRobot("Super");
		makeRobot(robot, new FlyYes(), new MissileYes(), new SwordLaser());
	}

	public static void makeRobot(Robot robot, 
			InterFly fly, InterMissile missile, InterSword sword) {
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.actionFly(fly);
		robot.actionMissile(missile);
		robot.actionSword(sword);
		System.out.println();		
		
	}

}
