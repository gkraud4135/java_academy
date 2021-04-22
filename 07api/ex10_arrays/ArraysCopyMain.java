package com.lec206.ex10_arrays;

import java.util.Arrays;

/*
	Arrays클래스
	
	Arrays클래스는 배열에 관한 조작기능을 지원한다. 배열의 복사, 배열항목의 정렬
	항목검색과 같은 기능을 제공하는 메서드를 가지고 있다.
	
	단순한 배열복사는 System.arraycopy()메서드를 사용할 수 있으나 Arrays는 추가적
	으로 항목정렬, 검색, 비교와 같은 기능을 제공한다. 
	
	Arrays관련 모든 메서드는 static이므로 Arrays클래스로 바로 접근할 수 있다.
*/
public class ArraysCopyMain {

	public static void main(String[] args) {
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		// 1. Arrays.copyOf()
		char[] arr2 = Arrays.copyOf(arr1, 4); // 0부터 지정숫자-1
		System.out.println(arr2);
		
		// 2. Arrays.copyOfRange()
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // from~to-1
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
		// 3. System.arraycopy()
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		for(int i=0;i<arr4.length;i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}

	}

}
