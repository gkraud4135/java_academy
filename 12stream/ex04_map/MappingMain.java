package com.lec206.ex04_map;

import java.util.Arrays;
import java.util.List;

public class MappingMain {

	public static void main(String[] args) {
	
		List<Student> list = Arrays.asList(
				new Student("홍길동", 92),
				new Student("홍길순", 90)
			);

		list.stream().mapToInt(Student :: getScore).forEach(s -> System.out.println(s));
		//map flat의 차이 map은 새로구성해서 리턴한다
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
}
