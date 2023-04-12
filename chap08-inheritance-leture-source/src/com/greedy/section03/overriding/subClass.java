package com.greedy.section03.overriding;

public class subClass extends SuperClass {

	
	/* 1. 메소드 이름 변경하면 에러
	 * 2. 메소드의 리턴타입 변경하면 에러 발생
	 * 3. 매개변수 갯수나 타입이 변경되면 에러 발생
	 * */
	@Override
	public void method(int num) {}

	/* 4. private 메소드는 오버라이딩 불가*/
//	@Override
//	private void privateMethod() {}
	
	/* 5. final 메소드 오버라이딩 불가 */
//	@Override
//	public final void finalMethod() {}
	
	/* 6. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
//	@Override
//	void protectedMethod() {} // 더 좁은 범위로 불가능
	
	
//	@Override
//	protected void protectedMethod() {} // 같은 범위 가능

	@Override
	public void protectedMethod() {} // 더 넓은 범위 가능
	
	
	
}
