package com.lec206.ex10_abstract.method;

public abstract class Animal {
	
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound();
}
