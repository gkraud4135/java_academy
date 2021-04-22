package com.lec206.ex15_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeInfoMain {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getMonth() + " ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초";
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate();
		System.out.println(nowDate);
		if(nowDate.isLeapYear()) {
			System.out.println("윤년입니다!");
		} else {
			System.out.println("평년입니다!");
		}
		
		// 날짜연산
		now = LocalDateTime.now();
		LocalDateTime target = now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(10);
		System.out.println(target);
		
		target = now.withYear(2024).withMonth(12).withHour(10);
		System.out.println(target);
	}
}














