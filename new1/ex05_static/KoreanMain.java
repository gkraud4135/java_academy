package com.lec206.ex05_static;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean kor1 = new Korean();
		Korean kor2 = new Korean();
		System.out.println(kor1.nation);
		System.out.println(kor2.nation);

		Korean.nation = "미국";
		System.out.println(kor1.nation);
		System.out.println(kor2.nation);
		
		kor1.nation = "영국";
		System.out.println(kor1.nation);
		System.out.println(kor2.nation);
		
		kor2.nation = "중국";
		System.out.println(kor1.nation);
		System.out.println(kor2.nation);
		
		System.out.println(Korean.nation);
		
		plus(10,10);
	}

	static int plus(int a, int b) {
		return a + b;
	}
}
