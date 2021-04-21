package com.lec206.ex08_string.token;

public class StringBuilderMain {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		// 1. 문자열추가
		sb.append("Java");
		sb.append(" Program Study");
		System.out.println(sb);
		
		// 2. 특정위치에 삽입
		sb.insert(4, "소향");
		System.out.println(sb);
		
		// 3. 특정위치의 문자를 대체
		sb.setCharAt(4, '김');
		System.out.println(sb);
		
		// 4. 특정위치의 문자열을 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb);

		// 5. 특정위치의 문자열을 삭제
		sb.delete(4, 5);
		System.out.println(sb);
		
		// 6. 문자열의 갯수
		System.out.println("총문자수 = " + sb.length());
		
		// 7. buffer에 있는 내용을 String으로 리턴
		String result = sb.toString();
		System.out.println(result);
		

		
	}

}
