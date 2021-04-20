package com.robot.v4;

import com.robot.v4.inter.InterFly;
import com.robot.v4.inter.InterMissile;
import com.robot.v4.inter.InterSword;

public class StandardRobot extends Robot {

	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	// 생성자
	public StandardRobot(String name) {
		this.name = name;
	}

	// setter 생성
	public void setFly(InterFly fly) {
		this.fly = fly;
	}

	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}

	public void setSword(InterSword sword) {
		this.sword = sword;
	}

	@Override
	public void actionFly() {
		this.fly.fly();
	}

	@Override
	public void actionMissile() {
		this.missile.missile();
	}

	@Override
	public void actionSword() {
		this.sword.sword();
	}
	
}
