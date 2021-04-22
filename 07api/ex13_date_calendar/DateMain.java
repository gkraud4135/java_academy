package com.lec206.ex13_date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		String str1 = now.toString();
		System.out.println(str1);
		
		// SimpleDateFormat
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		System.out.println(sdf1.format(now));
		sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf1.format(now));
	}

}
