package com.lec206.ex11_wrapper;

/*
	Wrapper Class(포장클래스)
	
	자바는 기본타입(byte, int...double, boolean)은 객체로 생성할 수 없기 때문에 기본타입의
	데이터를 객체로 생성할 수 있도록 하는데 이런 객체를 포장객체라고 한다.
	이름에서 알 수 있듯이 기본타입의 값을 내부에 두고 포장하기 때문에 포장객체라고 한다.
	
	포장객체는 포장하고 있는 내부의 기본타입의 값은 외부에서 변경할 수 없다. 만약 내부의 값
	ㅇㄹ 변경하고 싶을 경우에는 새로운 포장객체를 만들어야 한다.
	
	포장 클래스는 java.lang패키지에 포함되어 있는데 기본타입에 대응하는 각각의 클래스가 있다.
	char와 int는 각각 Character, Integer로 변경되고 나머지는 기본타입의 첫글자를 대문자로 바
	꾼 이름의 클래스를 가지고 있다.
	
	기본자료형 대신에 포장클래스를 사용하는 이유
	1. 객체 또는 클래스가 제공하는 메서드를 사용할 수 있다.
	2. 클래스가 제공하는 상수를 사용할 수 있다.(MIN_VALUE or MAX_VALUE 등)
	3. 숫자, 문자로의 형변환 또는 진법변환시에 사용할 수 있다.
	
	Boxing, Unboxing?
	
	기본타입의 값을 포장객체로 만드는 과정을 Boxing이라고 하고 반대로 포장객체에서 기본타입의
	값을 얻어내는 과정을 Unboxing이라고 한다.
	
	자동박싱과 자동언박싱?
	
	기본타입의 값을 직접 박싱, 언박싱하지 않아도 자동적으로 박싱과 언박싱이 되는 것을 말한다.
	자동박싱은 포장클래스에 기본값이 대입이 되는 경우를 말하고 자동언박싱은 기본타입에 포장
	객체가 대입이 되는 경우에 발생한다.
	
*/
public class BoxingUnBoxingMain {

	public static void main(String[] args) {
		
		int num = 100;
		Integer obj1 = new Integer(100);
		System.out.println(obj1.MIN_VALUE);
		System.out.println(obj1.MAX_VALUE);
		
		// 1. 수동박싱
		Integer obj2 = new Integer("100");     // 생성자이용
		Integer obj3 = Integer.valueOf("100"); // 메서드이용
		Integer obj4 = Integer.valueOf(100); // 메서드이용
			
		// 2. 수동언박싱 : 기본타입명+Value()
		int val1 = obj1.intValue(); 
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		
		// 3. 자동박싱
		Integer obj = 100;
		
		// 4. 자동언박싱
		int result1 = obj;
		int result2 = obj + 100;
		System.out.println(result2);
	}

}