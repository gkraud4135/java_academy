package com.lec206.ex07_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
	수집(collect)
	
	스트림은 요소들을 filtering 또는 mapping한 후에 요소들을 수집하는 최종처리메서드인
	collect()메서드를 제공한다. Stream의 collect(Collector<T,A,R>)메서드는 필터링 또는
	매핑된 요소들을 새로운 collection에 수집하고 이 collection을 리턴한다.
	
	매개값인 Collector(수집기)는 어떤 요소들을 어떤 컬렉션에 수집할 것인지를 결정한다.
	collector의 타입파라미터 T는 요소, A는 누적기(Accumulator), R은 요소가 저장될 컬렉션
	을 의미한다.
	
	리턴값인 collector에는 Collector<T,?,R>처럼 누적기가 "?"로 되어 있는 경우도 있는데
	이것은 Collector가 T를 R에 저장하는 방법을 알고 있어서 A가 필요없기 때문이다.
	
	Map과 ConcurrentMap의 차이점 Map은 쓰레드에 안전하지 않고 ConcurrentMap은 쓰레드에
	안전하다. 멀티쓰레드환경에서는 ConcurrentMap을 사용하는 것이 좋다.
*/
public class CollectMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10, Student.Gender.MALE),
				new Student("홍길순", 6, Student.Gender.FEMALE),
				new Student("홍길녀", 10, Student.Gender.FEMALE),
				new Student("홍길상", 60, Student.Gender.MALE)
			);
		
		// 1. Collector로 남학생들만의 List컬렉션을 생성
		List<Student> maleList = list.stream()
				.filter(s -> s.getGender() == Student.Gender.MALE)//필터후에
				.collect(Collectors.toList()); //그것을 모아줌
		maleList.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		// 2. Collector로 여학생들만의 Set컬렉션을 생성
		Set<Student> femaleSet = list.stream()
				.filter(s -> s.getGender() == Student.Gender.FEMALE)
//				.collect(Collectors.toCollection(HashSet::new));
//				.collect(Collectors.toCollection(() -> { return new HashSet<Student>(); }));
				.collect(Collectors.toCollection(() -> new HashSet<Student>()));
		femaleSet.stream().forEach(s->System.out.println(s.getName()));

	}

}















