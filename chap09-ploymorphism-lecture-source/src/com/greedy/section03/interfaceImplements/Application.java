package com.greedy.section03.interfaceImplements;

public class Application {

	public static void main(String[] args) {
		
		
		/* 인터페이스(interface)
		 * 자바의 클래스와 유사한 형태이지만 추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
		 * */

		/* 인터페이스의 사용목적
		 * 1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용(표준화)
		 * 2. 자바의 단일 상속의 단점을 극복할 수 있다. (다중 상속처럼 지원)
		 * */

		/* 인터페이스의 사용 목적
		 * 1. 추상클래시와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다(표준화)
		 * 2. 자바의 단일 상속의 단점을 극복할 수 있다.(다중상속처럼 사용가능)
		 * 
		 * */
		
		/* 레퍼런스 타입으로만 사용이 가능하다 */
		InterProduct interProduct = new Product();
		interProduct.abstMethod();
		interProduct.nonstaticMethod();
		
		/* 오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출된다. */
		interProduct.defaultMethod();
		
		/* static 메소드는 인터페이스명.메소드명()으로 호출 */
		InterProduct.staticMethod();
		
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
		
		
	}

}
