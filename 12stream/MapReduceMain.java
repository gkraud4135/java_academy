package com.lec206.ex01_intro;

import java.util.Arrays;
import java.util.List;

public class MapReduceMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student("홍길동", 92),
				   new Student("홍길순", 85),
				   new Student("손흥민", 92));		
		
		// 중간처리(학생객체를 점수로 매핑) -> 최종처리(평균)
		double avg = list.stream()
				         .mapToInt(Student :: getScore)
				         .average()
				         .getAsDouble();
		System.out.println("평균점수 = " + avg);
		
		// 총점
		int sum = list.stream()
				      .mapToInt(Student :: getScore)
				      .sum();
		System.out.println("합계점수 = " + sum);
		
	}

}
