package com.lec206.ex08_string.method;

public class StringCharAtMain {

	public static void main(String[] args) {
		
		String ssn = "951118-42345678";
		char gender = ssn.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
		}
		

	}

}
