package com.robot.v7;

import com.robot.v4.inter.*;

public class Robot {

	// 필드
	String name;
	InterFly fly;
	InterMissile missile;
	InterSword sword;

	// 생성자
	public Robot(String name, InterFly fly, InterMissile missile, InterSword sword) {
		this.name = name;
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}
	
	// 공통기능
	public void shape() { System.out.println(this.name + "Robot입니다! 팔,다리,머리,몸통이 있습니다."); }
	public void actionWalk() { System.out.println("걸을 수 있습니다!"); }
	public void actionRun() { System.out.println("달릴 수 있습니다!"); }	

	public void actionFly(InterFly fly) { fly.fly(); }
	public void actionMissile(InterMissile missile) { missile.missile(); }
	public void actionSword(InterSword sword) { sword.sword(); }

	public void makeRobot() {
		shape();
		actionWalk();
		actionRun();
		actionFly(fly);
		actionMissile(missile);
		actionSword(sword);
		System.out.println();			
	}	
}
