package com.greedy.section03.overriding;

/* 클래스에 fianl 붙이면 상속불가*/
public class SuperClass {
	
	/* 오버라이딩?
	 * 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것이다.
	 * 
	 * 오버라이딩 성립요건
	 * 1. 메소드 이름 동일
	 * 2. 메소드 리턴 타입 동일
	 * 3. 매개변수의 타입, 개수, 순서가 동일
	 * 4. private 메소드는 오버라이딩 불가능
	 * 5. final 키워드가 사용된 메소드는 오버라이딩 불가능
	 * 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야한다.
	 * 7. 예외처리는 같은 예외이거나 더 구체적(하위) 예외를 처리해야 함.
	 * */

	public void method(int num) {}
	private void privateMethod() {}
	public final void finalMethod() {} 
	protected void protectedMethod() {} 
	
}
