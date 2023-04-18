package com.greedy.section02.userexception;

public class Application2 {

	public static void main(String[] args) {
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(-20000, 30000);
			
		} catch (PriceNegativeException e) {
			
			System.out.println("PricenegativeException 발생");
			System.out.println(e.getMessage());
		} catch (MoneyNegativeException e) {
			
			System.out.println("MoneyNegativeException 발생");
			System.out.println(e.getMessage());
			
		} catch (NotEnoughMoneyException e) {
			System.out.println("NotEnoughMoneyException 발생");
			System.out.println(e.getMessage());
			
		}finally {
			/* 예외 발생 여부와 상관없이 실행할 내용 */
			System.out.println("finally 블럭의 내용이 동작함.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
