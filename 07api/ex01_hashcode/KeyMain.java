package com.lec206.ex01_hashcode;

public class KeyMain {

	public static void main(String[] args) {
		
		Key key = new Key(1);
		
		System.out.println(key.toString());
		System.out.println(key.hashCode());
	}
}
