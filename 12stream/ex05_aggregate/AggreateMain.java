package com.lec206.ex05_aggregate;

import java.util.Arrays;

/*
	기본집계(sum, average, count, max, min)
	
	집계(Aggregate)는 최종처리기능으로 요소들을 처리해서 카운트, 합계, 평균, 최소/최대값등과
	같이 하나의 값을 리턴하는 것을 말한다.
	
	집계는 대량의 데이터를 가공해서 축소하는 리덕션(Reduction)이라고 볼 수 있다. 스트림이 제공
	하는 기본 집계는
	
	1. count() : 요소들의 갯수를 리턴
	2. findFirst() : 첫번째 요소를 리턴
	3. max(Comparator<T>) : 요소들중 최대요소를 리턴
	4. min(Comparator<T>) : 요소들중 최소요소를 리턴
	5. average() : 요소들의 평균값을 리턴
	6. sum() : 요소들의 합계를 리턴
	
	이 집계요소에서 리턴하는 OptionalXXX()는 자바8에서 추가한 java.util패키지의 Optional,
	OptionalDoubel, OptionalInt, OptionalLong클래스 타입이다. 이들 객체에서 값을 얻기 위해서
	get(), getAsDouble(), getAsInt(), getAsLong()을 호출하면 된다.
	
	이 OptionalXXX클래스들은 저장하는 값의 타입입만 다를 뿐 제공하는 기능을 거의 유사하다.
	Optional클래스는 단순히 집계만 저장하는 것이 아니고 집계의 값이 존재하지 않을 경우 디폴트
	값을 설정할 수 있고 집계값을 처리하는 Comsumer도 등록할 수 있다.
*/
public class AggreateMain {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
		// 1. count()
		double count = Arrays.stream(intArr).filter(n -> n%2==0).count();
		System.out.println("2의 배수의 갯수는 " + (int) count + "개 입니다!");
		
		// 2. sum()
		long sum = Arrays.stream(intArr).filter(n -> n%2==0).sum();
		System.out.println("2의 배수의 합계는 " + (int) sum + " 입니다!");
		
		// 3. average()
		double avg = Arrays.stream(intArr).filter(n -> n%2==0).average().getAsDouble();
		System.out.println("2의 배수의 평균은 " + avg + " 입니다!");
		
		// 4. max()
		int max = Arrays.stream(intArr).filter(n -> n%2==0).max().getAsInt();
		System.out.println("2의 배수의 최대값은 " + max + " 입니다!");
		
		// 5. min()
		int min = Arrays.stream(intArr).filter(n -> n%2==0).min().getAsInt();
		System.out.println("2의 배수의 최소값은 " + min + " 입니다!");
		
		// 6. findFirst()
		int first = Arrays.stream(new int[] {1,2,4,5,6,3})
				          .filter(n -> n%3==0).findFirst().getAsInt();
		System.out.println("3의 배수의 첫번째값은 " + first + " 입니다!");
	}
}



















