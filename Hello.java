package chapter1;

/*파일이름 : 안녕 출력
작성자 : 이학명
작성일 : 2021.03.17
목적 : Hello 출력*/

/*	주석처리  한줄: //                  컨트롤 /
	단락:  ~~~ 	   컨트롤 쉬프트 /
	변수 : 값을 저장 - 메모리공간에
	변수선언 : 메모리 공간의 할당
*/

public class Hello {

	public static void main(String[] args) {
//		변수생성
		int num = 9;
		System.out.println(num);

		num = 12;
		System.out.println(num);
//byte -128 ~ 127	(1byte)
		byte num1; // 변수선언
		num1 = 127; // 값 대입 초기값
		System.out.println(num1);
//short 32000		(2byte)
		short num2;
		num2 = 30000;
		System.out.println(num2);

		int num3 = num1 + num2;
		System.out.println(num3);
//int 2.100.000.000 (4byte)
		int num4 = 2100000000;
		System.out.println(num4);
//long ~~~			(8byte)        long은 대입 L표시
		long num5 = 2100000000L;
		System.out.println(num5);
//double 기본 타입 
		double d1 = 0.23;
//float 
		float f1 = 0.23232323F;
		System.out.println(d1);
		System.out.println(f1);
//char 글 - 유니코드로 저장 :: 음수가 없다 
		char ch1 = 'A';
		ch1 = 'Z'; // 형변환 글 > 숫자 Z의 유니코드는 90
		System.out.println((int) ch1);

		int iNum = 90; // 형변환 숫자 > 글 유니코드 90의 글자는 Z
		System.out.println((char) iNum);

	}

}
