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

//컨트롤 쉬프트 f ===== 정리
//print 줄내림x println 줄내림O
// 사용가능 특수기호 _ $
// false등의 값은 변수명으로 사용 할 수없다

public class Hello {




	public static void main(String[] args) {
		ex1();
		// 논리 연산자 && || !
		int num1, num2;
		num1 =11;
		num2 =22;
		boolean result;
		//변수 num1에 저장된 값이 1과 100사이의 수인가?
		result = (1<num1) && (num1<100);
		System.out.println("1초과 100 미만 수인가?" + result);
		//변수 num2에 저장된 값이 2또는 3의 배수인가?
		result = (num2%2==0) || (num2%3==0); // (num2%2) == 0 || (num2%3) == 0;
		System.out.println("2또는 3의 배수인가?"+ result); // true
		// not연산자
		System.out.println(!result); //false

	}

	public static void ex1() { // ex1 메서드생성
		// 변수생성
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

		char ch2 = '헐';
		System.out.println((int) ch2);

		char ch3 = '\uAFB9'; // 유니코드에 따른 그 값 출력
		System.out.println(ch3);

		boolean yesNo = true; // 참 거짓 트루
		System.out.println(yesNo);
		if (yesNo)
			System.out.println("yesNo의값 true 입니다");
		else
			System.out.println("yesNo의값 false 입니다");

		int a, b, c; // 거짓이기에 flase
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a > b);

		// 문자는 객체자료형으로 (대문자) String이라는 클래스가 존재
		String str = "가나다라";
		String str1 = "마바사";
		String str2 = "아자차카";
		System.out.println(str + str1 + str2);

		final double PI = 3.14d; // 변수가 아닌 고정된 값이기에 final을 붙여서 저장 -- 초기화된 상수 변경불가

	}

	public static void ex2() {
		int a, b;
		a = 5;
		b = 7;
		System.out.println(a + b); // 12
		System.out.println(a - b); // -2
		System.out.println(a * b); // 35
		System.out.println(b / a); // 1
		System.out.println(b % a); // 2
		// 관계 연산자 크기
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // flase
		System.out.println(a <= b); // true
		System.out.println(a == b); // flase 같은가
		System.out.println(a != b); // true 다른가
		// 복합대입 연산자
		System.out.println(a += 1); // 6
		System.out.println(a += 2); // 8 위에서 아래로 a + 1 + 2 = 8

	}

}
