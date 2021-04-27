package com.lec206.ex04_map;

import java.util.Arrays;

/*
	매칭(allMatch(), anyMatch(), noneMatch())
	
	스트림클래스는 최종처리단계에서 요소들이 특정조건에 만족하는지 여부를 조사할 수 
	있도록 3가지 매칭메서드를 제공하고 있다.
	
	allMatch()메서드는 모든 요소들이 매개값으로 주어진 조건에 만족여부를, anyMatch()는
	최소한 한개의 요소가 주어진 조건에 만족하는지를, noneMatch()는 모든 요소들이 만족
	하는지 여부를 조사하는 메서드이다.
*/
public class MachingMain {

	public static void main(String[] args) {
		
		int[] intArr = {2,4,6};
		
		// 1. allMatch()
		boolean result = Arrays.stream(intArr).allMatch(n -> n%2==0); // true
		System.out.println("전체가 2의 배수? " + result);
		
		result = Arrays.stream(intArr).allMatch(n -> n%4==0); // false
		System.out.println("전체가 4의 배수? " + result);
		System.out.println();
		
		// 2. anyMatch()
		result = Arrays.stream(intArr).anyMatch(n -> n%2==0); // true
		System.out.println("일부가 2의 배수? " + result);
		
		result = Arrays.stream(intArr).anyMatch(n -> n%4==0); // true
		System.out.println("일부가 4의 배수? " + result);
		System.out.println();
		
		// 3. noneMatch()
		result = Arrays.stream(intArr).noneMatch(n -> n%3==0); // false
		System.out.println("요소중에 3의 배수? " + result);

	}

}
