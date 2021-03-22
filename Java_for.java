package chapter1;
import java.util.Scanner;
public class Java_for {

	public static void main(String[] args) {
		ex12();

	}

	public static void ex1() {// 반복문 for
		// 반복퀀스 초기값; 조건문; 증감,감소값
		for (int i = 0; i < 10; i++) {
			System.out.println("반복횟수" + i);
		}

	}

	public static void ex2() {
		// 1~100의 수중 2의 배수의 합계

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

			System.out.println(sum);
		}

	}

	public static void ex3() {// 구구단 2단
		for (int i = 1; i < 10; i++) {
			System.out.println(2 + "*" + i + "=" + (2 * i));
		}
	}

	public static void ex4() {

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

	public static void ex5() {
		for (int i = 2; i < 10; i++) {
			if (i % 3 == 0) {             //if(i==3||i==7)
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}
		}
	}

	public static void ex6() { // 2씩 증가
		int total = 0;
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
			total += i;
		}
		System.out.println(total);
	}
	public static void ex7() { 
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int average = 0;
		
		//int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++){
			System.out.println("정수를 입력하세요.>>");
			
			arr[i] = scan.nextInt(); //키보드 입력을 받는문
		}
		//total, average
		for(int i=0; i<10; i++){
			System.out.println("저장된 값 : "+i+arr[i]);
			total +=arr[i];
			}
		average = total/arr.length; // 배열의 길이를 구하는 함수
		System.out.println("total = "+ total);
		System.out.println("average = "+ average);
	
	}
	public static void ex8() {  //break   거기부터 실행 정지
		for (int i = 2; i < 10; i++) {
			if (i == 3) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				break;
			}
			System.out.println("dan"+i);
		}
	}
	public static void ex9() {  //continue 거기는 패스
		for (int i = 2; i < 10; i++) {
			if (i == 3) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				if(i ==3)
				continue;
			}
			System.out.println("dan"+i);
		}
	}
	public static void ex10() { //1~100 수중 홀수합계 짝수합계를 출력
		int total1 =0;
		int total2 =0;
		int all = 0;
		for(int i=0; i<=100; i++){
			all += i;
			if(i%2==0){
				total1 += i;
			}
		}
		total2 = all - total1;
		System.out.println("짝수합"+total1);
		System.out.println("홀수합"+total2);
	}

	
	public static void ex11() {
	//별 출력
	//	*****
	//	****
	//	***
	//	**
	//	*
		
		for(int i=1; i<6; i++){              //변수 int star 추가해서 
			for(int j=1; j<=i; j++){		//j<star로   star-- 줄여가도 됨
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void ex12(){//두개의 주사위의 두눈의 합이 6이 되는 모든 경우의 수를 출력
		
		for(int i=1; i<7; i++){
			for(int j=1; j<7; j++){
			if(i+j==6){
				System.out.println("("+i+","+j+")");
			}
			else {continue;}
			}
			
		}
		
	}

}
