package chapter1;

public class Java_if {

	public static void main(String[] args) {
		
		ex4();
	
		
		

	}

	
	public static void ex1() { //if�� ���ã��
		
		int a = 5;
		if(a%5==0) {    //������ �Ѱ��̸� {}��������
			System.out.println("a�� 5�� ����Դϴ�");}
			
		else {
			System.out.println("a�� 5�� ����� �ƴ�");}            	
	
		if(a%2==0) {
		System.out.println("2�� ����Դϴ�");
		}
		else if (a%3==0) {
		System.out.println("3�� ����Դϴ�");
		}
		else if (a%4==0) {
		System.out.println("4�� ����Դϴ�");
		}
		else {
		System.out.println("5�� ����Դϴ�");
		}   }
		
	public static void ex2() { //����
		
		char grade;
		grade = 90;
		
		if(grade>90) {System.out.println("A�����Դϴ�.");}
		else if(grade>80) {System.out.println("B�����Դϴ�.");}
		else if(grade>70) {System.out.println("C�����Դϴ�.");}
		else if(grade>60) {System.out.println("D�����Դϴ�.");}
		else {System.out.println("F�����Դϴ�.");}

		
	}
	public static void ex3() {
		//������0 , �ʵ��л� 1, �ߵ��*2, ����л�*3, ����*4
		int age =13;
		int charge;
		charge = 3000;
		
		if(age<8) 
		{System.out.println("������ '0��' �Դϴ�");}
		else if(age<14)
		{System.out.println("�ʵ��л� '"+(charge*1)+"��' �Դϴ�");}
		else if(age<17)
		{System.out.println("���л�"+(charge*2)+"��' �Դϴ�");}
		else if(age<20)
		{System.out.println("����л�"+(charge*3)+"��' �Դϴ�");}
		else
		{System.out.println("���� '"+(charge*4)+"��' �Դϴ�");}
		
	}
	public static void ex4() {
		//���� �����ڴ� if�� ��ü ����
		//���׿����ڴ� ���ǹ��� �Ѱ��϶��� ��밡���ϴ� 
		int a = 5;
		int b = 8;
		
		int max = (a>b)? a:b;
		System.out.println(max);
		
		if(a>b) {System.out.println(a);}
		else {System.out.println(b);}
	
		
	}
	
}
