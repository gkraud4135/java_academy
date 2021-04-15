package com.lec206.ex02_member;

/*

 	클래스의 멤버
 	
 	1. 필드(속성, 클래스변수)
 	
 	   객체의 고유속성을 저장하는 곳이다. 선언방법은 변수와 유사하지만 필드를
 	   변수라고 부르지 않는다.
 	   
 	   변수는 생성자에 메서드내에서만 사용되고 생성자와 메서드의 실행이 종료가
 	   되면 자동으로 소멸되지만 필드는 생성자와 메서드 전체에서 사용되고 객체가
 	   소멸되지 않는한 객체와 함께 메모리에 존재한다.
 	   
 	2. 생성자(Constructor)
 	
 	   생성자는 new연산자로 호출되는 특별한 코드 블럭이다. 생성자의 역할은 객체를
 	   생성할 때 초기화를 담당한다. 즉, 필드를 초기화 하거나 메서드를 호출해서
 	   객체를 사용할 수 있도록 한다.
 	
 	   기본생성자(default constructor)
 	   
 	   모든 클래스는 생성자가 반드시 존재해야 하며, 한개 이상의 생성자를 가질 수 있다.
 	   단, 복수의 생성자를 정의할 경우에는 시그니처 즉, 매개변수의 갯수, 데이터타입 및
 	   순서가 달라야 한다. 즉, 동일한 형태의 시그니처를 가지는(중복되는) 생성자를 정의할
 	   수 없다.
 	   
 	   기본생성자는 별도로 정의하지 않아도 자바 컴파일러(javac.exe)가 자동으로 추가한다.
 	   하지만 개발자가 기본생성자 이외의 생성자를 정의했을 경우에는 자동으로 추가되지 않
 	   는다.
 	   
 	   클래스가 public 접근제한자로 선언이 되면 기본 생성자도 자동으로 public이 되지만
 	   클래스에 public이 없다면 기본생성자에도 붙지 않는다.
 	   
 	3. 메서드(Method)
 	
 	   메서드는 객체의 동작(기능, 행위)에 해당하는 블럭이다. 이 블럭은 이름을 부여
 	   하고 이 이름으로 메서드를 호출하게 되면 블럭안에 정의된 실행문들이 일괄적으로
 	   실행이 되고 결과를 리턴하게 된다.

*/
public class Car {

	// 필드
	String company = "벤츠";
	String model;
	String color;
	int maxSpeed = 200;
	int speed;
	
	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	// 생성자
	public Car() {
		System.out.println("기본생성자가 호출되었습니다!");
	}
	
	Car(String aaa) {
		System.out.println("문자열(" + aaa + ")생성자 호출!!!");
	}
	
	Car(int aaa) {
		System.out.println("정수(" + aaa + ")생성자 호출!!!");
	}
	
	Car(String aaa, int bbb) {
		System.out.println("(" + aaa + ", " + bbb + ")생성자 호출!!!");
	}
	
	Car(int aaa, String bbb) {
		System.out.println("(" + aaa + ", " + bbb + ")생성자 호출!!!");
	}
	
	Car(String aaa, String bbb) {
		System.out.println("(" + aaa + ", " + bbb + ")생성자 호출!!!");
	}
	
	Car(int aaa, int bbb) {
		System.out.println("(" + aaa + ", " + bbb + ")생성자 호출!!!");
	}
	
	
	// 메서드
	void powerOn() {
		System.out.println("시동을 겁니다!");
	}
	
	void powerOn(String owner) {
		System.out.println(owner + "의 자동차 시동을 켭니다.");
	}
}


















