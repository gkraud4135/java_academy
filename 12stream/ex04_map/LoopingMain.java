package com.lec206.ex04_map;

import java.util.Arrays;

/*
	루핑(peek(), forEach())
	
	루핑(looping)은 요소 전체를 반복하는 것이다. 루핑메서드는 peek()와 forEach()가 있는데
	이 두메서드는 루핑한다는 기능은 동일하지만 peek()는 중간처리메서드이고 forEach()는 최
	종처리 메서드이다.
	
	peek()는 중간처리단계에서 전체요소를 루핑하면서 추가적인 작업을 하기 위해서 사용되며
	최종처리메서드가 처리되지 않으면 지연이 되기 때문에 반드시 최종처리메서드가 호출되어야
	동작한다. 요소처리의 최종단계가 합계를 구하는 것이라면 peek()호출후에 sum()을 호출해야
	만 peek()가 정상적으로 동작한다.
	
	하지만 forEach()는 최종처리메서드이기 때문에 파이프라인 마지막에 루핑하면서 요소를 하나
	씩 처리한다. forEach()는 요소를 최종처리하는 메서드이기 때문에 forEach()뒤에는 sum()과 
	같은 최종처리메서드를 호출하면 않된다.
*/
public class LoopingMain {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
		// 1. peek()
		Arrays.stream(intArr)
		      .filter(a -> a%2==0)
		      .peek(e -> System.out.println(e)); // peek()는 중간처리이기 때문에 종작하지 않음
		System.out.println();
		      
		// 2. 짝수합계 : 최종처리인 sum()
		int sum = Arrays.stream(intArr)
			            .filter(a -> a%2==0)
			            .peek(e -> System.out.println(e))
			            .sum();
		System.out.println("짝수의 합 = " + sum);
		System.out.println();
		
		// 3. forEach()와 sum()모두 최종처리단계이기 땜누에 에러발생
//		Arrays.stream(intArr)
//	      .filter(a -> a%2==0)
//	      .forEach(e -> System.out.println(e))
//	      .sum();
	}

}














