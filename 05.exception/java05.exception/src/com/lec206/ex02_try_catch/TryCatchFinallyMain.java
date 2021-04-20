package com.lec206.ex02_try_catch;

public class TryCatchFinallyMain {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;

		try {
			
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 매개변수가 부족합니다!");
			e.getMessage();
			return;
		}
		System.out.println(data1 + ", " + data2);
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가능합니다.");
		} finally {
			System.out.println("무조건 한번은 실행됩니다!!");
		}
	}

}
