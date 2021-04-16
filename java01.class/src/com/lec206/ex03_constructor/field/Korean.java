package com.lec206.ex03_constructor.field;

public class Korean {

	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean() {}
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
