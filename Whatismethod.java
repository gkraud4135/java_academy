package chapter1;

public class Whatismethod {

	public static void main(String[] args) {
//		int a=15;
//		int b=10;
//		System.out.println(add(a,b));
//		System.out.println(minus(a,b));
//		System.out.println(multiple(a,b));
//		System.out.println(divide(a,b));

		caculator(1, 3, 4);
		System.out.println();
	}

	static int caculator(int a, int b, int c) {// 계산기 1더하기 2빼기 3곱하기 4나누기 caculator(연산자,수,수)
		int result = 0;
		if (a == 1) {
			result = b + c;
		}
		if (a == 2) {
			result = b - c;
		}
		if (a == 3) {
			result = b * c;
		}
		if (a == 4) {
			result = b / c;
		}
		return result;
		

	}

	static int add(int a, int b) {
		int c;
		c = a + b;
		return c;

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

	static float divide(int a, int b) {
		float result;
		if (a > b) {
			result = a / b;
		} else {
			result = b / a;
		}
		return result;
	}

}
