package com.lec206.ex05_objects;

import java.util.Arrays;
import java.util.Objects;

/*
	Objects 클래스
	
	2. 동등비교(equals(), deepEquals())
	
	   두 객체의 동등비교를 하는데는 2가지 방법이 있다.
	   
	   a. Objects.equals(Object a, Object b) : 객체가 참조하고 있는 객체를 비교
	      1) a와 b가 모두 null일 경우 true를 리턴
	      2) a와 b가 모두 not null일 경우 a.equals(b)의 결과를 리턴
	      
	   b. Obects.deepEquals(Object a, Object b) : 객체의 내부값까지 비교
	   
	      1) a와 b가 서로 다른 배열일 경우 항목의 값까지 모두 같을 경우 true를 리턴
	      2) deepEquals()는 Arrays.deepEquals(Object[] a, Object[] b)와 동일
*/
public class EqualsMain {

	public static void main(String[] args) {
		
		// 1. 객체(일반)일 경우
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println();
		
		// 2. 객체(배열)일 경우
		Integer[] a1 = {1,2};
		Integer[] a2 = {1,2};
		
		System.out.println(Objects.equals(a1, a2)); // 번지를 비교하기 때문에 false
		System.out.println(Objects.deepEquals(a1, a2)); // 내부값을 비교하기 때문에 true
		System.out.println(Arrays.deepEquals(a1, a2)); // 내부값을 비교하기 때문에 true
	}

}











