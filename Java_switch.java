package chapter1;

import java.util.Scanner;

public class Java_switch {

	public static void main(String[] args) {
		ex3();

	}

	
	
	
	
	
	public static void ex1() {// if�� switch�� ����
		
		char grade;
		grade = 90;
		
		if(grade>90) {System.out.println("A�����Դϴ�.");}
		else if(grade>80) {System.out.println("B�����Դϴ�.");}
		else if(grade>70) {System.out.println("C�����Դϴ�.");}
		else if(grade>60) {System.out.println("D�����Դϴ�.");}
		else {System.out.println("F�����Դϴ�.");}
		
		//switch���� �������� ����
		//break�� ���� ������ �ش� �Ʒ� ��� ��µ� 
		switch(grade) {
		case 90 : System.out.println("A�����Դϴ�."); 
		break;
		case 80 : System.out.println("B�����Դϴ�.");
		break;
		case 70 : System.out.println("C�����Դϴ�.");
		break;
		case 60 : System.out.println("D�����Դϴ�.");
		break;
		default : System.out.println("F�����Դϴ�.");
		break;
		}
		
	}
	public static void ex2() {
		//1�� ~ 12�� 30�� 31 28�� ��
		//��ĳ�� ���
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.>>");
		
		int month = scan.nextInt();
		int days;
				
		switch(month) {
		case 1,3,5,7,9,11 : days=31; 
		break;
		case 2 : days=28; 
		break;
		default : days=30; 
		break;
		}
		System.out.println(month+"���� "+days+"�ϱ��� �ֽ��ϴ�.");
		
	}
	public static void ex3() {
		// 1. 120�̻��̸鼭 �θ� �����̸� ž�°���
		// 2. 6�� �̻� Ű 120�̻� ž�� ����
		// 3. ������ȯ ž�� �Ұ���
		
		int age = 5;
		int height = 130;
		
		boolean withParent = true;
		boolean heartdease = false;
		
		boolean result = false;
		
		if((age>=6)&&((height>120)&&(withParent==true))){System.out.println("A�ⱸ�� ž�°����մϴ�");}
		else {System.out.println("A�ⱸ�� ž�� �Ұ����մϴ�");}
		if(height>=120){System.out.println("B�ⱸ�� ž�°����մϴ�");}
		if(heartdease){System.out.println("C�ⱸ�� ž�� �Ұ����մϴ�");}
		else {System.out.println("C�ⱸ�� ž�� �����մϴ�");}
		
		//��� �ش�ž� ž�°���  
		result = ((heartdease==false)&&(((age>=6)&&(height>120))||((height>120)&&(withParent==true))));
		
		
		//-------------------------
		if (age>=6) {
			result = true;
		}else {
			if(withParent)
				result = true;}
		}
		
		
		
	public static void ex4() {}
	public static void ex5() {}
	public static void ex6() {}
	
	

}
