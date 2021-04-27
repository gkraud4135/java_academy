package com.lec206.ex06_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 92),
				new Student("홍길순", 98),
				new Student("홍길자", 95)
			);

		// 1. 합계구하기(1) - sum()
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("합계 = " + sum);
				
		// 2. 합계구하기(2) - reduce(), 예외처리(x)
		sum = list.stream().mapToInt(Student::getScore).reduce((a,b) -> a+b).getAsInt();
		System.out.println("합계 = " + sum);

		// 3. 합계구하기(3) - reduce(), 예외처리(o)
		sum = list.stream().mapToInt(Student::getScore).reduce(0, (a,b) -> a+b);
		System.out.println("합계 = " + sum);
	}

}

class Student {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name + "-" + score;
	}
}