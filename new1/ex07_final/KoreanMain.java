package com.lec206.ex07_final;

public class KoreanMain {

	public static void main(String[] args) {

		Korean kor1 = new Korean("소향", "680405-2345678");
		System.out.println(Korean.NATION);
		System.out.println(kor1.name);
		System.out.println(kor1.ssn);
		
		// Korean.NATION = "미국"
		// kor1.NATION = "미국";
		kor1.name = "홍길동";
		System.out.println(kor1.name);
		System.out.println();
		
		Korean kor2 = new Korean("나얼", "680405-1345678");
		System.out.println(Korean.NATION);
		System.out.println(kor2.name);
		System.out.println(kor2.ssn);
		System.out.println();
		
		System.out.println(kor1.toString());
		System.out.println(kor2);
	}

}
