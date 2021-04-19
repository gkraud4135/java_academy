package com.lec206.ex06_promotion;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		// 자동형변환 : 자식객체에서 부모객체로 형변환
		Parent parent = child; // promotion
		parent.method1();
		
		// method2()는 자식객체에서 재정의 되었기 때문에
		// 자식객체의 메서드 즉 child.method2()가 호출된다.
		parent.method2();
		
		// method3는 자식겍체에서 새롭게 추가된 메서드이기떄문에
		// 부모객체로 타입변환시에 삭제가 되기 때문에 호출 불가
		// parent.method3(); (x)
		
		System.out.println(parent == child);
		System.out.println(parent);
		System.out.println(child);
	}

}
