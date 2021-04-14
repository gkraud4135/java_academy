package chapter1;

public class Java_while {

	public static void main(String[] args) {
		ex1();

	}

	public static void ex1() {
		// 반복 시퀀스
		// 반복 조건
		// 반복 증감,감소 크기

		int num = 1;
		int total ;
		total = 0;

		while (num <= 100) {
			System.out.println("sum" + num);
			total +=num++;
			// total +=num;
			// num++
			
		}
		System.out.println(total);

	}
}
