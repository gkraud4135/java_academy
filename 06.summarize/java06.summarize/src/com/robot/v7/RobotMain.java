package com.robot.v7;

import com.robot.v4.impl.*;
import com.robot.v4.inter.*;

public class RobotMain {

	public static void main(String[] args) {
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", new FlyYes(), new MissileNo(), new SwordNo());
		robot.makeRobot();
		
		robot = new StandardRobot("Standard", new FlyNo(), new MissileYes(), new SwordWood());
		robot.makeRobot();
		
		robot = new SuperRobot("Super", new FlyYes(), new MissileYes(), new SwordLaser());
		robot.makeRobot();
	}

}
