package com.lec206.ex05_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// OptionalXXX클래스의 메서드
		
		// 1. stream예외처리: try~catch 사용
		try {
			double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		} catch (Exception e) {
			System.out.println("저장된 값이 없습니다!");
		}
		
		// 2. isPresent() : 값이 존재여부를 boolean으로 리턴
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			System.out.println("평균값 = " + optional.getAsDouble());
		} else {
			System.out.println("저장된 값이 없습니다!");
		}
		
		// 3. orElse() : 값이 없을 경우 기본값을 설정
		double avg = list.stream().mapToInt(Integer :: intValue).average().orElse(0.0);
		System.out.println("평균값 = " + avg);
		
		// 4. ifPresent() 
		list.stream().mapToInt(Integer :: intValue).average()
			.ifPresent(a -> System.out.println("ifPresent() : 평균값 = " + a));
	}

}
