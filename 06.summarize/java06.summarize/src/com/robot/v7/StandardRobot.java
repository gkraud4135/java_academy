package com.robot.v7;

import com.robot.v4.inter.InterFly;
import com.robot.v4.inter.InterMissile;
import com.robot.v4.inter.InterSword;

public class StandardRobot extends Robot {

	public StandardRobot(String name, InterFly fly, InterMissile missile, InterSword sword) {
		super(name, fly, missile, sword);
	}
	
}
