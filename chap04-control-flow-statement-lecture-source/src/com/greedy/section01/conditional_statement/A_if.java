package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {
	
	/**
	 * <pre>
	 * 단독 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 정수 짝수 여부 판단 확인용
	 * </pre>
	 */
	public void testSimpleIfStatement() {
		
		/* [if문 표현식]
		 * 
		 * if(조건식){
		 * 		조건식이 true일때 실행할 명령문;
		 * }
		 *
		 * if(num > 0){
		 * 		System.out.println("입력하신 숫자는 양수입니다.");
		 * }
		 * 
		 * if 문은 조건식의 결과 값이 참이면 {} 안에 있는 코드를 실행하고.
		 * 조건식의 결과 값이 거짓이면 {} 안에 있는 코드를 무시하고 넘어간다.
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num % 2) == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}
	
	
	/**
	 * <pre>
	 * 중첩 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 양의 정수 짝수 여부 판단 확인용
	 * </pre>
	 */
	public void testNestedIfStatement() {
		
		/* 정수 한 개를 입력받아 그 수가 양수인 경우에만 짝수인지를 확인하여
		 * 짝수이면 "입력하신숫자는 양수이면서 짝수입니다."라고 출력하고,
		 * 둘 중 하나라도 해당하지 않으면 아무내용도 풀력하지 않는 구문을 작성해보자
		 * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다. 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개를 입력하세요 : ");

		int num = sc.nextInt(); 
		
		/* 조건절로 쓸 수 있는 조건식
		 * 1. 입력한 수가 양수인지 판별
		 * 2. 입력한 수가 짝수인지 판별 
		 *  
		 * */
		
		
		if(num > 0 ) { // 양수인지 조건 확인 
			System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}
}
