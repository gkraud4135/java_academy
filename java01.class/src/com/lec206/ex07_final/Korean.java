package com.lec206.ex07_final;

public class Korean {
	
	static final String NATION = "대한민국";
	String name;
	String ssn;
	
	public Korean (String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	

	@Override
	public String toString() {
		return "문자열";
	}
}
