package com.greedy.section03.constant;

public class Application1 {

	public static void main(String[] args) {
		// 상수 선언 
		// 상수 선언 시 자료형 앞에 final 키워드를 붙인다.
		final int AGE;
		
		AGE = 20;
		
		System.out.println("Age의 값 : "+ AGE);
		System.out.println("Age 2배 : "+ (AGE * 2));

		int sum = AGE ;		
		sum += 10;
		
		// AGE = AGE + 20; 상수여서 할당 x
		
		/* 상수의 명명 규칙
		 * 
		 * 상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙을 동일하다.
		 * 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
		 * 2. 단어와 단어 연결은 인터스코어(_)를 사용한다. 
		 *  
		 * */
				
		final int AGE1 = 20; 
		final int AGE2 = 20; 
		final int age3 = 20; // 소문자로 사용가능하지만 변수와 구분하기 힘들기 때문에 만들어진 규칙
		
		final int MAX_AGE = 50;
		final int MIN_AGE = 10;
		final int minAge = 50; // 변수랑 구분이 안되니 지양하자
		
		int num = 10;
		

		for (int i = 0; i < num; i++) {
			for (int j = num; i < j-1 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i  ; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < num; i++) {
			for (int j = num; i < j-1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			
		}
		
	}
}

