package com.lec206.ex01_runtime;

/*
	NumberFormatException?
	
	프로그램을 개발하다 보면 문자열로 되어 있는 데이터를 숫자로 변환하는 경우가
	자주 발생한다. 문자열을 숫자로 변환할 때 해당 문자열이 숫자로 구성된 문자열
	이 아닐 경우 즉, 숫자로 변환될 수 없는 문자열일 겨웅에 발생되는 예외이다.
	
	문자열을 숫자로 변환하는 방법
	
	변환타입    메서드(매개변수)
	int         Integer.parseInt(Sting str);
	double      Double.parseDouble(String str);
*/
public class NumberFormatExceptionMain {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "100a";
		
		int val1 = Integer.parseInt(data1);
		System.out.println(val1);

		int val2 = Integer.parseInt(data2);
		System.out.println(val2);
	}

}
