package com.lec206.ex05_bounded;

/*
	제한된 타입파라미터(<T extends 최상위타입>)
	
	타입파라미터에 지정되는 구체적인 테이터타입을 제한할 필요가 있을 경우. 예를 들어
	숫자를 연산하는 제네릭메서드가 있다면 이 메서드는 매개값으로 숫자만 대입이 되어야
	한다. 즉, 매개값을 Number 또는 하위클래스(Byte, Short...)의 인스턴스(객체)만 대입
	되어야 한다. 이것이 제한된 타입파라미터(Bounded Type Parameter)가 필요한 이유이다.
	
	제한된 파라미터를 선언하려면 타입파라미터 뒤에 extends키워드를 붙이고 상위 타입을
	명시하면 된다. 상위 타입은 클래스 뿐만 아니라 인터페이스도 가능한데 인터페이스라고
	해서 implements를 사용하지 않고 클래스와 동일하게 extends키워드를 사용한다.
	
	타입파라미터에 지정되는 구체적인 타입은 상위타입이거나 상위타입의 하위 또는 구현
	클래스만 가능하다.
	
*/
public class BoundedMain {

	public static void main(String[] args) {
		
		// Util.compare()메서드는 Number와 하위자손타입만 대입되도록 제한되어 있다.
		// int val = Util.compare("A", 20); (x)

		int result = Util.compare(10, 20); // -1
		System.out.println(result);
		
		result = Util.compare(4.5, 1.0); // 1
		System.out.println(result);
		
		result = Util.compare(2, 2); // 0
		System.out.println(result);
		
	}

}
