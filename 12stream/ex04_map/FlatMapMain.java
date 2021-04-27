package com.lec206.ex04_map;

import java.util.Arrays;
import java.util.List;

/*
	매핑(flatMapXXX(), mapXXX(), asXXXStream, boxed())
	
	매핑은 중간처리기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다. 스트림에서 
	제공하는 매핑메서드는 flatXXX(), mapXXX(), asXXXStream, boxed()가 있다.
	
	1. flatMapXXX() : 이 메서드는 요소를 대체하는 복수개의 요소들로 구성된 새로운 스트림을 반환한다.
	2. mapXXX() : 이 메서드는 요소를 대체하는 요소로 구성된 새로운 스트림을 반환한다.
	3. asDoubleStream(), asLongStream(), boxed()메서드
	   1) asDoubleStream()메서드는 IntStream의 int요소, LongStream의 long요소들을 double타입으로 반환한 후
	      DoubleStream을 생성한다.
	   2) asLongStream()은 IntStream의 int요소를 long요소로 타입변환을 해서 LongStream을 생성
	   3) boxed()메서드는 int, long, double료소를 Integer, Long, Double요소로 박싱해서 Stream을 생성
*/
public class FlatMapMain {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("java8 lambda", "stream mapping");
		list1.stream()
		     .flatMap(w -> Arrays.stream(w.split(" ")))
		     .forEach(w -> System.out.println(w));
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20, 30", "40,50,60,70 ");
		list2.stream()
		     .flatMapToInt(n -> {
		    	 String[] strArr = n.split(",");
		    	 int[] intArr = new int[strArr.length];
		    	 for(int i=0;i<strArr.length;i++) {
		    		 intArr[i] = Integer.parseInt(strArr[i].trim());
		    	 }
		    	 return Arrays.stream(intArr);})
		     .forEach(n -> System.out.println(n));
		
	}

}
