package chapter1;
import java.util.Scanner;
public class Java_for {

	public static void main(String[] args) {
		ex12();

	}

	public static void ex1() {// �ݺ��� for
		// �ݺ����� �ʱⰪ; ���ǹ�; ����,���Ұ�
		for (int i = 0; i < 10; i++) {
			System.out.println("�ݺ�Ƚ��" + i);
		}

	}

	public static void ex2() {
		// 1~100�� ���� 2�� ����� �հ�

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

			System.out.println(sum);
		}

	}

	public static void ex3() {// ������ 2��
		for (int i = 1; i < 10; i++) {
			System.out.println(2 + "*" + i + "=" + (2 * i));
		}
	}

	public static void ex4() {

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

	public static void ex5() {
		for (int i = 2; i < 10; i++) {
			if (i % 3 == 0) {             //if(i==3||i==7)
				System.out.println(i + "��");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}
		}
	}

	public static void ex6() { // 2�� ����
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
			System.out.println("������ �Է��ϼ���.>>");
			
			arr[i] = scan.nextInt(); //Ű���� �Է��� �޴¹�
		}
		//total, average
		for(int i=0; i<10; i++){
			System.out.println("����� �� : "+i+arr[i]);
			total +=arr[i];
			}
		average = total/arr.length; // �迭�� ���̸� ���ϴ� �Լ�
		System.out.println("total = "+ total);
		System.out.println("average = "+ average);
	
	}
	public static void ex8() {  //break   �ű���� ���� ����
		for (int i = 2; i < 10; i++) {
			if (i == 3) {
				System.out.println(i + "��");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				break;
			}
			System.out.println("dan"+i);
		}
	}
	public static void ex9() {  //continue �ű�� �н�
		for (int i = 2; i < 10; i++) {
			if (i == 3) {
				System.out.println(i + "��");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				if(i ==3)
				continue;
			}
			System.out.println("dan"+i);
		}
	}
	public static void ex10() { //1~100 ���� Ȧ���հ� ¦���հ踦 ���
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
		System.out.println("¦����"+total1);
		System.out.println("Ȧ����"+total2);
	}

	
	public static void ex11() {
	//�� ���
	//	*****
	//	****
	//	***
	//	**
	//	*
		
		for(int i=1; i<6; i++){              //���� int star �߰��ؼ� 
			for(int j=1; j<=i; j++){		//j<star��   star-- �ٿ����� ��
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void ex12(){//�ΰ��� �ֻ����� �δ��� ���� 6�� �Ǵ� ��� ����� ���� ���
		
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
