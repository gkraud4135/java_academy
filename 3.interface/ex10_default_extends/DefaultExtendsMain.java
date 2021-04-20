package com.lec206.ex10_default_extends;

public class DefaultExtendsMain {

	public static void main(String[] args) {
		
		// 1. default메서드 상속
		ChildInterface1 ci1 = new ChildInterface1() {
			public void method1() {}
			public void method3() {}
		};
		ci1.method1();
		ci1.method2(); // 상속받은 default메서드
		ci1.method3();
		
		// 2. default메서드 재정의
		ChildInterface2 ci2 = new ChildInterface2() {
			public void method1() {}
			public void method3() {}
		};
		ci2.method1();
		ci2.method2(); // 상속받은 default메서드 재정의
		ci2.method3();
		
		// 3. default메서드 추상메서드로 변경
		ChildInterface3 ci3 = new ChildInterface3() {

			public void method1() {}
			public void method3() {}
			public void method2() {}
		};
		ci3.method1();
		ci3.method2(); // 상속받은 default메서드를 추상메서드로 변경
		ci3.method3();
	}

}
