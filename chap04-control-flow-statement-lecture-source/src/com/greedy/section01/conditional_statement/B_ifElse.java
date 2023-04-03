package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class B_ifElse {

	
	/**
	 * <pre>
	 * if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 정수 홀수 짝수 판별용 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {
		
		/* [if-else문 표현식]
		 * if(조건식){
		 * 		조건식이 true일때 실행할 명령문;
		 * } else {
		 * 		조건식이 false일때 실행할 명령문;
		 * }
		 * 
		 * if문은 조건식의 결과 값이 참(true)이면 if{} 안에 있는 코드를 실행하고,
		 * 조건식의 결과 값이 거짓이면 else{} 안에 있는 코드를 실행한다.
		 * 
		 * 조건을 만족하는지 여부에 따라 둘중하나는 무조건 실행해야하는 경우에 많이 사용함.
		 *  
		 * */
		
		/* 정수 한개를 입력 받아 그 수가 홀수면 " 입력하신 숫자는 홀수 입니다."라고 출력하고,
		 * 홀수가 아니면 " 입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
		 * 단, 조건과 상관없이 프로그램이 종료될 때 " 프로그램을 종료합니다"라고 출력되도록 한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 조건식은 반드시 true 혹은 false가 나오도록 작성해야한다. */
		// 짝수기준 
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}



	/**
	 * <pre>
	 * 중첩 if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 정수 양수 or 음수 or 0 중 한가지 인지 판별용 기능 제공
	 * </pre>
	 */
	public void testNestedIfElseStatement() {
		
		/* 숫자를 하나 입력받아 양수면, "입력하신 숫자는 양수입니다" 출력하고,
		 * 음수이면 "입력하신 숫자는 음수입니다"
		 * 단, 0 이면 "0 입니다"라고 출력하세요
		 * 	조건과 상관없이 프로그램이 종료될때 "프로그램을 종료합니다." 라고 출력 
		 *  
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자하나를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num != 0) {
			
			if(num > 0 ) {
				System.out.println("입력하신 숫자는 양수입니다");
			}else {
				System.out.println("입력하신 숫자는 음수입니다");
			}
			
		}else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		
	}

}
