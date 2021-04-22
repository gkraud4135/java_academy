package com.lec206.ex02_generic;

/*
	제네릭(Generic)
	
	자바5부터 제네릭타입이 새로 추가 되었는데 제네릭타입을 사용함으로써 잘못된 타입이 사용될
	수 있는 문제를 컴파일단계에서 부터 방지할 수가 있게 되었다.
	제네릭은 컬렉션, 스트림, 람다식, NIO에서 널리 사용되기 때문에 제네릭을 이해하지 못하고서는
	API문서를 이해할 수가 없다.
	
	제네릭은 클래스와 인터페이스, 메서드를 정의할 때 타입을 매개값으로 사용할 수 있도록 한다.
	타입파라미터는 코드 작성시에 구체적인 타입으로 대체되어 다양한 코드를 생성할 수 있도록 한
	다. 
	
	제넥릭을 사용하는 이점은
	
	1. 컴파일시에 강한 타입체크를 할 수 있다.
	2. 타입변환을 제거한다.
	
	제네릭타입(클래스명<T>, 인터페이스명<T>)
	
	제네릭타입은 타입을 파라미터로 갖는 클래스와 인터페이스를 말한다. 제네릭타입은 클래스 또는
	인터페이스 이름뒤에 "<>"부호가 붙고 그 사이에 타입파라미터를 지정한다.
	
	타입파라미터는 변수명과 동일한 규칙에 따라 작성이 가능하지만 일반적으로 대문자 알파벳 한
	글자로 표현한다.
	
*/
public class BoxMain {

	public static void main(String[] args) {
		
		Box<Apple> box = new Box<>();
		box.setObject(new Apple());
		// box.setObject(1);
		// box.setObject("망치");
		
		Apple apple = box.getObject();
		// String str = (String) box.getObject(); // 컴파일단계에서 에러
		System.out.println(apple);
		
		Box<String> toolBox = new Box<>();
		toolBox.setObject("망치");
		String hammer = toolBox.getObject();
		System.out.println(hammer);		
	}

}
