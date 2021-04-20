package com.lec206.ex01_class;

public class A {
	
	public A() {
		System.out.println("A객체 생성");
	}
	
	// 1. 인스턴스멤버클래스
	public class B {
		
		// 필드
		int filed1;
		// static int field2; (x)
		
		// 생성자
		public B() {
			System.out.println("B객체 생성");
		}
		
		// 메서드
		void method1() {
			System.out.println("B.method1 실행!");
		}
		
		// static void method2() {} (x)
	}
	
	// 2. 정적멤버클래스
	public static class C {
		
		// 필드
		int field1;
		static int field2;
		
		// 생성자
		public C() {
			System.out.println("C객체 생성");
		}
		
		void method1() {
			System.out.println("C.method1 실행!!");
		}
		
		static void method2() {
			System.out.println("C.method2 실행!!");
		}
		
	}
	
	// 3. 로컬멤버클래스
	void method() {
		class D {
			
			// 필드
			int field1;
			// static int field2; (x)
			
			// 생성자
			public D() {
				System.out.println("D객체 생성");
			}
			
			// 메서드
			void method1() {
				System.out.println("D.method1 실행!!");
			}
			
			// static void method2() { } (x)
		}
		
		D d = new D();
		d.field1 = 100;
		d.method1();
		
		// 로컬클래스는 접근제한자를 사용할 수 없다.
		// public class E{}
		// private class F{}
	}

}
