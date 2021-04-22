package com.lec206.ex12_math_random;

/*
	Math클래스
	
	java.lang.Math클래스는 수학계산에 사용할 수 있는 메서드를 제공한다. 
	Math클래스의 메서드는 모두 static메서드이므로 클래스이름으로 바로 사용이 가능하다.
*/
public class MathMain {

	public static void main(String[] args) {
		
		// 1. ceil() : 가장 큰 정수값
		double v1 = Math.ceil(5.1);
		System.out.println(v1);
		
		// 2. floor(): 가장 작은 정수값
		v1 = Math.floor(5.9);
		System.out.println(v1);
		
		// 3. min(), max()
		v1 = Math.max(4, 7);
		System.out.println(v1);
		v1 = Math.min(4, 7);
		System.out.println(v1);
		
		// 4. rint() : 가장 가까운 정수값
		v1 = Math.rint(5.3);
		System.out.println(v1);
		v1 = Math.rint(5.9);
		System.out.println(v1);
		
		// 5. random()
		v1 = Math.random();
		System.out.println(v1);
		System.out.println((int)(Math.random()*45+1));
		
		// 6. round()
		v1 = Math.round(5.3);
		System.out.println(v1);
		v1 = Math.round(5.7);
		System.out.println(v1);

	}

}
