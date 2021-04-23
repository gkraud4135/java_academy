package com.lec206.ex04_method.method1;

/*
	제네릭메서드(<T,R> R method(T t))
	
	제네릭 메서드는 매개타입과 리턴타입으로 타입파라미터를 갖는 메서드를 말한다.
	메서드를 선언하는 방법은 리턴타입 앞레 <>기호를 추가하고 타입파라미터를 기술한
	후에 리턴타입과 매개타입으로 타입파라미터를 사용하면 된다.
	
	일반   : public String method(String a) {}
	제네릭 : public <T> Box<T> method(T t) {}
	-> public <타입파라미터,...> 리턴타입<T> 메서드명(매개변수) {}
	
	제네릭메서드는 2가지 방법으로 호출할 수 있다. 코드에서 타입파라미터의 구체적인 
	타입을 명시적으로 지정하거나 컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정
	할 수도 있다.
	
*/
public class GenericMethodMain {

	public static void main(String[] args) {
		
		Box<Integer> boxA = Util.boxing(100);
		int val1 = boxA.get();
		System.out.println(val1);

		Box<String> boxB = Util.<String>boxing("Hammer");
		String val2 = boxB.get();
		System.out.println(val2);
		
		Box<Apple> boxC = Util.<Apple>boxing(new Apple());
		//Box<Apple> boxC = Util.boxing(new Apple());
		Apple apple = boxC.get();
		System.out.println(apple);
	}

}

class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}