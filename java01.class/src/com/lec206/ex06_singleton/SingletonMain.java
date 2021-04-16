package com.lec206.ex06_singleton;

import java.util.Calendar;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton aaa = Singleton.getInstance();	
		Singleton bbb = Singleton.getInstance();

		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(aaa.toString());
		System.out.println(bbb.toString());
		
		if(aaa==bbb) {
			System.out.println("동일 객체입니다!");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal1.toString());
		System.out.println(cal2.toString());
		
		if(cal1==cal2) {
			System.out.println("동일 객체입니다!");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		
	}
}
