package com.lec206.ex06_singleton;

/*
	싱글톤(Singleton)
	
	프로그램에서 단 한개의 객체만 생성하도록 해야 하는 경우가 있다. 객체가 단 한개만 생성
	된다고 해서 이러한 객체를 싱글톤(Singleton)객체라고 한다.
	
	싱글톤을 만들려면
	
	1. 외부에서 new연산자로 생성자를 호출할 수 없도록 막아야 하는데 이는 생성자를 호출한 수 만큼
	   객체가 생성되기 때문이다. 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private라는
	   접근 제한자를 붙여 주면 된다.
	2. 자신의 타입인 정적필드를 하나 선언하고 자신의 객체를 생성하고 초기화 한다. 그리고 내부에서
	   new연산자로 생성자를 호출해서 객체를 생성하고 이 정적필드(singleton)eh private접근제한자로
	   선언해서 외부에서 필드값을 변경하지 못하도록 한다.
	3. 외부에서 직접 자신의 객체에 접근하지 못하도록 막는 대신에 외부에서 호출할 수 있도록 정적
	   메서드 getter메서드 getInstance()를 선언하고 정적필드인 singleton에서 참조하고 있는 자신의
	   객체를 리턴해 준다.
*/
public class Singleton {

	private Singleton() {}
	private static Singleton singleton = new Singleton();
	static Singleton getInstance() {
		return singleton;
	}
	
	void xxx() {
		System.out.println("싱글톤 메서드 호출!");
	}
}
