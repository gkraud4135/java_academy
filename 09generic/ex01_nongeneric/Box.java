package com.lec206.ex01_nongeneric;

public class Box {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}