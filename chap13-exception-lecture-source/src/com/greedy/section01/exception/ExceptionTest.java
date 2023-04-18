package com.greedy.section01.exception;

public class ExceptionTest {

	
	public void checkEnoughMoney(int price, int money) throws EnoughMoneyException {
		
		System.out.println("가지고 있는 돈은 " + money + " 원 입니다.");
		
		if (money >= price) {
			System.out.println("상품 구매 금액이 충분합니다.");
		}else {
			
			/* 강제로 예외 발생
			 * throw new 예외시킬 클래스명();
			 * */
			throw new EnoughMoneyException("돈이 충분하지 않습니다.");
			
		}
		
		/* 예외가 발생하지 않을 경우 실행*/
		System.out.println("즐거운 쇼핑하세요");
	}
	
}
 
class EnoughMoneyException extends Exception{
	
	public EnoughMoneyException() {}

	public EnoughMoneyException(String message) {
		super(message);
	}
	
}