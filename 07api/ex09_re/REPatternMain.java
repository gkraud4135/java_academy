package com.lec206.ex09_re;

import java.util.regex.Pattern;

/*
	정규표현식과 Pattern클래스(java.util.regex.Pattern)
	
	문자열이 정해져 있는 형식(정규표현식 : Regular Expression)으로 구성되어
	있는지 검증할 때 사용한다.
	
	정규표현식을 작성하는 방법은 API에서 java.util.regex.Pattern클래스를 참조하면 된다.
	간단히 말해서 정규표현식은 문자 또는 숫자와 반복기호가 결합된 문자열이다.
	
	정규표현식 관련기호
	1. [] : 한개의 문자, [abc]는 a,b,c중 하나의 문자, [^abc]는 a,b,c이외의 문자를 의미
	2. \d : 한개의 숫자 [0-9]와 동일
	3. \w : 한개의 알파벳문자 또는 한개의 숫자 [a-zA-Z_0-9]
	4. \s : 공백
	5. ?  : 없거나 한개
	6. *  : 없거나 한개이상
	7. +  : 한개이상
	8. {n}: n개의 문자
	9. {n,}: 최소한 n개
   10. {n,m} : n개부터 m개까지
   11. ()    : 그룹핑
	
	예를 들어서 02-123-1234 or 010-1234-5678과 같은 전화번호를 표현한 정규식은
	전화번호일 경우 (02|010)-\d{3,4}-\d{4}
	이메일 경우 white@google.com -> \w+@\w+.(\.\w+)?
*/
public class REPatternMain {

	public static void main(String[] args) {
		
		// 1. 전화번호유효성체크
		String regExp = "(02|010|031|051)-\\d{3,4}-\\d{4}";
		String data = "000-1234-1234";
		
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		if(result) {
			System.out.println("정상적인 전화번호입니다!");
		} else {
			System.out.println("비정상적인 전화번호입니다. 다시 입력하세요!");
		}
		
		result = Pattern.matches(regExp, "051-123-1234");
		System.out.println(result);
		System.out.println();
		
		// 2. 이메일유효성체크
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "white@daum.net";

		result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		if(result) {
			System.out.println("정상적인 이메일입니다!");
		} else {
			System.out.println("비정상적인 이메일입니다. 다시 입력하세요!");
		}
	}

}
