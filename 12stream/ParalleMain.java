package com.lec206.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleMain {

	public static void main(String[] args) {
		
		// 내부반복자를 이용해서 병렬처리
		
		List<String> list = Arrays.asList("홍길동", "홍길순", "소향", "손흥민", "홍길자");
		
		// 1. 순차처리
		Stream<String> stream = list.stream();
		stream.forEach(str -> System.out.println(str));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(ParalleMain :: print);
		System.out.println();
		
		// 2. 병렬처리
		stream = list.parallelStream();
		stream.forEach(str -> System.out.println(str));
		System.out.println();	
		
		stream = list.parallelStream();
		stream.forEach(ParalleMain :: print);
	}

	public static void print(String str) {
		System.out.println(str + "-" + Thread.currentThread().getName());
	}
}
