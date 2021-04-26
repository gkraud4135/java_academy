package com.lec206.ex01_intro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
	Stream(스트림)?
	
	스트림은 자바8부터 추가된 컬렉션(배열포함)의 저장요소를 하나씩 참조해서 람다식(함수적
	스타일 functional-style)으로 처리할 수 있도록 해주는 반복자이다.
	
	자바7이전까지는 List<String>컬렉션에서 요소를 순차적으로 처리하기 위해서는 Iterator
	반복자를 사용해 왔지만 컬렉션의 stream()메서드로 스트림객체를 얻고난 후에 람다시으로
	컬렉션의 요소를 하나씩 처리할 수가 있다.
	
	Iterator와 Stream을 비교해 보변 Stream을 사용하는 것이 훨씬 단순하게 사용할 수 있다.
	Stream은 Iterator와 비슷한 역할을 하는 반복자이지만 람다식으로 요소처리코드를 제공하
	는 점과 내부반복자를 사용함으로써 병렬처리가 쉽다는 점이다. 또한, 중간처리, 최종처리
	작업을 수행한다는 점에서 많은 차이가 있다.
	
	1. 람다식으로 요소처리를 할 수 있도록 코드를 제공한다.
	
	   Stream이 제공하는 대부분의 요소처리 메서드는 @FunctionalInterface매개타입을 가지기
	   때문에 람다식 또는 메서드참조를 이용해서 요소처리내용을 매개값으로 전달 할 수가 있다.
	   
	2. 내부반복자를 사용함으로써 병렬처리가 쉽다.
	
	   외부반복자란 개발자가 코드를 직접 컬렉션의 요소를 반복해서 가져오는 코드 패턴을 말한다.
	   index를 이용하는 for 또는 Iteratro을 이용하는 while문 모두 외부 반복자를 이용하는 것이
	   지만 내부반복자는 컬렉션 내부에서 요소를 반복시키고 개발자는 요소당 처리해야할 코드만
	   제공하는 코드 패턴을 말한다.
	   
	   스트림을 이용하면 코드도 간결해지지만 무엇보다도 요소의 병렬처리가 컬렉션 내부에서 처리
	   된다. 병렬처리란 한가지 작업을 서브작업으로 나누고 서브작업을 분리된 쓰레드에서 병렬적
	   으로 처리하는 것을 말한다.
	   
	3. 스트림은 중간처리와 최종처리를 할 수 있다.
	
	   스트림은 컬렉션의 요소에 대해 중간처리와 최종처리를 수행할 수 있는데 중간처리는 매핑
	   필터링, 정렬을 수행하고 최종처리에서는 반복, 카운팅, 평균, 총함등의 집계처리를 수행
	   한다.
*/
public class StreamMain {

	public static void main(String[] args) {
		// 실습 
		// Arrays 홍길동, 손흥민, 소향
		// List컬렉션프레임워크로 저장
		// 각각의 값을 출력
		// hint) 
		// 1) Arrays의 asList() -> List객체를 생성
		// 2) Iterator를 이용해서 출력     
		
		List<String> list = Arrays.asList("홍길동", "손흥민", "소향");

		// 1. 외부반복자 Iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		// 2. 내부반복자 Stream
		Stream<String> stream =  list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
