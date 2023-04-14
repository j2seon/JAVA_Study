package com.jjs.test.functionals;


public interface Foo {
	
	void printName();
	
	//만약 추가하게되면 ? 이를 구현한 클래스에서 전부 구현을해줘야하는 상황이 발생한다.
//	void printNameUpperCase();
	
	
	/**
	 * @implSpec 대문자를 출력한다. -> 상세구현 내용에 대해서 적어줘야한다.
	 */
	default	void printNameUpperCase() {
		System.out.println(getName().toUpperCase());
	}
	
	String getName();
}
