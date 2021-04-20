package com.lec206.ex02_try_catch;

public class TryCatchMain {

	public static void main(String[] args) {

		try {
			Class cls = Class.forName("java.lang.Stringxxx");
			System.out.println(cls.toString());
		} catch (ClassNotFoundException xxx) {
			System.out.println("클래스를 찾지 못했습니다!");
			xxx.printStackTrace();
			System.out.println();
			System.out.println(xxx.getMessage());
		}	
	}
}
