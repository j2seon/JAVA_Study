package com.greedy.section01.method;

public class Application7 {

	public static void main(String[] args) {
		
		/* 매개변수와 리턴값 복합 활용 */
		/* 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들어보기 */
		
		/* 숫자 두 개를 매개변수로 입력 받아 연산하는 메소드를 사칙연산별로 추가해서 호출 */
		
		/* 메소드 주석 단축키 : alt + shift + j */
		
		int first = 20, second = 10;
		
		Application7 app7 = new Application7();
		
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 결과 : " + app7.divideNumbers(first, second));
		
	}

	public int plusTwoNumbers(int num1, int num2) {
		int result = num1 + num2 ;
		
		return result;
//		return num1 + num2;
	}
	
	public int minusTwoNumbers(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	public int divideNumbers(int num1, int num2) {
			
			return num1 / num2;
			
	}
	
	public int multipleTwoNumbers(int num1, int num2) {
		
		return num1 * num2;
		
	}
}
