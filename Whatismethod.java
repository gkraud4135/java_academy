package chapter1;

public class Whatismethod {

	public static void main(String[] args) {
//		int a=15;
//		int b=10;
//		System.out.println(add(a,b));
//		System.out.println(minus(a,b));
//		System.out.println(multiple(a,b));
//		System.out.println(divide(a,b));

		
		System.out.println(caculator(2, 3, 4));
		System.out.println(average(2, 3, 4));
		System.out.println(add(2, 3, 4));
		System.out.println(totalOraverage(1,2,3,6));
		
		
	}
	
	
	
	//3���� ���� ���������� �޾Ƽ� �հ� ���ϱ�
	//3���� ���� ���������� �޾Ƽ� ��� ���ϱ�
	static int add(int a, int b, int c){
		int result = 0;
		result = (a + b + c);
		return result; 
	}
	static int average(int a, int b, int c){
		int result = 0;
		result = add(a,b,c)/3;
		return result; 
	}
	static int totalOraverage(int opt,int a, int b, int c ){// opt1=�հ�,2=���
		int total = add(a,b,c);
		if(opt==1)
			return total;
		else if(opt==2)
			return total/3;
		else
			return 0;
	}

	static int caculator(int a, int b, int c) {// ���� 1���ϱ� 2���� 3���ϱ� 4������ caculator(������,��,��)
		int result = 0;
		if (a == 1) {
//			result = b + c;
			result=add(b,c);
		}
		else if (a == 2) {
//			result = b - c;
			result=minus(b,c);
		}
		else if (a == 3) {
//			result = b * c;
			result=multiple(b,c);
		}
		else if (a == 4) {
//			result = b / c;
			result=divide(b,c);
		}
		else System.out.println("�߸��� �Է��Դϴ�");
		
		return result;
		

	}
	
	static double add(double a, double b){//�����ε�
		double result;
		result = a + b;
		return result;
	}

	static int add(int a, int b) {
		int result;
		result = a + b;
		return result;

	}

	static int minus(int a, int b) {
		int result;
		if (a > b)
			result = a - b;
		else
			result = b - a;
		return result;

	}

	static int multiple(int a, int b) {
		int result;
		result = a * b;
		return result;
	}

	static int divide(int a, int b) {
		int result;
		if (a > b) {
			result = (int)(a / b);
		} else {
			result = (int)(b / a);
		}
		return result;
	}

}
