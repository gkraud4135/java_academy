package com.lec206.ex01_noarg;

/*
	람다식이란?
	
	자바는 함수적 프로그래밍을 위해 자바8부터 람다식(Lambda Expression)을 지원하면서
	기존의 코드패턴이 많이 달라졌다. 람다식은 수학자 알론조처치가 발표한 계산법에서
	사용된 식으로 이를 제자 존 메카시가 프로그램언언에 도입했다.
	
	람다식은 익명함수를 생성하기 위한 식으로 객체지향언어보다 함수지향언어에 가깝다.
	자바에서 람다식을 수용한 이유가 자바코드가 매우 간결해 지고 컬렉션의 요소를 필터링
	하거나 매핑해서 원하는 결과를 쉽게 집꼐할 수 있기 때문이다. 람다식의 형태는 매개
	변수를 가진 코드블럭이지만 런타임시에는 익명구현객체를 생성한다.
	
	1. 기본문법 : () -> { ... }
	
	   (매개변수 ...) -> { ... }
	   
	   람다식에서는 런타임시에 대입되는 값에 따라 자동으로 인식될 수 있기 때문에 람다식
	   에서는 매개변수의 타입을 일반적으로 정의하지 않는다.
	   
	      (int a) -> { System.out.println(a); }
	   or (a)     -> { System.out.println(a); }
	   or a       -> { System.out.println(a); } : 소괄호가 없는 경우는 매개변수가 하나만 있을 경우에 가능
	   or a       -> System.out.println(a);     : 중괄호가 없는 경우는 실행문이 하나만 있을 경우에 가능
	   
	2. 타겟함수와 함수적 인터페이스
	
	   람다식형태는 매개변수를 가진 코드블럭이기 때문에 자바의 메서드를 선언하는 것 처럼 보여지지만
	   자바는 메서드를 단독으로 선언할 수 없고 항상 클래스의 구성멤버로 선언하기 때문에 람다식은 단
	   순히 메서드를 선언하는 것이 아니라 이 메서드를 가지고 있는 객체를 생성한다.
	   
	   람다식은 인터페이스 변수에 대입된다. 이말은 람다식은 인터페이스의 익명구현객체를 생성한다라는
	   뜻이다. 인터페이스는 직접 객체화할 수 없기 때문에 구현 클래스가 필요한데 람다식은 익명구현객
	   체를 생성하고 객체화 한다.
	   
	   람다식은 대입될 인터페이스의 종류에 따라 달라지기 때문에 람다식이 대입될 인터페이스를 람다식
	   의 타겟타입이라고 한다.
	   
	3. 함수적 인터페이스(Functional Interface)
	
	   모든 인터페이스를 람다식의 타겟타입으로 사용할 수는 없다. 람다식이 하나의 메서드를 정의하기 
	   때문에 한 개이상의 추상메서드가 선언된 인터페이스는 람다식을 이용해서 구현객체를 생성할 수 
	   없다.
	   
	   하나의 추상메서드가 선언된 인터페이스만이 람다식의 타겟타입이 될 수 있는데 이러한 인터페이스
	   를 함수적 인터페이스라고 한다. 
	   함수적 인터페이스를 작성할 때 2 개이상의 추상메서드가 선언되지 않도록 컴파일러가 확인할 수 있
	   도록 인터페이스 선언시에 @FunctionalInterface 애너테이션을 선언한다.
*/
public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		// 1. 익명구현객체
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("Functional Interface 메서드 구현 = 익명구현객체");
			}
		};
		fi.method();
		
		// 2. 람다식
		fi = () -> { System.out.println("Functional Interface 메서드 구현 = 람다식(1)"); }; 
		fi.method();
		
		fi = () -> System.out.println("Functional Interface 메서드 구현 = 람다식(2)"); 
		fi.method();		
		
	}

}

@FunctionalInterface
interface MyFunctionalInterface {
	void method();
}
