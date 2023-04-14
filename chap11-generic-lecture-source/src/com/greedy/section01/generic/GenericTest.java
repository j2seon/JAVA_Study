package com.greedy.section01.generic;

public class GenericTest<T> {
	
	/* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
	 * 관례상 영문 대문자로 작성한다. 
	 * 
	 * 타입변수를 자료형 대신에 사용한 것인데 가장으로 존재하는 타입이며, T가 아닌 다른 영문자르 사용해도 무방
	 * 여러개의 타입변수를 작성할 때는 ,를 이용해서 여러개 기술할 수도 있다.
	 * */
	
	/* 현재는 해당 필드는 타입이 결정되지 않은 상태이다. */
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
