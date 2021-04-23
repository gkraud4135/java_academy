package com.lec206.ex01_list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListMain {

	public static void main(String[] args) {
		
		// ArrayList를 생성하고 런타임시에 필요에 따라 객체를 추가하는 것이 
		// 일반적인 방법이지만 고정된 객체로 구성된 list를 생성할 때도 있는데
		// 이런 경우에 Arrays.asList(t0, ...tn)메서드를 사용하는 것이 편리하다.
		String[] names = {"홍길동", "홍길순", "홍길자", "소향"};
		
		List<String> list = Arrays.asList("홍길동", "홍길순", "홍길자", "소향");
		
		// asList()메서드는 편리하게 List 컬렉션으로 만들 수 있지만
		// 이 메서드로 생선된 list는 고정된 객체이기 때문에 추가, 삭제는 불가능
		// list.add("류관순"); (x)
		// list.remove("홍길동"); (x)
		
		for(String name:list) {
			System.out.println(name);
		}
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		List<Apple> apples = Arrays.asList(new Apple(), new Apple());
		for(Apple apple:apples) {
			System.out.println(apple);
		}
	}
}

class Apple {}
