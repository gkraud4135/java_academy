package com.lec206.ex04_map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
	정렬(sort)
	
	스트림은 요소가 최종적으로 처리되기 전에 중간단계에서 요소를 정렬해서 최종처리로 전달한다.
	전달되는 요소가 객체일 경우에는 해당 객체의 클래수가 Comparable를 구현하지 않으면 sorted()
	메서드를 호출했을 경우 ClassCastingException이 발생하기 때문에 Comparable을 구현한 요소(객체)
	에만 sorted() 메서드를 호출해야 한다.
	
*/
public class SortingMain {

	public static void main(String[] args) {
		// 1. 기본타입 정렬
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted().forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		// 2. 객체(Student)타입 정렬
		List<Student1> list = Arrays.asList(
			new Student1("홍길동", 90),
			new Student1("홍길순", 95),
			new Student1("홍길자", 89));
		
		// 1) 오름차순
		list.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		
		// 2) 내림차순
		list.stream()
		    .sorted(Comparator.reverseOrder())
		    .forEach(s -> System.out.println(s.getName() +"-"+ s.getScore()));
	}

}

class Student1 implements Comparable<Student1> {

	private String name;
	private int score;
	
	public Student1(String name, int score) {
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
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		// 점수를 기준으로 Student객체를 오름차순으로 정렬하기 위해
		// compareTo()메서드를 재정의했다.
		return Integer.compare(score, o.score); // -1,0,1
	}
}