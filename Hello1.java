package chapter1;

public class Hello1 {

	public static void main(String[] args) {
		
		
	}



public static void ex1(){		
	
byte bNum = 10;
int iNum = bNum;

double dNum = 1.2;
float fNum = 0.9F;
//���� ����ȯ == ����� ����ȯ
int iNum1 = (int)dNum + (int)fNum;                //1
System.out.println(iNum1);
double iNum2 = dNum + fNum;						//2
System.out.println((int)iNum2);
int iNum3 = (int)(dNum+fNum);					//2
System.out.println(iNum3);

	
}
public static void ex2() {
	int i = 10;
	System.out.println(++i);    //11 �ٷ� ����
	i = 10;
	System.out.println(i++); 	//10 ���� ������ ���� ������ ���� +1
	System.out.println(i); 		//11 �� �� ������
	System.out.println(i--); 	//11
	System.out.println(i); 		//10

}
public static void ex3() {
int a,b,c ; 
a= 4;
b= 7;
c= 9;

//abc�� ���� 2�� ����ΰ�?		
boolean result = (a%2==0) && (b%2==0) && (c%2==0);
System.out.println(result);					//false
//abc�� ���� 2�� ����� �ִ°�?
boolean result1 = (a%2==0) || (b%2==0) || (c%2==0);
System.out.println(result1);                 //true
}
public static void ex4() {
	// ��Ʈ������ �������� ��ĭ �̵�
	int num1 = 2;
	System.out.println(num1 <<=2);         //8     2*2*2
	
	int num2 = (5>3)?10:20;        //���׿����� ������ 10 �ƴϸ� 20
	System.out.println(num2);
	int age1 = 45;
	int age2 = 52;
	char ch = (age1>age2)?  'T':'F';
	System.out.println(ch);           //F
	String str = (age1>age2)? "���̰� �����ϴ�":"���̰� �����ϴ�";
	System.out.println(str);
	System.out.println((age1>age2)?(age1-age2):(age2-age1));
}

}
