package com.robot.v7;

import com.robot.v4.inter.InterFly;
import com.robot.v4.inter.InterMissile;
import com.robot.v4.inter.InterSword;

public class CheapRobot extends Robot {

	public CheapRobot(String name, InterFly fly, InterMissile missile, InterSword sword) {
		super(name, fly, missile, sword);
	}
	
	public void method() {
		System.out.println(("나만의 기능을 추가!!!"));
	}

}
