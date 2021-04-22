package com.lec206.ex13_date_calendar;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "." + month + "." + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 1~7 : 일~토
		System.out.println(week);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일";
		}
		System.out.println(strWeek);
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(Calendar.AM + " / " + Calendar.PM + " / " + Calendar.AM_PM);
		if (ampm == Calendar.AM) {
			System.out.println("오전입니다!");
		} else {
			System.out.println("오후입니다!");
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
