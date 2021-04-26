package com.lec206.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student("홍길동", 92),
										   new Student("홍길순", 90));
		
		Stream<Student> stream = list.stream();
		
		stream.forEach(s -> {
			String name = s.name;
			int score = s.score;
			System.out.println(name + "-" + score);			
		});
	}

}

class Student {
	
	public String name;
	public int score;
	
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