package com.lec206.ex04_noname;

import com.lec206.ex02_implement.RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /* 실행문 */ }
			public void turnOff() { /* 실행문 */ }
			public void setVolume(int volume) { /* 실행문 */ }
		};
		
		// 익명인터페이스는 정적멤버는 접근이 불가능하사.
		// rc.changeBattery(); (x)
		
		RemoteControl smartRC = new RemoteControl() {
			public void turnOn() { /* 실행문 */ }
			public void turnOff() { /* 실행문 */ }
			public void setVolume(int volume) { /* 실행문 */ }
			public void serarch(String url) { System.out.println("검색기능..."); }
		};
		
		Test xxx = new Test() {
			void aaa() {};
			void bbb() {};
		};
		
		Test yyy = new Test() {
			void a() {}
			void b() {}
			void c() {}
		};
	}
}

interface Test {}







