package com.lec206.ex02_super;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 주민=" + ssn + ", 번호=" + studentNo;
	}
}
