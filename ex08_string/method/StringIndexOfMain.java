package com.lec206.ex08_string.method;

public class StringIndexOfMain {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int loc = subject.indexOf("프로그래밍");
		System.out.println(loc);
		
		loc = subject.indexOf("프로그램");
		System.out.println(loc);
		
		if(subject.indexOf("자바") >= 0) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}

	}

}
