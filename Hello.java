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

public class Hello {

	public static void main(String[] args) {
//		��������
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

	}

}
