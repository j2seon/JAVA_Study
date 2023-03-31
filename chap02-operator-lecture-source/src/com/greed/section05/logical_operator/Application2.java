package com.greed.section05.logical_operator;

public class Application2 {

	public static void main(String[] args) {
		
		/* 논리 연산자의 우선순위와 활용 */
		/* 논리 and 연산자와 논리 or 연산자의 우선순위
		 * 
		 * && : 11번째  
		 * || : 12번째
		 * 
		 * */

		
		/* 1. 1부터 100사이의 값인지 확인 */
		// 변수 >= 1 && 변수 <= 100
		int num1 = 55;  
		
		System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));
		
		int num2 = 155;
		
		System.out.println("1부터 100사이인지 확인 : " + (num2 >= 1 && num2 <= 100));
		
		
		/* 2. 영어 대문자인지 확인 */
		
		char ch1 = 'G';
		
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		
		char ch2 = 'g';
		System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));
		
		/* 3. 대소문자 상관없이 영문자 y인지 확인 */
		char ch3 = 'Y';
		
		System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
		
		/* 영문자 인지 확인 */
		char ch4 = '1';
		
		System.out.println("영문자 인지 확인 : " + ((ch4 >=65 && ch4 <=90) || (ch4 >=97 && ch4 <=122) ));
		System.out.println("영문자 인지 확인 : " + ((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >='a' && ch4 <='z') ));
		
	}

}
