package com.greedy.section02.userexception;

public class Application3 {

	public static void main(String[] args) {
		/* multi-catch
		 * JDK 1.7에서 추가된 구문
		 * 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 다룰 수 있다.
		 * */
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(50000, 10000);
			
		} catch (PriceNegativeException | MoneyNegativeException e) {
			
			/* 발생한 예외 클래스의 이름을 알 수 있다.*/
			System.out.println(e.getClass() + " 발생!");
			
			/* 발생한 예외 메세지를 알 수 있다.*/
			System.out.println(e.getMessage());
			
		}catch (NotEnoughMoneyException e) {
			/* 예외클래스명, 예외발생위치, 예외 메세지 등을 stack호출 역순으로 
			 * 빨간색 글씨를 이용해서 로그 형태로 출력해주는 기능
			 * */
			e.printStackTrace();
			
		}
	}
}
