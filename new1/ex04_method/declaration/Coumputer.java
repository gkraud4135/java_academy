package com.lec206.ex04_method.declaration;

public class Coumputer {

	// 실습1. 1~10까지의 합 결과를 리턴하는 메서드 생성
	int sum() {
		return 1+2+3+4+5+6+7+8+9+10;
	} 
	
	int sum(int a, int b, int c) {
		return a+b+c+49;
	}
	
	int sum(int[] a) {
		int result = 0;
		for(int i=1;i<=10;i++) {
			result += i;
		}
		return result;
	}
	
	int sum1(int ... values) {
		int result = 0;
		for(int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
}
