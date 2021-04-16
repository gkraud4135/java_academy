package com.lec206.ex03_constructor.field;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean hong = new Korean("홍길동", "991111-1234567");
		System.out.println(hong.nation + ", " + hong.name  + ", " + hong.ssn);
		
		Korean kim = new Korean();
		kim.name = "김태희";
		kim.ssn = "990101-2123456";
		System.out.println(kim.nation + ", " + kim.name  + ", " + kim.ssn);
		
		Korean steve = new Korean();
		steve.nation = "미국";
		steve.name = "스트비";
		steve.ssn = "1234567890";
		System.out.println(steve.nation + ", " + steve.name  + ", " + steve.ssn);
			
	}

}
