package com.greedy.section03.interfaceImplements;

import java.io.Serializable;

public interface InterProduct extends Serializable{
	
	/* 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용하며 
	 * 이 때는 여러 인터페이스를 다중 상속 받을 수 있다.
	 * */

	/* 인터페이스는 상수 필드만 작성 가능하다.
	 * 
	 * public static final 제어자 조합을 상수 필드
	 * 반드시 선언과 동시에 초기화 해주어야한다.
	 * */
	
	public static final int MAX_NUM = 100;
	/* public static final이 생략되어있다. */
	int MIN_NUM = 10;
	
	/* 인터페이스는 기본 생성자를 가질 수 없다. */
//	public InterProduct() {}
	
	/* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//	public void nonStaticMethod() {}
	
	/* 추상 메서드 작성 가능 */
	public abstract void nonstaticMethod();
//	protected abstract void nonstaticMethod(); // 기본적으로 public abstract
	
	/* public abstract void */
	void abstMethod(); 

	/* 추가된 문법 JDK 1.8 추가된 기능 */
	public static void staticMethod() {
		System.out.println("InterProduct 클래스의 staticMethod 호출됨");
	}
	
	public default void defaultMethod() {
		System.out.println("InterProduct 클래스의 defaultMethod 호출됨");
	}
	
	
}

