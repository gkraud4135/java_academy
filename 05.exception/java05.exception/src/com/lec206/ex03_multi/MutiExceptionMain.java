package com.lec206.ex03_multi;

public class MutiExceptionMain {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행매개변수가 부족합니다!");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 변환이 불가능합니다!");
//		} catch (ArrayIndexOutOfBoundsException |  NumberFormatException e) {
//			System.out.println("배열 또는 숫자변환시에 예외가 발생했습니다!");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다!");
			e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("무조건 한번은 실행됩니다!");
		}
	}
}
