package chapter1;

/*�����̸� : �ȳ� ���
�ۼ��� : ���и�
�ۼ��� : 2021.03.17
���� : Hello ���*/

/*	�ּ�ó��  ����: //                  ��Ʈ�� /
	�ܶ�:  ~~~ 	   ��Ʈ�� ����Ʈ /
	���� : ���� ���� - �޸𸮰�����
	�������� : �޸� ������ �Ҵ�
*/

//��Ʈ�� ����Ʈ f ===== ����
//print �ٳ���x println �ٳ���O
// ��밡�� Ư����ȣ _ $
// false���� ���� ���������� ��� �� ������

public class Hello {




	public static void main(String[] args) {
		ex1();
		// �� ������ && || !
		int num1, num2;
		num1 =11;
		num2 =22;
		boolean result;
		//���� num1�� ����� ���� 1�� 100������ ���ΰ�?
		result = (1<num1) && (num1<100);
		System.out.println("1�ʰ� 100 �̸� ���ΰ�?" + result);
		//���� num2�� ����� ���� 2�Ǵ� 3�� ����ΰ�?
		result = (num2%2==0) || (num2%3==0); // (num2%2) == 0 || (num2%3) == 0;
		System.out.println("2�Ǵ� 3�� ����ΰ�?"+ result); // true
		// not������
		System.out.println(!result); //false

	}

	public static void ex1() { // ex1 �޼������
		// ��������
		int num = 9;
		System.out.println(num);

		num = 12;
		System.out.println(num);
//byte -128 ~ 127	(1byte)
		byte num1; // ��������
		num1 = 127; // �� ���� �ʱⰪ
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
//long ~~~			(8byte)        long�� ���� Lǥ��
		long num5 = 2100000000L;
		System.out.println(num5);
//double �⺻ Ÿ�� 
		double d1 = 0.23;
//float 
		float f1 = 0.23232323F;
		System.out.println(d1);
		System.out.println(f1);
//char �� - �����ڵ�� ���� :: ������ ���� 
		char ch1 = 'A';
		ch1 = 'Z'; // ����ȯ �� > ���� Z�� �����ڵ�� 90
		System.out.println((int) ch1);

		int iNum = 90; // ����ȯ ���� > �� �����ڵ� 90�� ���ڴ� Z
		System.out.println((char) iNum);

		char ch2 = '��';
		System.out.println((int) ch2);

		char ch3 = '\uAFB9'; // �����ڵ忡 ���� �� �� ���
		System.out.println(ch3);

		boolean yesNo = true; // �� ���� Ʈ��
		System.out.println(yesNo);
		if (yesNo)
			System.out.println("yesNo�ǰ� true �Դϴ�");
		else
			System.out.println("yesNo�ǰ� false �Դϴ�");

		int a, b, c; // �����̱⿡ flase
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a > b);

		// ���ڴ� ��ü�ڷ������� (�빮��) String�̶�� Ŭ������ ����
		String str = "�����ٶ�";
		String str1 = "���ٻ�";
		String str2 = "������ī";
		System.out.println(str + str1 + str2);

		final double PI = 3.14d; // ������ �ƴ� ������ ���̱⿡ final�� �ٿ��� ���� -- �ʱ�ȭ�� ��� ����Ұ�

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
		// ���� ������ ũ��
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // flase
		System.out.println(a <= b); // true
		System.out.println(a == b); // flase ������
		System.out.println(a != b); // true �ٸ���
		// ���մ��� ������
		System.out.println(a += 1); // 6
		System.out.println(a += 2); // 8 ������ �Ʒ��� a + 1 + 2 = 8

	}

}
