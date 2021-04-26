package com.lec206.ex02_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
	Stream의 종류
	
	자바8부터 새로 추가된 java.util.stream패키지에는 stream API들이 포함되어 있다. stream의 종류는
	BaseStream 인터페이스와 이를 구현한 Stream, IntStream, LongStream, DoubleStream이 있다.
	BaseStream에는 모든 스트림에서 사용할 수 있는 공통메서드가 정의되어 있을 뿐 코드에서 직접 사용
	되지 않는다. 하위 스트림이 직접적으로 이용되는 스트림인데 Stream은 객체요소를 처리하는 스트림이고
	IntStream, LongStream, DoubleStream은 각각 기본 타입인 int, long, double요소를 처리하는 스트림이다.
	
	스트림을 얻는 방법
	
	1. 컬렉션으로 부터 얻기
	2. 배열로 부터 얻기
	3. 숫자범위로 부터 얻기
	4. 파일로 부터 얻기
	5. 디렉토리로 부터 얻기
*/
public class FromCollectionMain {

	public static int sum;
	
	public static void main(String[] args) {
		
		// 1. from collection
		List<Student> list = Arrays.asList(new Student("홍길동", 92), new Student("홍길순", 90));
		
	    Stream<Student> student = list.stream();
	    student.forEach(s -> System.out.println(s.getName() + "-" + s.getScore()));
	    System.out.println();
	    
	    // 2. from Arrays
	    String[] names = {"홍길동", "홍길순", "소향"};
	    Stream<String> arrStream = Arrays.stream(names);
	    arrStream.forEach(n -> System.out.print(n + ", "));
	    System.out.println();
	    
	    int[] intArray = {1,2,3,4,5};
	    IntStream intStream = Arrays.stream(intArray);
	    intStream.forEach(a -> System.out.print(a + ","));
	    System.out.println();
	    
	    // 3. 숫자범위로부터 얻기
	    IntStream stream = IntStream.rangeClosed(1, 100);
	    stream.forEach(n -> sum += n);
	    System.out.println("1~100까지의 합 = " + sum);
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