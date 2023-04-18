package com.greedy.section02.userexception;

public class ExceptionTest {

	public void checkEnoughMoney(int price, int money) 
			throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
// Exception이 최고 조상이기때문에 예외를 전부 받을 수 있지만 세부적인 예외에 대한 내용은 x
//			throws Exception {
		/* 상품 가격이 음수인지 확인하고, 음수인 경우 예외를 발생 시킨다. */
		
		if (price < 0) {
			/* 강제로 예외를 발생시킬 경우
			 * throw 키워드를 사용한다.
			 * */
			
			throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
		}
		
		/* 가진돈이 음수인지 확인하고 음수인 경우 예외 */
		if (money < 0) {
			throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
		}
		
		/* 위의 두 값이 정상 입력되었더라도 상품 가격이 가진 돈 보다 큰 경우 예외 발생 */
		if (money < price) {
			throw new NotEnoughMoneyException("가진 돈보다 상품가격이 더 비쌉니다.");
		}
		
		/* 모든 조건이 만족하는 경우 정상적으로 물건 구입 가능 */
		System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑하세요~");
		
	}
	
	
}
