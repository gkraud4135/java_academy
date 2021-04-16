package com.lec206.ex05_static;

/*
정적메서드와 정적블럭 사용시에 주의할 점

정적메서드와 정적 블럭을 선언할 때 주의할 점은 객체가 생성되지 않아도 즉, 객체가 없더오
사용할 수 있다는 특징 때문에 정적메서드와 정적블럭 내부에 인스턴스필드나 인스턴스멤버를
사용할 수 없다. 또한, 객체 자신의 참조인 this키워드도 사용이 불가능하다.

정적메서드와 정적블럭에서 인스턴스(객체)멤버를 사용하고 싶다면 객체를 먼저 생성하고
참조변수(객체)로 접근해야 한다.

또한, main메서드도 정적멤버이기 때문에 동일한 규칙이 적용된다. 이런 이유로 main 메서드
에서 객체생성없이 인슨턴스필드, 인스턴스메서드를 바로 사용할 수 없다.
*/

public class CarMain {
	
	static int speed;
	static void run(){
		System.out.println("현재속도는"+speed+"입니다");
	}
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		
		//main메서드는 static이기 때문에 static이 아닌 speed와 run()은 접근불가
		speed = 100;
		run();

	}

}
