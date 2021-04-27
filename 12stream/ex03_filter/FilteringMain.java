package com.lec206.ex03_filter;

import java.util.Arrays;
import java.util.List;

/*
	 필터링(filter(), distinct())
	 
	 필터링은 중간처리기능으로 특정요소를 걸러내는 역할을 한다. 필터링 메서드중 distinct()메서드는
	 중복을 제거하는데 Stream의 경우 Object.equals(Object)가 true이면 동일한 객체로 판단하고 중복을
	 제거한다. IntStream, LongStream, DoubleStream은 동일값일 경우 중복을 제거한다
	 
	 filter()메서드는 매개값으로 주어진 Predicate가 true를 리턴하는 요소만 필터링을 한다.
*/
public class FilteringMain {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "소향", "손흥민", "소향", "홍길자", "홍길동");
		
		// 1. 중복제거  distinct()
		names.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
				
		// 2. 필터링 : "소"로 시작하는 자료만 필터링 n은 그냥지역변수 /소로 시작하는
		names.stream().filter(n -> n.startsWith("소")).forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream().distinct().filter(n -> n.startsWith("소")).forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream().filter(n -> n.startsWith("소")).distinct().forEach(n -> System.out.println(n));
	}

}

