package com.lec206.ex10_abstract._class;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색!!!");
	}
	
}
