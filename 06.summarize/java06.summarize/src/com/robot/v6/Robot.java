package com.robot.v6;

import com.robot.v4.inter.InterFly;
import com.robot.v4.inter.InterMissile;
import com.robot.v4.inter.InterSword;

public class Robot {

	String name;
	
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	public Robot() {}
	public Robot(String name) {
		this.name = name;
	}
	
	// 공통기능
	public void shape() { System.out.println(this.name + "Robot입니다! 팔,다리,머리,몸통이 있습니다."); }
	public void actionWalk() { System.out.println("걸을 수 있습니다!"); }
	public void actionRun() { System.out.println("달릴 수 있습니다!"); }	
	
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

	public void actionFly() {
		this.fly.fly();
	}

	public void actionMissile() {
		this.missile.missile();
	}

	public void actionSword() {
		this.sword.sword();
	}
	
}
