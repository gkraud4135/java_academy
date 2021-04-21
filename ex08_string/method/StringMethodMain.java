package com.lec206.ex08_string.method;

public class StringMethodMain {

	public static void main(String[] args) {
		
		// 1. replace
		String old = "자바 프로그래밍";
		String _new = old.replace("자바", "JAVA");
		System.out.println(_new);
		
		// 2. substring
		String ssn = "951118-1234567";
		String birthday = ssn.substring(0, 6);
		System.out.println(birthday);
		String sno = ssn.substring(7);
		System.out.println(sno);

		// 3. toLowerCase, toUpperCase
		String str1 = "java programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		// 4. trim
		String tel1 = "    02";
		String tel2 = "1234  ";
		String tel3 = "  12  34  ";
		System.out.println(tel1.trim() + "." + tel2.trim() + "." + tel3.trim());
		
		// 5. valueOf
		String val1 = String.valueOf(false);
		String val2 = String.valueOf(10);
		String val3 = String.valueOf(10.5);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val2 + val3);
	}

}














