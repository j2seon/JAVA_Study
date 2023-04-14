package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

	public static void main(String[] args) {
		
		/* 1. getInstance static 메소드 이용 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/* 2. GregorianCalendar 이용 */
		/* 2-1. 기본생성자 사용 */
		Calendar gregorianCalendar = new GregorianCalendar();
		
		System.out.println(gregorianCalendar);
		
		int year = 2023;
		int month = 3; // 0 ~ 11월
		int dayOfMonth = 14;
		int hour = 11;
		int min = 00;
		int second = 15;
		
		Calendar day = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(day);
		
		Date date = new Date(day.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
		System.out.println(date2);
		
		int dayYear = day.get(1);
		int dayMonth = day.get(2);
		int dayDayOfMonth = day.get(5);
		System.out.println(dayYear);
		System.out.println(dayMonth);
		System.out.println(dayDayOfMonth);
		
		System.out.println();
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		System.out.println(day.get(Calendar.YEAR));
		System.out.println(day.get(Calendar.MONTH));
		System.out.println(day.get(Calendar.DATE));
		/* 요일(일(1) ~ 토(7)) */
		System.out.println(day.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(day.get(Calendar.HOUR_OF_DAY)); // 24시간체계
		System.out.println(day.get(Calendar.HOUR)); // 12시간 체계
		
		
		
	}
	
}
