package com.lec206.ex04_member;

public class UsingThisMain {

	public static void main(String[] args) {
		
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
		

	}

}
