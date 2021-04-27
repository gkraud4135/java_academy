package com.lec206.ex04_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AsDoubleAndBoxedMain {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5};
		
		// 1. asDoubleStream() -> int, long을 double로 변환후에 stream으로 리턴
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(n -> System.out.println(n));
													//1.0 2.0 3.0 ~
		// 2. boxed() -> int, long, double을 wrapper class로 즉, Integer, Long, Double로 박싱한 후 stream을 리턴
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(n -> System.out.println(n.intValue()));

	}

}
