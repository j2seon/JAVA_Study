package com.greedy.section02.userexception;


public class Application1 {
	
	public static void main(String[] args) {
		
		
		/* 사전에 정의된 예외 클래스 외에 개잘자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다
		 * extend Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다. 
		 * */
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			/* 상품가격보다 가진 돈이 적을 경우 */
//			et.checkEnoughMoney(50000, 30000);
			
			/* 상품가격은 음수로 입력한 경우 */
			et.checkEnoughMoney(-5000, 10000);
			
		} catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
			
			e.printStackTrace();
		}
		
	}

}
