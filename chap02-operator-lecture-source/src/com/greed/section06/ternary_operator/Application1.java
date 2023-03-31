package com.greed.section06.ternary_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 삼항 연산자
		 * 
		 * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
		 * 항목이 3개 : (조건식)? 참 : 거짓
		 * 조건식은 반드시 결과가 true 또는 false가 나오게끔 작성해야한다.
		 * 비교 / 논리 연산자가 주로 사용
		 * 
		 * */
		
		int num1 = 10; 
		int num2 = -10; 
		
		String result1 = (num1 > 0)? "양수" : "음수";
		String result2 = (num2 > 0)? "양수" : "음수";
		
		System.out.println("num1은 " + result1);
		System.out.println("num2은 " + result2);
		
		/* 중첩 사용도 가능하다 */
		int num3 = 5; 
		int num4 = 0; 
		int num5 = -5;
		
		String result3 = (num3 > 0)? "양수다" : (num3 == 0)? "0입니다" : "음수" ;
		String result4 = (num4 > 0)? "양수다" : (num4 == 0)? "0입니다" : "음수" ;
		String result5 = (num5 > 0)? "양수다" : (num5 == 0)? "0입니다" : "음수" ;
		 
		System.out.println("num3 은 " + result3);
		System.out.println("num4 은 " + result4);
		System.out.println("num5 은 " + result5);
		
		
	}

}
