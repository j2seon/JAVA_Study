package com.greedy.section05.calendar;

import java.util.Date;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* Date클래스
		 * JDK 1.0부터 날짜를 취급하기 위해 사용되던 클래스
		 * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되어있다. 
		 * */
		
		/* JDK 1.1부터는 새롭게 제공되는 Calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게된다.
		 * 하지만 Calendar 클래스는 몇가지 문제점을 가지고 있다,
		 * 
		 * 1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
		 * 2. 윤초를 고려하지 않는다.
		 * 	윤초란?
		 * 	협정 세계시에서 사용하는 세슘원자 시계와 실제 지구의 자전/공전 속도를 기준으로 한 태양시의 차이로 인해
		 * 	발생한 오차를 보정하기 위해 추가하는 1초이다.
		 * 	12월 31일의 마지막에 추가하거나 혹은 6월 30일의 마지막에 추가한다.
		 * 
		 * 3. Calendar 클래스는 월을 나타낼때부터 0부터 11까지로 표현하는 불편함이 있다.
		 * 
		 * */
		
		/* 1. 기본생성자를 사용하는 방법 */
		Date today = new Date();
		
		/* toString() 오버라이딩 되어있다. */ 
		System.out.println(today);
		
		
		/* 2. Date(long date) 사용하는 방법 */
		
		/* getTime() : 1970년 1월 1일 0시0분0초 이후 지난 시간을 millisecond(1/1000)로 계산해서 long타입으로 반환 */
		System.out.println(today.getTime());
		
		/* 1초 = 1000밀리초
		 * 1분 = 60초
		 * 1시간 = 60분
		 * 하루 = 24시간
		 * 
		 * 하루를 밀리초로 변경하려면 
		 * 1000 * 60 * 60 * 24 => 하루 
		 * 
		 * */
		Date time = new Date(1681440332417L);
		System.out.println(time);
		
	}

}
