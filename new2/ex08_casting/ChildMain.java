package com.lec206.ex08_casting;

/*
	강제타입변환(Casting)
	
	강제타입변환은 부모타입을 자식타입으로 변환하는 것을 말한다. 그렇다고 해서
	모든 부모타입을 자식타입으로 강제형변환할 수 있는 것은 아니다.
	
	자식타입이 부모타입으로 자동변환한 후에 다시 자식타입으로 변환할 때만 강제
	타입변환를 할 수 있다.
	
	자식타입이 부모타입으로 자동형변환하면 부모타입에 선언된 필드와 메서드만 사용
	할 수 있다. 만약 자식타입에 선언된 필드와 메서드를 꼭 사용해야 한다면 강제형
	변환을 해서 다시 자식타입으로 변환한 후에 자식타입의 필드와 메서드르 사용하면
	된다.
	
*/
public class ChildMain {

	public static void main(String[] args) {
		
		// 1. 자동형변환
		Parent parent = new Child(); 
		parent.field1 = "사용가능";
		// parent.field2 = "사용불가능" (x)
		parent.method1();
		parent.method2();
		// parent.method3(); (x)
		System.out.println();
		
		// 2. 강제형변환
		Child child = (Child) parent;
		child.field1 = "사용가능";
		child.field2 = "사용가능";
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		// 3. 직접 강제형변환
		// ClassCastingException에러 발생
//		Parent parent1 = new Parent();
//		Child child2 = (Child) parent1;
	}

}








