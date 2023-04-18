package com.greedy.section01.exception;

public class Application2 {

	public static void main(String[] args) {
		
		/* 2. try - catch를 이용한 방법(예외를 발생하지 않는 경우) */
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			
			et.checkEnoughMoney(60000, 50000);
			System.out.println("=========== 상품 구입 가능 ===========");
			
			
		} catch (EnoughMoneyException e) {
			/* 위의 메소드 호출 시 예외가 발생하는 경우 catch 불럭의 코드를 실행
			 * */
			
			System.out.println("=========== 상품 구입 불가 ===========");
			
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
