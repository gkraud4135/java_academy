package com.lec206.ex06_system;

public class SystemExitMain {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			System.out.println("프로그램 비정상종료!!!");
			System.exit(100);
		}
		
		System.out.println("프로그램정상종료!!");

	}

}
