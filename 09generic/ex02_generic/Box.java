package com.lec206.ex02_generic;

public class Box<T> {
	
	private T t;

	public T getObject() {
		return t;
	}

	public void setObject(T t) {
		this.t = t;
	}
}

class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}