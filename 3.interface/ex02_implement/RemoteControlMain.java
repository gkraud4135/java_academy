package com.lec206.ex02_implement;

public class RemoteControlMain {

	public static void main(String[] args) {
		
//		Audio audio = new Audio();
//		Television tv = new Television();
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.setMute(true);
		rc.turnOff();		
	}

}
